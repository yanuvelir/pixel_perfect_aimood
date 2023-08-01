package tests.marketsPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class AllPageFirefoxTests extends BaseTest {

    public AllPageFirefoxTests() {
        super("win_firefox");
    }

    // HEADER TEST
    @Test
    public void allHeaderMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_allHeaderMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_allHeaderMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_allHeaderMarketsPage/difference.png");

    }

    @Test
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
                "Screenshots/Markets_page/EnFirefox/Screenshots_tradeNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_tradeNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_tradeNavMarketsPage/difference.png");

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
                "Screenshots/Markets_page/EnFirefox/Screenshots_productsNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_productsNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_productsNavMarketsPage/difference.png");

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
                "Screenshots/Markets_page/EnFirefox/Screenshots_companyNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_companyNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_companyNavMarketsPage/difference.png");

    }

    @Test
    public void profileNavMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
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
        // Login click
        action.clickByXpath("//a[@data-test-id='markets']");
        Thread.sleep(8000);
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='profile']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[4]",
                "Screenshots/Markets_page/EnFirefox/Screenshots_profileNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_profileNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_profileNavMarketsPage/difference.png");

    }

    @Test
    public void marketsTitleMarketsPage() throws IOException, InterruptedException {
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//h1[@class='markets-title']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsTitleMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsTitleMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsTitleMarketsPage/difference.png");
    }

//    @Test
//    public void marketsInfoContainerMarketsPage() throws IOException, InterruptedException {
//        action.openPage("https://dex-trade.com/markets");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='markets-container']");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//ul[@class='markets-info-list']",
//                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsInfoContainerMarketsPage/real_life_screenshot.png",
//                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsInfoContainerMarketsPage/mock_screenshot.png",
//                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsInfoContainerMarketsPage/difference.png");
//    }

    //BODY TEST
    @Test
    public void marketNavMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='market-nav-input-container']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketNavMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketNavMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketNavMarketsPage/difference.png");
    }

    @Test
    public void marketsFilterMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='additional-merkets-filter']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsFilterMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsFilterMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_marketsFilterMarketsPage/difference.png");
    }

    @Test
    public void tableHeadMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//tr[@class='table-head-raw']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_tableHeadMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_tableHeadMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_tableHeadMarketsPage/difference.png");
    }

    @Test
    public void filterListMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@class='additional-filter-list']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_filterListMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_filterListMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_filterListMarketsPage/difference.png");
    }

    //FOOTER TEST
    @Test
    public void allFooterMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_allFooterMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_allFooterMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_allFooterMarketsPage/difference.png");

    }

    @Test
    public void langFooterMarketsPageDropDownPart1() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Click lang
        action.clickByXpath("//div[@data-test-id='lang-footer']");
        // Select En
        action.viewElementByXpath("//div[@data-test-id='en']");
        // Hover En
        action.hoverOverAnElementByID("//div[@data-test-id='en']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_langFooterMarketsPageDropDownPart1/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_langFooterMarketsPageDropDownPart1/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_langFooterMarketsPageDropDownPart1/difference.png");

    }

    @Test
    public void langFooterMarketsPageDropDownPart2() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Click lang
        action.clickByXpath("//div[@data-test-id='lang-footer']");
        // Select Hindi
        action.viewElementByXpath("//div[@data-test-id='hi']");
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='hi']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
                "Screenshots/Markets_page/EnFirefox/Screenshots_langFooterMarketsPageDropDownPart2/real_life_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_langFooterMarketsPageDropDownPart2/mock_screenshot.png",
                "Screenshots/Markets_page/EnFirefox/Screenshots_langFooterMarketsPageDropDownPart2/difference.png");

    }

}
