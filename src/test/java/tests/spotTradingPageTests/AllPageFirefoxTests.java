package tests.spotTradingPageTests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageFirefoxTests extends BaseTest {

    public AllPageFirefoxTests() {
        super("win_firefox");
    }
    JavascriptExecutor js = (JavascriptExecutor) driver;

    //HEADER TESTS
    @Test
    public void allHeaderSpotTradingPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/spot/trading/BTCUSDT");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_allHeaderSpotTradingPage/real_life_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_allHeaderSpotTradingPage/mock_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_allHeaderSpotTradingPage/difference.png");

    }

    @Test
    public void tradeNavSpotTradingPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/spot/trading/BTCUSDT");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("(//li[@class='header-nav-item item-relative'])[1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[1]",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_tradeNavSpotTradingPage/real_life_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_tradeNavSpotTradingPage/mock_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_tradeNavSpotTradingPage/difference.png");

    }

    @Test
    public void productsNavSpotTradingPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/spot/trading/BTCUSDT");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='products']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[2]",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_productsNavSpotTradingPage/real_life_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_productsNavSpotTradingPage/mock_screenshot.png",
                "Screenshots/DSpot_Trading_page/EnFirefox/Screenshots_productsNavSpotTradingPage/difference.png");

    }

    @Test
    public void companyNavSpotTradingPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/spot/trading/BTCUSDT");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='company']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[3]",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_companyNavSpotTradingPage/real_life_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_companyNavSpotTradingPage/mock_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_companyNavSpotTradingPage/difference.png");

    }

    @Test
    public void profileNavSpotTradingPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/spot/trading/BTCUSDT");
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
        action.clickByXpath("//a[@data-test-id='spot trading']");
        Thread.sleep(6000);
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='profile']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[4]",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_profileNavSpotTradingPage/real_life_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_profileNavSpotTradingPage/mock_screenshot.png",
                "Screenshots/Spot_Trading_page/EnFirefox/Screenshots_profileNavSpotTradingPage/difference.png");

    }



}
