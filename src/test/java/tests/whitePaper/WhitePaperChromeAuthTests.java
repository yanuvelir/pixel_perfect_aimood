package tests.whitePaper;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class WhitePaperChromeAuthTests extends BaseTest {
    public WhitePaperChromeAuthTests() {
        super("win_chrome");
    }

    //HEADER TESTS
//    @Parameters({"main_page"})
//    @Test(priority = 1)
//    public void loginInToTheDexTrade(String main_page) throws InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("FULL HD");
//        // Authorization
//        action.loggedAsQaWptUser(main_page);
//        //Timeout
//        //Thread.sleep(4000);
//        action.pause(4000);
//    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 2)
    public void allHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Timeout
        Thread.sleep(1000);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 3)
    public void tradeNavMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Timeout
        Thread.sleep(1000);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("(//li[@class='header-nav-item item-relative'])[1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[1]",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_tradeNavMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_tradeNavMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_tradeNavMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 4)
    public void productsNavMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Timeout
        Thread.sleep(1000);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='products']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[2]",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_productsNavMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_productsNavMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_productsNavMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 5)
    public void companyNavMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Timeout
        Thread.sleep(1000);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='company']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[3]",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_companyNavMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_companyNavMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_companyNavMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 6)
    public void walletNavMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Timeout
        Thread.sleep(1000);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='wallet']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[4]",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_walletNavMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_walletNavMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_walletNavMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 7)
    public void profileNavMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Timeout
        Thread.sleep(1000);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='profile']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[5]",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_profileNavMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_profileNavMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_profileNavMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 8)
    public void langDropDownNavMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Timeout
        Thread.sleep(1000);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Click "English" button
        action.clickByXpath("//div[@data-test-id='lang dropdown']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langDropDownNavMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langDropDownNavMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langDropDownNavMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    //BODY TESTS
    @Test(priority = 9)
    public void mainBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@class='main-slider-pad']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='main-block-container']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_mainBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_mainBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_mainBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 10)
    public void statisticBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@class='main-block-container']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Timeout
        Thread.sleep(2000);
        // block 1
        action.changeElementText("(//span[@class='mr-right-8 pair-slider-iso'])[1]", "'BTC/USDT'");
        action.changeElementText("(//span[@class='mr-right-4 din-pro-font slider-text-red'])[1]", "'0.15%'");
        action.changeElementText("(//div[@class='slide-pair-rate din-pro-font'])[1]", "'30360.19'");
        action.changeElementText("(//span[@class='din-pro-font rate-usd-size statistic-usd-style'])[1]", "'$30,360.19'");
        // block 2
        action.changeElementText("(//span[@class='mr-right-8 pair-slider-iso'])[2]", "'ETH/USDT'");
        action.changeElementText("(//span[@class='mr-right-4 din-pro-font slider-text-red'])[2]", "'1.03%'");
        action.changeElementText("(//div[@class='slide-pair-rate din-pro-font'])[2]", "'1873.23'");
        action.changeElementText("(//span[@class='din-pro-font rate-usd-size statistic-usd-style'])[2]", "'$1,873.23'");
        // block 3
        action.changeElementText("(//span[@class='mr-right-8 pair-slider-iso'])[3]", "'XRP/USDT'");
        action.changeElementText("(//span[@class='mr-right-4 din-pro-font slider-text-red'])[3]", "'1.24%'");
        action.changeElementText("(//div[@class='slide-pair-rate din-pro-font'])[3]", "'0.4784'");
        action.changeElementText("(//span[@class='din-pro-font rate-usd-size statistic-usd-style'])[3]", "'$0.47'");
        // block 4
        action.changeElementText("(//span[@class='mr-right-8 pair-slider-iso'])[4]", "'P2PS/ETH'");
        action.changeElementText("(//span[@class='mr-right-4 din-pro-font slider-text-red'])[4]", "'0.24%'");
        action.changeElementText("(//div[@class='slide-pair-rate din-pro-font'])[4]", "'0.05024'");
        action.changeElementText("(//span[@class='din-pro-font rate-usd-size statistic-usd-style'])[4]", "'$94.13'");
        //Timeout
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='main-statistic-container'])[2]",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_statisticBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_statisticBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_statisticBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 11)
    public void sliderPadBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
