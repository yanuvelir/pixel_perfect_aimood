package tests.demoTradingPageTest;

import Common.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageFirefoxTests extends BaseTest {

    public AllPageFirefoxTests() {
        super("win_firefox");
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;

    //HEADER TESTS
    @Test
    public void allHeaderDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allHeaderDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allHeaderDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allHeaderDemoPage/difference.png");

    }

    @Test
    public void tradeNavDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("(//li[@class='header-nav-item item-relative'])[1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[1]",
                "Screenshots/Demo_page/EnFirefox/Screenshots_tradeNavDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_tradeNavDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_tradeNavDemoPage/difference.png");

    }

    @Test
    public void productsNavDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='products']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[2]",
                "Screenshots/Demo_page/EnFirefox/Screenshots_productsNavDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_productsNavDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_productsNavDemoPage/difference.png");

    }

    @Test
    public void companyNavDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='company']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[3]",
                "Screenshots/Demo_page/EnFirefox/Screenshots_companyNavDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_companyNavDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_companyNavDemoPage/difference.png");

    }

    @Test
    public void profileNavDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Login click
        action.clickByXpath("//a[@data-test-id='header login']");
        //Input a text into the selected element
        action.InputTextByXpath("//input[@type='email']", "qawpt@grr.la");
        //Input a text to the next element
        action.InputTextByXpath("//input[@type='password']", "@1Dexprod20");
        // Click "Log In" button
        action.clickByID("//button[@data-test-id='login btn']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("(//li[@class='header-nav-item item-relative'])[1]");
        // Login click
        action.clickByXpath("//a[@data-test-id='demo trading']");
        Thread.sleep(6000);
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='profile']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[4]",
                "Screenshots/Demo_page/EnFirefox/Screenshots_profileNavDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_profileNavDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_profileNavDemoPage/difference.png");

    }
    //BODY TESTS
    @Test
    public void demoContainerDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='demo-container'])[1]",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerDemoPage/difference.png");

    }

    @Test
    public void demoContainerTopDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='demo-trade-header__top']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerTopDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerTopDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerTopDemoPage/difference.png");

    }

    @Test
    public void demoContainerBottomDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='demo-trade-header__bottom']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerBottomDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerBottomDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoContainerBottomDemoPage/difference.png");

    }

    @Test
    public void demoTradeInfoDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='demo-trade-info-wrapper']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='demo-trade-info-wrapper']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoDemoPage/difference.png");

    }

    @Test
    public void demoTradeInfoTopDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='demo-trade-info-wrapper']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='demo-trade-info__top']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoTopDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoTopDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoTopDemoPage/difference.png");

    }

    @Test
    public void demoTradeInfoBottomDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='demo-trade-info-wrapper']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='demo-trade-info__bottom']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoBottomDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoBottomDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeInfoBottomDemoPage/difference.png");

    }

    @Test
    public void demoTradeMarketsDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='demo-trade-markets']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='demo-trade-markets']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsDemoPage/difference.png");

    }

    @Test
    public void demoTradeMarketsTitleDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='demo-trade-markets']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//h3[@class='demo-trade-title']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTitleDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTitleDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTitleDemoPage/difference.png");

    }

    @Test
    public void demoTradeMarketsTableDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='demo-trade-markets']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='markets-all-container']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTableDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTableDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTableDemoPage/difference.png");

    }

    @Test
    public void demoTradeMarketsTableFiltersDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='demo-trade-markets']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//tr[@class='table-head-raw']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTableFiltersDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTableFiltersDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeMarketsTableFiltersDemoPage/difference.png");

    }

    @Test
    public void demoTradeFaqDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='demo-trade-faq']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='demo-trade-faq']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeFaqDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeFaqDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_demoTradeFaqDemoPage/difference.png");

    }

    @Test
    public void getAppDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='get-app']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='get-app']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppDemoPage/difference.png");

    }

    @Test
    public void getAppContainerDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='get-app']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='get-app-container']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppContainerDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppContainerDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppContainerDemoPage/difference.png");

    }

    @Test
    public void getAppPhoneDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//div[@class='get-app']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='get-app-phone']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppPhoneDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppPhoneDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_getAppPhoneDemoPage/difference.png");

    }

    //FOOTER TESTS
    @Test
    public void allFooterDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        //action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//footer[@class='footer']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterDemoPage/difference.png");

    }

    @Test
    public void allFooterTopDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //This will scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//footer[@class='footer']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='footer__top']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterTopDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterTopDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterTopDemoPage/difference.png");

    }

    @Test
    public void allFooterBottomDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //This will scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
        //Find element by link xpath and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath("//footer[@class='footer']"));
        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='footer__bottom']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterBottomDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterBottomDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_allFooterBottomDemoPage/difference.png");

    }

    //HELP CRUNCH
    @Test
    public void helpCrunchDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //This will scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
        driver.switchTo().frame("helpcrunch-iframe");
        action.clickByXpath("//div[@class='hcw-widget__button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-start-screen helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchDemoPage/difference.png");

    }

    @Test
    public void helpCrunchStartConversationDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //This will scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
        // Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        // Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        // Клік кнопки Start Conversation
        action.clickByXpath("//div[@class='hcw-start-screen-compact__item']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-chat helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchStartConversationDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchStartConversationDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchStartConversationDemoPage/difference.png");

    }

    @Test
    public void chatTextAreaDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //This will scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
        // Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        // Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        // Клік кнопки Start Conversation
        action.clickByXpath("//div[@class='hcw-start-screen-compact__item']");
        // ввести текст в інпут
        action.InputTextByXpath("//textarea[@id='helpcrunchChatTextarea']", "Hello, test message.");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-chat helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_chatTextAreaDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_chatTextAreaDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_chatTextAreaDemoPage/difference.png");

    }

    @Test
    public void chatSendMessageDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //This will scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
        // Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        // Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        // Клік кнопки Start Conversation
        action.clickByXpath("//div[@class='hcw-start-screen-compact__item']");
        // ввести текст в інпут
        action.InputTextByXpath("//textarea[@id='helpcrunchChatTextarea']", "Hello, test message.");
        // Click Send button Send
        action.clickByXpath("//button[@class='hcw-message-form__send']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-chat helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_chatSendMessageDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_chatSendMessageDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_chatSendMessageDemoPage/difference.png");

    }

    @Test
    public void helpCrunchKnowledgeBaseDemoPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/demo-trade");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //This will scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
        // Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        // Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        // Клік кнопки Start Conversation
        action.clickByXpath("(//div[@class='hcw-start-screen-compact__item'])[4]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-knowledge-base helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchKnowledgeBaseDemoPage/real_life_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchKnowledgeBaseDemoPage/mock_screenshot.png",
                "Screenshots/Demo_page/EnFirefox/Screenshots_helpCrunchKnowledgeBaseDemoPage/difference.png");

    }


}
