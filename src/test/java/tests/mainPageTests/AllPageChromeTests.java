package tests.mainPageTests;

import Common.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import tests.base.BaseTest;
import org.openqa.selenium.Dimension;

import java.io.IOException;

public class AllPageChromeTests extends BaseTest{
	public AllPageChromeTests() {
		super("win_chrome");
	}

	//HEADER TESTS
    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@class=\"join-link\"]");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[text()='Got it']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.fullPage(ScShotDir+"Main_page/EnChrome/Screenshots_allHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_allHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_allHeaderMainPage/difference.png");

    }

//    @Test(priority = 2)
//    public void tradeNavMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='main-slider-pad']");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Hover
//        action.hoverOverAnElementByXpath("(//li[@class='header-nav-item item-relative'])[1]");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[1]",
//                "Screenshots/Main_page/EnChrome/Screenshots_tradeNavMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_tradeNavMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_tradeNavMainPage/difference.png");
//
//    }
//
//    @Test(priority = 3)
//    public void productsNavMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='main-slider-pad']");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Hover
//        action.hoverOverAnElementByXpath("//li[@data-test-id='products']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[2]",
//                "Screenshots/Main_page/EnChrome/Screenshots_productsNavMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_productsNavMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_productsNavMainPage/difference.png");
//
//    }
//
//    @Test(priority = 4)
//    public void companyNavMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='main-slider-pad']");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Hover
//        action.hoverOverAnElementByXpath("//li[@data-test-id='company']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[3]",
//                "Screenshots/Main_page/EnChrome/Screenshots_companyNavMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_companyNavMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_companyNavMainPage/difference.png");
//
//    }
//
//
//    @Test(priority = 5)
//    public void langDropDownNavMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='main-slider-pad']");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        // Click "English" button
//        action.clickByXpath("//div[@data-test-id='lang dropdown']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container']",
//                "Screenshots/Main_page/EnChrome/Screenshots_langDropDownNavMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_langDropDownNavMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_langDropDownNavMainPage/difference.png");
//
//    }
//
//    //BODY TESTS
//    @Test(priority = 6)
//    public void mainBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='main-block-container']",
//                "Screenshots/Main_page/EnChrome/Screenshots_mainBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_mainBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_mainBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 7)
//    public void statisticBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@class='main-statistic-container']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        action.changeElementText("(//h3[@class='main-statistic-title'])[1]", "'$123 Million'");//"$123 Million"
//        action.changeElementText("(//h3[@class='main-statistic-title'])[2]", "'331+'");
//        action.changeElementText("(//h3[@class='main-statistic-title'])[3]", "'301K+'");
//        action.changeElementText("(//h3[@class='main-statistic-title'])[4]", "'221K+'");
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='main-statistic-container']",
//                "Screenshots/Main_page/EnChrome/Screenshots_statisticBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_statisticBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_statisticBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 8)
//    public void sliderPadBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@id='tns1-ow']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@id='tns1-ow']",
//                "Screenshots/Main_page/EnChrome/Screenshots_sliderPadBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_sliderPadBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_sliderPadBlockMainPage/difference.png");
//
//    }
//
//
//
//    @Test(priority = 9)
//    public void marketBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@id='tns1-ow']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
////        Thread.sleep(1000);
//        // Change Element "Price"
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[1]", "'$26,888.66'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[2]", "'$1,731.94'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[3]", "'$240.40'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[4]", "'$0.48'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[5]", "'$0.46'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[6]", "'$0.06'");
//        //Time
////        Thread.sleep(1000);
//        // Change Element "24h Change"
//        action.changeElementText("(//span[@class='din-pro-font'])[1]", "'1.34%'");
//        action.changeElementText("(//span[@class='din-pro-font'])[2]", "'0.17%'");
//        action.changeElementText("(//span[@class='din-pro-font'])[3]", "'1.40%'");
//        action.changeElementText("(//span[@class='din-pro-font'])[4]", "'1.40%'");
//        action.changeElementText("(//span[@class='din-pro-font'])[5]", "'0.65%'");
//        action.changeElementText("(//span[@class='din-pro-font'])[6]", "'0.55%'");
//        //Time
////        Thread.sleep(1000);
//        // Change Element "Market Cap"
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[1]", "'$521 B'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[2]", "'$208 B'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[3]", "'$37.5 B'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[4]", "'$25.1 B'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[5]", "'$9.11 B'");
//        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[6]", "'$8.65 B'");
//        //Time
////        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='main-market-wrapper']/div[@class='main-market-container']",
//                "Screenshots/Main_page/EnChrome/Screenshots_marketBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_marketBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_marketBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 10)
//    public void marketTitleBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@id='tns1-ow']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='market-title-container']",
//                "Screenshots/Main_page/EnChrome/Screenshots_marketTitleBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_marketTitleBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_marketTitleBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 11)
//    public void quickBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@class='market-link-container']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='quick-container']",
//                "Screenshots/Main_page/EnChrome/Screenshots_quickBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_quickBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_quickBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 12)
//    public void terminalBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@class='trading-terminal ieo-terminal']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='trading-terminal ieo-terminal']",
//                "Screenshots/Main_page/EnChrome/Screenshots_terminalBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_terminalBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_terminalBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 13)
//    public void getStartedBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("(//button[@class='ds-btn ds-btn-primary large'])[2]");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='get-started']",
//                "Screenshots/Main_page/EnChrome/Screenshots_getStartedBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_getStartedBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_getStartedBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 14)
//    public void ieoBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("(//button[@class='ds-btn ds-btn-primary large'])[3]");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='trading-terminal trading-pad']/div[@class='container']",
//                "Screenshots/Main_page/EnChrome/Screenshots_ieoBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_ieoBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_ieoBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 15)
//    public void tradePlatformBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("(//button[@class='ds-btn ds-btn-primary large'])[4]");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='right-nav']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='trade-on']",
//                "Screenshots/Main_page/EnChrome/Screenshots_tradePlatformBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_tradePlatformBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_tradePlatformBlockMainPage/difference.png");
//
//    }
//
//    @Test(priority = 16)
//    public void whyCompanyBlockMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@class='app-btn']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='why-company']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='why-company']/div[@class='container']",
//                "Screenshots/Main_page/EnChrome/Screenshots_whyCompanyBlockMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_whyCompanyBlockMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_whyCompanyBlockMainPage/difference.png");
//
//    }
//
//
//    //FOOTER TESTS
//    @Test(priority = 17)
//    public void allFooterMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//footer[@class='footer']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//footer[@class='footer']",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterMainPage/difference.png");
//
//    }
//
//    @Test(priority = 18)
//    public void allFooterTopMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//footer[@class='footer']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='footer__top']",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterTopMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterTopMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterTopMainPage/difference.png");
//
//    }
//
//    @Test(priority = 19)
//    public void allFooterBottomMainPage() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//footer[@class='footer']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='footer__bottom']",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterBottomMainPage/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterBottomMainPage/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_allFooterBottomMainPage/difference.png");
//
//    }
//
//    @Test(priority = 20)
//    public void langFooterMainPageDropDownPart1() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//footer[@class='footer']");
//        // Click lang
//        action.clickByXpath("//div[@data-test-id='lang-footer']");
//        // Select En
//        action.viewElementByXpath("//div[@data-test-id='en']");
//        // Hover En
//        action.hoverOverAnElementByID("//div[@data-test-id='en']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
//                "Screenshots/Main_page/EnChrome/Screenshots_langFooterMainPageDropDownPart1/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_langFooterMainPageDropDownPart1/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_langFooterMainPageDropDownPart1/difference.png");
//
//    }
//
//    @Test(priority = 21)
//    public void langFooterMainPageDropDownPart2() throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com");
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
//        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//footer[@class='footer']");
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//footer[@class='footer']");
//        // Click lang
//        action.clickByXpath("//div[@data-test-id='lang-footer']");
//        // Select Hindi
//        action.viewElementByXpath("//div[@data-test-id='hi']");
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-test-id='hi']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
//                "Screenshots/Main_page/EnChrome/Screenshots_langFooterMainPageDropDownPart2/real_life_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_langFooterMainPageDropDownPart2/mock_screenshot.png",
//                "Screenshots/Main_page/EnChrome/Screenshots_langFooterMainPageDropDownPart2/difference.png");
//
//    }
}
