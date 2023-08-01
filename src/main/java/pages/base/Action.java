package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.EXPLICIT_WAIT;

public class Action {

    protected WebDriver driver;

    public Action(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String url) {
        driver.get(url);
    }


    public WebElement findElementByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        return element;
    }

    public WebElement findElementByID(String id) {
        WebElement element = driver.findElement(By.xpath(id));
        return element;
    }

    public void waitElementIsVisible(String xpath) {
        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).
                until(ExpectedConditions.visibilityOf(findElementByXpath(xpath)));
    }

    public void pause(int milliSeconds) throws InterruptedException {
        Thread.sleep(milliSeconds);
    }

    public void inputText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void InputTextByXpath(String xpath, String text) {
        WebElement element = findElementByXpath(xpath);
        inputText(element, text);
    }

    public void InputTextByID(String id, String text) {
        WebElement element = findElementByXpath(id);
        inputText(element, text);
    }

    public void clickByXpath(String xpath) {
        WebElement element = findElementByXpath(xpath);
        element.click();
    }

    public void clickByID(String id) {
        WebElement element = findElementByXpath(id);
        element.click();
    }

    public void hoverOverAnElementByXpath(String xpath) {
        Actions action = new Actions(driver);
        action.moveToElement(findElementByXpath(xpath)).perform();
    }

    public void hoverOverAnElementByID(String id) {
        Actions action = new Actions(driver);
        action.moveToElement(findElementByXpath(id)).perform();
    }

    public void scrollPage(String Scroll_to_pointed_pixel) {
        // Проскролить страницу на определенное количество пикселей
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo" + "(" + Scroll_to_pointed_pixel + ")");//"window.scrollBy(0,500)"
    }

        public WebElement viewElementByXpath(String xpath) {
        WebElement element = findElementByXpath(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        return element;
    }

    public void moveViewableElementIntoCenter(String xpath){
        WebElement element = findElementByXpath(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -window.innerHeight / 2);", element);
    }

    public void moveViewableElementIntoCenter2(String xpath){
        WebElement element = findElementByXpath(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
    }

    public void ifButtonIsPresentClick(String xpath) throws InterruptedException {
        try {
            WebElement cookiesBtn = findElementByXpath(xpath);
            cookiesBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ifWalletButtonIsPresentThenLogout() throws InterruptedException {
        try {
            WebElement WalletBtn = findElementByXpath("//li[@data-test-id=\"wallet\"]");
            Actions action = new Actions(driver);
            action.moveToElement(findElementByXpath("//div[@data-test-id=\"profile\"]")).perform();
            WebElement LogOutBtn = findElementByXpath("//button[@data-test-id=\"logout\"]");
            LogOutBtn.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeElementText(String xpath, String text) {
        WebElement element = findElementByXpath(xpath);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].textContent =" + text, element);
        String getText = element.getText();
        System.out.println(getText);
    }

    @Parameters({"main_page"})
    public void loggedAsQaWptUser(String main_page) throws InterruptedException {
        //Open a page for test
        openPage(main_page);
        //Waiting when the page is completely loaded
        waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        ifButtonIsPresentClick("//button[@class='close-button']");
        //Timeout
        Thread.sleep(1000);
        // Login click
        clickByXpath("//a[@class='login-link']");
        //Input a text into the selected element
        InputTextByXpath("//input[@type='email']", "yanautomte.st.6@gmail.com");
        //Input a text to the next element
        InputTextByXpath("//input[@type='password']", "Vinnitsa-2022");
        // Click "Log In" button
        clickByXpath("//button[@data-test-id='login btn']");
        Thread.sleep(5000);
        waitElementIsVisible("//div[@class='right-nav']");
        //Timeout
//        Thread.sleep(2000);
    }

}
