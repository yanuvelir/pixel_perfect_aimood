package tests.marketPlacePageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;


public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
    }
    // DREAM-837
    //HEADER TESTS
    @Parameters({"market_place_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(market_place_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_allHeaderMarketPlacePage/real_life_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_allHeaderMarketPlacePage/mock_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_allHeaderMarketPlacePage/difference.png");

    }

    @Parameters({"market_place_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //OpFULL HDen a page for test
        action.openPage(market_place_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(3000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_getStartedHeaderMarketPlacePage/real_life_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_getStartedHeaderMarketPlacePage/mock_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_getStartedHeaderMarketPlacePage/difference.png");

    }

    @Parameters({"market_place_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(market_place_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(3000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_learnHeaderMarketPlacePage/real_life_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_learnHeaderMarketPlacePage/mock_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_learnHeaderMarketPlacePage/difference.png");

    }

    @Parameters({"market_place_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(market_place_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(3000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_resourcesHeaderMarketPlacePage/real_life_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_resourcesHeaderMarketPlacePage/mock_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_resourcesHeaderMarketPlacePage/difference.png");

    }

//    @Parameters({"market_place_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(main_page);
//        //Hover
////      action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_langItemHeaderMarketPlacePage/real_life_screenshot.png",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_langItemHeaderMarketPlacePage/mock_screenshot.png",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_langItemHeaderMarketPlacePage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"market_place_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(market_place_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='market-place-section']",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_mainSectionMarketPlacePage/real_life_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_mainSectionMarketPlacePage/mock_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_mainSectionMarketPlacePage/difference.png");

    }

    @Parameters({"market_place_page", "ScShotDir"})
    @Test(priority = 7)
    public void statisticsSectionMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(market_place_page);
        //Scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='statistics-mp-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='statistics-mp-wrapper']",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_statisticsSectionMarketPlacePage/real_life_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_statisticsSectionMarketPlacePage/mock_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_statisticsSectionMarketPlacePage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"market_place_page", "ScShotDir"})
    @Test(priority = 8)
    public void allFooterMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(market_place_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_allFooterMarketPlacePage/real_life_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_allFooterMarketPlacePage/mock_screenshot.png",
                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_allFooterMarketPlacePage/difference.png");

    }

//    @Parameters({"market_place_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void partnFooterMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(market_place_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_partnFooterMarketPlacePage/real_life_screenshot.png",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_partnFooterMarketPlacePage/mock_screenshot.png",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_partnFooterMarketPlacePage/difference.png");
//
//    }
//
//    @Parameters({"market_place_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void subFooterMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(market_place_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_subFooterMarketPlacePage/real_life_screenshot.png",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_subFooterMarketPlacePage/mock_screenshot.png",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_subFooterMarketPlacePage/difference.png");
//
//    }
//
//    @Parameters({"market_place_page", "ScShotDir"})
//    @Test(priority = 11)
//    public void copFooterMarketPlacePage(String market_place_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(market_place_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_copFooterMarketPlacePage/real_life_screenshot.png",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_copFooterMarketPlacePage/mock_screenshot.png",
//                ScShotDir+"MarketPlace_page/EnChrome/Screenshots_copFooterMarketPlacePage/difference.png");
//
//    }


}
