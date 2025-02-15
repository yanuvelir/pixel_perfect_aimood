package tests.buySellMoodCoinTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
    }
    // DREAM-833
    //HEADER TESTS
    @Parameters({"buy_sell_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(buy_sell_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_allHeaderBuySellMoodCoinPage/real_life_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_allHeaderBuySellMoodCoinPage/mock_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_allHeaderBuySellMoodCoinPage/difference.png");

    }

    @Parameters({"buy_sell_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(buy_sell_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_getStartedHeaderBuySellMoodCoinPage/real_life_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_getStartedHeaderBuySellMoodCoinPage/mock_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_getStartedHeaderBuySellMoodCoinPage/difference.png");

    }

    @Parameters({"buy_sell_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(buy_sell_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_learnHeaderBuySellMoodCoinPage/real_life_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_learnHeaderBuySellMoodCoinPage/mock_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_learnHeaderBuySellMoodCoinPage/difference.png");

    }

    @Parameters({"buy_sell_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(buy_sell_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_resourcesHeaderBuySellMoodCoinPage/real_life_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_resourcesHeaderBuySellMoodCoinPage/mock_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_resourcesHeaderBuySellMoodCoinPage/difference.png");

    }

//    @Parameters({"buy_sell_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(buy_sell_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_langItemHeaderBuySellMoodCoinPage/real_life_screenshot.png",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_langItemHeaderBuySellMoodCoinPage/mock_screenshot.png",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_langItemHeaderBuySellMoodCoinPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"buy_sell_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(buy_sell_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='buysell-program-section']",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_mainSectionBuySellMoodCoinPage/real_life_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_mainSectionBuySellMoodCoinPage/mock_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_mainSectionBuySellMoodCoinPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"buy_sell_page", "ScShotDir"})
    @Test(priority = 7)
    public void allFooterBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(buy_sell_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_allFooterBuySellMoodCoinPage/real_life_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_allFooterBuySellMoodCoinPage/mock_screenshot.png",
                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_allFooterBuySellMoodCoinPage/difference.png");

    }

//    @Parameters({"buy_sell_page", "ScShotDir"})
//    @Test(priority = 8)
//    public void partnFooterBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(buy_sell_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_partnFooterBuySellMoodCoinPage/real_life_screenshot.png",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_partnFooterBuySellMoodCoinPage/mock_screenshot.png",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_partnFooterBuySellMoodCoinPage/difference.png");
//
//    }
//
//    @Parameters({"buy_sell_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void subFooterBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(buy_sell_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(2000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_subFooterBuySellMoodCoinPage/real_life_screenshot.png",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_subFooterBuySellMoodCoinPage/mock_screenshot.png",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_subFooterBuySellMoodCoinPage/difference.png");
//
//    }
//
//    @Parameters({"buy_sell_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void copFooterBuySellMoodCoinPage(String buy_sell_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(buy_sell_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_copFooterBuySellMoodCoinPage/real_life_screenshot.png",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_copFooterBuySellMoodCoinPage/mock_screenshot.png",
//                ScShotDir+"BuySellMoodCoin_page/EnChrome/Screenshots_copFooterBuySellMoodCoinPage/difference.png");
//
//    }


}