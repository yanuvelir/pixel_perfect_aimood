package pages.pixel_perfect;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.*;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class PixelPerfectAssert {
    protected WebDriver driver;

    public PixelPerfectAssert(WebDriver driver) {
        this.driver = driver;
    }

    public void byElement(String ElementXpath, String RealLifeScreenShotPath, String MockFilePath,
                          String DifferenceFilePath) throws InterruptedException,
            IOException {
        //setBrowserWindowSize(resolution);  // new method to set browser window size

        Thread.sleep(3000);

        WebElement inputWrapper = driver.findElement(By.xpath(ElementXpath));//"input-wrap"

        try {
            File screenshotFile = inputWrapper.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File
                    (RealLifeScreenShotPath);
            // To install new screenshots recommit MockFilePath
//                    (MockFilePath);
            Files.move(screenshotFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            if (!destinationFile.exists()) {
                destinationFile.createNewFile();
            }
        } catch (
                IOException e) {
            System.out.println("*** File exists ***");
        }

        BufferedImage image1 = ImageIO.read(new File(MockFilePath));
        BufferedImage image2 = ImageIO.read(new File(RealLifeScreenShotPath));

        // Resize the images to the same size for comparison
        int width = Math.min(image1.getWidth(), image2.getWidth());
        int height = Math.min(image1.getHeight(), image2.getHeight());
        image1 = scaleImage(image1, width, height);
        image2 = scaleImage(image2, width, height);

        // Convert the images to grayscale
        BufferedImage grayscaleImage1 = toGrayscale(image1);
        BufferedImage grayscaleImage2 = toGrayscale(image2);

        // Calculate the average brightness of each pixel in the grayscale images
        double averageBrightness1 = calculateAverageBrightness(grayscaleImage1);
        double averageBrightness2 = calculateAverageBrightness(grayscaleImage2);

        // Calculate the difference in average brightness between the two images
        double brightnessDifference = Math.abs(averageBrightness1 - averageBrightness2);

        // Print the result
        if (brightnessDifference < 0.005) {
            System.out.println("The two images are similar.");
        } else {
            System.out.println("The two images are not similar.");

            // Get the RGB values of each pixel in the two images
            int[] pixels1 = new int[width * height];
            int[] pixels2 = new int[width * height];
            PixelGrabber grabber1 = new PixelGrabber(image1, 0, 0, width, height, pixels1, 0, width);
            PixelGrabber grabber2 = new PixelGrabber(image2, 0, 0, width, height, pixels2, 0, width);
            try {
                grabber1.grabPixels();
                grabber2.grabPixels();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Create a new image to highlight the difference
            BufferedImage differenceImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D graphics = differenceImage.createGraphics();
            graphics.drawImage(image1, 0, 0, null);

            // Compare the RGB values of each pixel in the two images
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int index = y * width + x;
                    if (pixels1[index] != pixels2[index]) {
                        graphics.setColor(Color.RED);
                        graphics.drawRect(x - 2, y - 2, 1, 1); // highlight the area around the different pixel
                    }
                }
            }
            graphics.dispose();

            // Save the difference image to a file
            File differenceFile = new File(DifferenceFilePath);
            ImageIO.write(differenceImage, "png", differenceFile);

            // Print a message indicating where the difference was found
            System.out.println("Difference found. See the file " + differenceFile.getAbsolutePath() + " for details.");
        }
        Assert.assertTrue(brightnessDifference < 0.005, "*** Images are not similar ***");
        Thread.sleep(500);
//        driver.quit();
    }

    public void fullPage(String RealLifeScreenShotPath, String MockFilePath,
                         String DifferenceFilePath) throws InterruptedException,
            IOException {

//        setBrowserWindowSize(resolution);  // new method to set browser window size

        Thread.sleep(1500);

        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destinationFile = new File
                    (RealLifeScreenShotPath);
            // To install new screenshots recommit MockFilePath
//                    (MockFilePath);
            Files.move(screenshotFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            if (!destinationFile.exists()) {
                destinationFile.createNewFile();
            }
        } catch (
                IOException e) {
            System.out.println("*** File exists ***");
        }

        BufferedImage image1 = ImageIO.read(new File(MockFilePath));
        BufferedImage image2 = ImageIO.read(new File(RealLifeScreenShotPath));

        // Resize the images to the same size for comparison
        int width = Math.min(image1.getWidth(), image2.getWidth());
        int height = Math.min(image1.getHeight(), image2.getHeight());
        image1 = scaleImage(image1, width, height);
        image2 = scaleImage(image2, width, height);

        // Convert the images to grayscale
        BufferedImage grayscaleImage1 = toGrayscale(image1);
        BufferedImage grayscaleImage2 = toGrayscale(image2);

        // Calculate the average brightness of each pixel in the grayscale images
        double averageBrightness1 = calculateAverageBrightness(grayscaleImage1);
        double averageBrightness2 = calculateAverageBrightness(grayscaleImage2);

        // Calculate the difference in average brightness between the two images
        double brightnessDifference = Math.abs(averageBrightness1 - averageBrightness2);

        // Print the result
        if (brightnessDifference < 0.005) {
            System.out.println("The two images are similar.");
        } else {
            System.out.println("The two images are not similar.");

            // Get the RGB values of each pixel in the two images
            int[] pixels1 = new int[width * height];
            int[] pixels2 = new int[width * height];
            PixelGrabber grabber1 = new PixelGrabber(image1, 0, 0, width, height, pixels1, 0, width);
            PixelGrabber grabber2 = new PixelGrabber(image2, 0, 0, width, height, pixels2, 0, width);
            try {
                grabber1.grabPixels();
                grabber2.grabPixels();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Create a new image to highlight the difference
            BufferedImage differenceImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D graphics = differenceImage.createGraphics();
            graphics.drawImage(image1, 0, 0, null);

            // Compare the RGB values of each pixel in the two images
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int index = y * width + x;
                    if (pixels1[index] != pixels2[index]) {
                        graphics.setColor(Color.RED);
                        graphics.drawRect(x - 2, y - 2, 1, 1); // highlight the area around the different pixel
                    }
                }
            }
            graphics.dispose();

            // Save the difference image to a file
            File differenceFile = new File(DifferenceFilePath);
            ImageIO.write(differenceImage, "png", differenceFile);

            // Print a message indicating where the difference was found
            System.out.println("Difference found. See the file " + differenceFile.getAbsolutePath() + " for details.");
        }
        Assert.assertTrue(brightnessDifference < 0.005, "*** Images are not similar ***");
        //        Thread.sleep(500);
//        driver.quit();
    }


    private static BufferedImage scaleImage(BufferedImage image, int width, int height) {
        BufferedImage scaledImage = new BufferedImage(width, height, image.getType());
        scaledImage.getGraphics().drawImage(image, 0, 0, width, height, null);
        return scaledImage;
    }

    private static BufferedImage toGrayscale(BufferedImage image) {
        BufferedImage grayscaleImage = new BufferedImage(image.getWidth(),
                image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        grayscaleImage.getGraphics().drawImage(image, 0, 0, null);
        return grayscaleImage;
    }

    private static double calculateAverageBrightness(BufferedImage image) {
        double sum = 0;
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                Color color = new Color(image.getRGB(x, y));
                double brightness = (color.getRed() + color.getGreen() + color.getBlue()) / 3.0;
                sum += brightness;
            }
        }
        return sum / (image.getWidth() * image.getHeight());

    }

    public void Assert(Double brightnessDifference) {
        Assert.assertTrue(brightnessDifference < 0.005, "*** Images are not similar ***");

    }

    private void setBrowserWindowSize(String resolution) {
        switch (resolution) {
            case "FULL HD":
                driver.manage().window().setSize(new Dimension(1920, 1080));
                break;
            case "mac 16":
                driver.manage().window().setSize(new Dimension(1728, 1117));
                break;
            case "mac 14":
                driver.manage().window().setSize(new Dimension(1512, 982));
                break;

            // You can add more case statements for other predefined resolutions
            default:
                throw new IllegalArgumentException("Unsupported resolution: " + resolution);
        }

    }
}
