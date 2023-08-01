package tests.marketsPageTests;

import org.testng.annotations.Test;
import tests.RetryAnalyzer;
import tests.base.BaseTest;

import java.io.IOException;

public class HeaderTests extends BaseTest {
    public HeaderTests() {
        super("win_chrome");
    }

    @Test//(retryAnalyzer = RetryAnalyzer.class)
    public void allHeaderMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        action.pause(3000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                "Screenshots/Markets_page/EnChrome/Screenshots_allHeaderMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_allHeaderMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_allHeaderMarketsPage/difference.png");

    }

    @Test//(retryAnalyzer = RetryAnalyzer.class)
    public void tradeNavMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("(//li[@class='header-nav-item item-relative'])[1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[1]",
                "Screenshots/Markets_page/EnChrome/Screenshots_tradeNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_tradeNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_tradeNavMarketsPage/difference.png");

    }

    @Test
    public void productsNavMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='products']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[2]",
                "Screenshots/Markets_page/EnChrome/Screenshots_productsNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_productsNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_productsNavMarketsPage/difference.png");

    }

    @Test
    public void companyNavMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='company']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[3]",
                "Screenshots/Markets_page/EnChrome/Screenshots_companyNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_companyNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_companyNavMarketsPage/difference.png");

    }

//    @Test
//    public void profileNavMarketsPage() throws IOException, InterruptedException {
//        //Open a page for test
//        action.openPage("https://dex-trade.com/markets");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//a[@data-test-id='header login']");
//        //Click button "Accept" use of cookies
//        action.clickByXpath("//button[@class='close-button']");
//        // Login click
//        action.clickByXpath("//a[@data-test-id='header login']");
//        //Input a text into the selected element
//        action.InputTextByXpath("//input[@type='email']", "qawpt@grr.la");
//        //Input a text to the next element
//        action.InputTextByXpath("//input[@type='password']", "@1Dexprod20");
//        // Click "Log In" button
//        action.clickByID("//button[@data-test-id='login btn']");
//        // Login click
//        action.clickByXpath("//a[@data-test-id='markets']");
//        Thread.sleep(6000);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-test-id='profile']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[4]",
//                "Screenshots/Markets_page/EnChrome/Screenshots_profileNavMarketsPage/real_life_screenshot.png",
//                "Screenshots/Markets_page/EnChrome/Screenshots_profileNavMarketsPage/mock_screenshot.png",
//                "Screenshots/Markets_page/EnChrome/Screenshots_profileNavMarketsPage/difference.png");
//
//    }
//
//    @Test
//    public void marketsTitleMarketsPage() throws IOException, InterruptedException {
//        action.openPage("https://dex-trade.com/markets");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='markets-container']");
//        //Click button "Accept" use of cookies
//        action.clickByXpath("//button[@class='close-button']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//h1[@class='markets-title']",
//                    "Screenshots/Markets_page/EnChrome/Screenshots_marketsTitleMarketsPage/real_life_screenshot.png",
//                    "Screenshots/Markets_page/EnChrome/Screenshots_marketsTitleMarketsPage/mock_screenshot.png",
//                    "Screenshots/Markets_page/EnChrome/Screenshots_marketsTitleMarketsPage/difference.png");
//    }
//
//    @Test
//    public void marketsInfoContainerMarketsPage() throws IOException, InterruptedException {
//        action.openPage("https://dex-trade.com/markets");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='markets-container']");
//        //Click button "Accept" use of cookies
//        action.clickByXpath("//button[@class='close-button']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//ul[@class='markets-info-list']",
//                "Screenshots/Markets_page/EnChrome/Screenshots_marketsInfoContainerMarketsPage/real_life_screenshot.png",
//                "Screenshots/Markets_page/EnChrome/Screenshots_marketsInfoContainerMarketsPage/mock_screenshot.png",
//                "Screenshots/Markets_page/EnChrome/Screenshots_marketsInfoContainerMarketsPage/difference.png");
//    }

}