//        action.viewElementByXpath("//div[@id='tns1-ow']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@id='tns1-ow']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_sliderPadBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_sliderPadBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_sliderPadBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 12)
    public void marketBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Move viewable Element Into center
        action.moveViewableElementIntoCenter2("//div[@class='table-home__wrapper']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        // Change Element "Price"
        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[1]", "'$26,888.66'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[2]", "'$1,731.94'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[3]", "'$240.40'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[4]", "'$0.48'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[5]", "'$0.46'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color desctop-visible-container din-pro-font'])[6]", "'$0.06'");
        //Time
        Thread.sleep(1000);
        // Change Element "24h Change"
        action.changeElementText("(//span[@class='din-pro-font'])[1]", "'1.34%'");
        action.changeElementText("(//span[@class='din-pro-font'])[2]", "'0.17%'");
        action.changeElementText("(//span[@class='din-pro-font'])[3]", "'1.40%'");
        action.changeElementText("(//span[@class='din-pro-font'])[4]", "'1.40%'");
        action.changeElementText("(//span[@class='din-pro-font'])[5]", "'0.65%'");
        action.changeElementText("(//span[@class='din-pro-font'])[6]", "'0.55%'");
        //Time
        Thread.sleep(1000);
        // Change Element "Market Cap"
        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[1]", "'$521 B'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[2]", "'$208 B'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[3]", "'$37.5 B'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[4]", "'$25.1 B'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[5]", "'$9.11 B'");
        action.changeElementText("(//span[@class='main-table-text-style main-table-color market-volumeUsd din-pro-font'])[6]", "'$8.65 B'");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='main-market-wrapper']/div[@class='main-market-container']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_marketBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_marketBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_marketBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 13)
    public void marketTitleBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Move viewable Element Into center
        action.moveViewableElementIntoCenter2("//div[@class='market-title-container']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='market-title-container']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_marketTitleBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_marketTitleBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_marketTitleBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 14)
    public void quickBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//div[@class='market-link-container']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='quick-container']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_quickBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_quickBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_quickBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 15)
    public void terminalBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//div[@class='trading-terminal ieo-terminal']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='trading-terminal ieo-terminal']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_terminalBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_terminalBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_terminalBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 16)
    public void getStartedBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("(//button[@class='ds-btn ds-btn-primary large'])[2]");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='get-started']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_getStartedBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_getStartedBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_getStartedBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 17)
    public void ieoBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("(//button[@class='ds-btn ds-btn-primary large'])[3]");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='trading-terminal trading-pad']/div[@class='container']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_ieoBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_ieoBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_ieoBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 18)
    public void tradePlatformBlockMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("(//button[@class='ds-btn ds-btn-primary large'])[4]");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='trade-on']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_tradePlatformBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_tradePlatformBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_tradePlatformBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 19)
    public void whyCompanyBlockMainPage(String main_page ,String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//div[@class='app-btn']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='why-company']");
        //Time
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='why-company']/div[@class='container']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_whyCompanyBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_whyCompanyBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_whyCompanyBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    //FOOTER TESTS
    @Test(priority = 20)
    public void allFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//footer[@class='footer']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//footer[@class='footer']");
        //Time
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allFooterMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allFooterMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allFooterMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 21)
    public void allFooterTopMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//footer[@class='footer']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//footer[@class='footer']");
        //Time
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='footer__top']",
                ScShotDir+"ScShotDirMain_page/EnChromeAuth/Screenshots_allFooterTopMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allFooterTopMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allFooterTopMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 22)
    public void allFooterBottomMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//footer[@class='footer']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//footer[@class='footer']");
        //Time
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='footer__bottom']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allFooterBottomMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allFooterBottomMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_allFooterBottomMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 23)
    public void langFooterMainPageDropDownPart1(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//footer[@class='footer']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//footer[@class='footer']");
        // Click lang
        action.clickByXpath("//div[@data-test-id='lang-footer']");
        // Select En
        action.viewElementByXpath("//div[@data-test-id='en']");
        // Hover En
        action.hoverOverAnElementByID("//div[@data-test-id='en']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langFooterMainPageDropDownPart1/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langFooterMainPageDropDownPart1/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langFooterMainPageDropDownPart1/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 24)
    public void langFooterMainPageDropDownPart2(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//footer[@class='footer']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//footer[@class='footer']");
        // Click lang
        action.clickByXpath("//div[@data-test-id='lang-footer']");
        // Select Hindi
        action.viewElementByXpath("//div[@data-test-id='hi']");
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='hi']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langFooterMainPageDropDownPart2/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langFooterMainPageDropDownPart2/mock_screenshot.png",
                ScShotDir+"Main_page/EnChromeAuth/Screenshots_langFooterMainPageDropDownPart2/difference.png");

    }

}
