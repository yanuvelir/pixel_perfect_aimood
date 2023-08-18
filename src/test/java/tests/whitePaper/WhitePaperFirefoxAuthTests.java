package tests.whitePaper;

import Common.CommonActions;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class WhitePaperFirefoxAuthTests extends BaseTest {
    public WhitePaperFirefoxAuthTests() {
        super("win_firefox");
    }

    //HEADER TESTS
    @Test(priority = 1)
    public  void loginInToTheDexTrade(String main_page) throws InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        // Authorization
        action.loggedAsQaWptUser(main_page);
        //Timeout
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void allHeaderMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Timeout
        Thread.sleep(5000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allHeaderMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allHeaderMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allHeaderMainPage/difference.png");

    }

    @Test(priority = 3)
    public void tradeNavMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("(//li[@class='header-nav-item item-relative'])[1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[1]",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_tradeNavMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_tradeNavMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_tradeNavMainPage/difference.png");

    }

    @Test(priority = 4)
    public void productsNavMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='products']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[2]",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_productsNavMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_productsNavMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_productsNavMainPage/difference.png");

    }

    @Test(priority = 5)
    public void companyNavMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='company']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[3]",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_companyNavMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_companyNavMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_companyNavMainPage/difference.png");

    }

    @Test(priority = 6)
    public void walletNavMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-test-id='wallet']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[4]",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_walletNavMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_walletNavMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_walletNavMainPage/difference.png");

    }

    @Test(priority = 7)
    public void profileNavMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='profile']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='menu-wrapper'])[5]",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_profileNavMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_profileNavMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_profileNavMainPage/difference.png");

    }

    @Test(priority = 8)
    public void langDropDownNavMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='main-slider-pad']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Click "English" button
        action.clickByXpath("//div[@data-test-id='lang dropdown']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container']",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langDropDownNavMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langDropDownNavMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langDropDownNavMainPage/difference.png");

    }

    //BODY TESTS
    @Test(priority = 9)
    public void mainBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//div[@class='main-slider-pad']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='main-block-container']",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_mainBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_mainBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_mainBlockMainPage/difference.png");

    }

    @Test(priority = 10)
    public void statisticBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//div[@class='main-block-container']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Timeout
        Thread.sleep(1000);
        // block 1
        action.changeElementText("(//span[@class='mr-right-8 pair-slider-iso'])[1]", "'BTC/USDT'");
        action.changeElementText("(//span[@class='din-pro-font'])[1]", "'0.15%'");
        action.changeElementText("(//div[@class='slide-pair-rate din-pro-font'])[1]", "'30360.19'");
        action.changeElementText("(//span[@class='din-pro-font rate-usd-size statistic-usd-style'])[1]", "'$30,360.19'");
        //Timeout
        Thread.sleep(1000);
        // block 2
        action.changeElementText("(//span[@class='mr-right-8 pair-slider-iso'])[2]", "'ETH/USDT'");
        action.changeElementText("(//span[@class='din-pro-font'])[2]", "'1.03%'");
        action.changeElementText("(//div[@class='slide-pair-rate din-pro-font'])[2]", "'1873.23'");
        action.changeElementText("(//span[@class='din-pro-font rate-usd-size statistic-usd-style'])[2]", "'$1,873.23'");
        //Timeout
        Thread.sleep(1000);
        // block 3
        action.changeElementText("(//span[@class='mr-right-8 pair-slider-iso'])[3]", "'XRP/USDT'");
        action.changeElementText("(//span[@class='din-pro-font'])[3]", "'1.24%'");
        action.changeElementText("(//div[@class='slide-pair-rate din-pro-font'])[3]", "'0.4784'");
        action.changeElementText("(//span[@class='din-pro-font rate-usd-size statistic-usd-style'])[3]", "'$0.47'");
        //Timeout
        Thread.sleep(1000);
        // block 4
        action.changeElementText("(//span[@class='mr-right-8 pair-slider-iso'])[4]", "'P2PS/ETH'");
        action.changeElementText("(//span[@class='din-pro-font'])[4]", "'0.24%'");
        action.changeElementText("(//div[@class='slide-pair-rate din-pro-font'])[4]", "'0.05024'");
        action.changeElementText("(//span[@class='din-pro-font rate-usd-size statistic-usd-style'])[4]", "'$94.13'");
        //Timeout
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("(//div[@class='main-statistic-container'])[2]",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_statisticBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_statisticBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_statisticBlockMainPage/difference.png");

    }

    @Test(priority = 11)
    public void sliderPadBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//div[@id='tns1-ow']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@id='tns1-ow']",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_sliderPadBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_sliderPadBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_sliderPadBlockMainPage/difference.png");

    }

    @Test(priority = 12)
    public void marketBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");//Find element and scroll the page till the element is found
        action.viewElementByXpath("//div[@class='main-market-wrapper']");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_marketBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_marketBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_marketBlockMainPage/difference.png");

    }

    @Test(priority = 13)
    public void marketTitleBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//div[@class='main-market-wrapper']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='market-title-container']",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_marketTitleBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_marketTitleBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_marketTitleBlockMainPage/difference.png");

    }

    @Test(priority = 14)
    public void quickBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_quickBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_quickBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_quickBlockMainPage/difference.png");

    }

    @Test(priority = 15)
    public void terminalBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_terminalBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_terminalBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_terminalBlockMainPage/difference.png");

    }

    @Test(priority = 16)
    public void getStartedBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_getStartedBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_getStartedBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_getStartedBlockMainPage/difference.png");

    }

    @Test(priority = 17)
    public void ieoBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_ieoBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_ieoBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_ieoBlockMainPage/difference.png");

    }

    @Test(priority = 18)
    public void tradePlatformBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_tradePlatformBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_tradePlatformBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_tradePlatformBlockMainPage/difference.png");

    }

    @Test(priority = 19)
    public void whyCompanyBlockMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_whyCompanyBlockMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_whyCompanyBlockMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_whyCompanyBlockMainPage/difference.png");

    }


    //FOOTER TESTS
    @Test(priority = 20)
    public void allFooterMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterMainPage/difference.png");

    }

    @Test(priority = 21)
    public void allFooterTopMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterTopMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterTopMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterTopMainPage/difference.png");

    }

    @Test(priority = 22)
    public void allFooterBottomMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterBottomMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterBottomMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_allFooterBottomMainPage/difference.png");

    }

    @Test(priority = 23)
    public void langFooterMainPageDropDownPart1() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langFooterMainPageDropDownPart1/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langFooterMainPageDropDownPart1/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langFooterMainPageDropDownPart1/difference.png");

    }

    @Test(priority = 24)
    public void langFooterMainPageDropDownPart2() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com");
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
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langFooterMainPageDropDownPart2/real_life_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langFooterMainPageDropDownPart2/mock_screenshot.png",
                "Screenshots/Main_page/EnFirefoxAuth/Screenshots_langFooterMainPageDropDownPart2/difference.png");

    }


}
