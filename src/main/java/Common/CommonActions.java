package Common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    private static WebDriver driver;

    public static WebDriver createDriver(String platformAndBrowser) {
        if (driver != null) {
            return driver;
        }

        String platform = extractPlatformFromPlatformAndBrowser(platformAndBrowser);
        String browser = extractBrowserFromPlatformAndBrowser(platformAndBrowser);

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions co = new ChromeOptions();
                co.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(co);
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "safari":
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
                break;

            default:
                Assert.fail("Incorrect platform or browser name: " + platformAndBrowser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }

    public static void resetDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private static String extractPlatformFromPlatformAndBrowser(String platformAndBrowser) {
        String[] parts = platformAndBrowser.split("_");
        if (parts.length == 2) {
            return parts[0];
        } else {
            Assert.fail("Invalid platform and browser format: " + platformAndBrowser);
            return null;
        }
    }

    private static String extractBrowserFromPlatformAndBrowser(String platformAndBrowser) {
        String[] parts = platformAndBrowser.split("_");
        if (parts.length == 2) {
            return parts[1];
        } else {
            Assert.fail("Invalid platform and browser format: " + platformAndBrowser);
            return null;
        }
    }

    public static void setBrowserWindowSize(String resolution) {
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
            // Add more case statements for other predefined resolutions if needed
            default:
                throw new IllegalArgumentException("Unsupported resolution: " + resolution);
        }
    }
}

