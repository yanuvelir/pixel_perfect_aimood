package tests.walletPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
    }

    // DREAM-863
    //HEADER TESTS
    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_allHeaderWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_allHeaderWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_allHeaderWalletPage/difference.png");

    }

    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_getStartedHeaderWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_getStartedHeaderWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_getStartedHeaderWalletPage/difference.png");

    }

    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item learn-nav-item']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_learnHeaderWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_learnHeaderWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_learnHeaderWalletPage/difference.png");

    }

    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][4]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_resourcesHeaderWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_resourcesHeaderWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_resourcesHeaderWalletPage/difference.png");

    }

//    @Parameters({"wallet_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(wallet_page);
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='section-wrapper']");
//        //Hover
//        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"Wallet_page/EnChrome/Screenshots_langItemHeaderWalletPage/real_life_screenshot.png",
//                ScShotDir+"Wallet_page/EnChrome/Screenshots_langItemHeaderWalletPage/mock_screenshot.png",
//                ScShotDir+"Wallet_page/EnChrome/Screenshots_langItemHeaderWalletPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='first-main-saction wallet-program-section section-new']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_mainSectionWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_mainSectionWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_mainSectionWalletPage/difference.png");

    }

    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 7)
    public void delegatedSectionWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //Scroll
        action.moveViewableElementIntoCenter2("//section[@class='delegated-section section-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='delegated-section section-new']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_delegatedSectionWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_delegatedSectionWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_delegatedSectionWalletPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 8)
    public void allFooterWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@class='footer-new transparent__footer']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer-new transparent__footer']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_allFooterWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_allFooterWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_allFooterWalletPage/difference.png");

    }

    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 9)
    public void partnFooterWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='partn-container']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_partnFooterWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_partnFooterWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_partnFooterWalletPage/difference.png");

    }

    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 10)
    public void subFooterWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='subfooter']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_subFooterWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_subFooterWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_subFooterWalletPage/difference.png");

    }

    @Parameters({"wallet_page", "ScShotDir"})
    @Test(priority = 11)
    public void copFooterWalletPage(String wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(wallet_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
        //Time
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='copy-container']",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_copFooterWalletPage/real_life_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_copFooterWalletPage/mock_screenshot.png",
                ScShotDir+"Wallet_page/EnChrome/Screenshots_copFooterWalletPage/difference.png");

    }
}
