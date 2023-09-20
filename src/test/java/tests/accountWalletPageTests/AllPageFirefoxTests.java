package tests.accountWalletPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class AllPageFirefoxTests extends BaseTest {
    public AllPageFirefoxTests() {
        super("win_firefox");
    }
    // SIGN IN
    @Parameters({"main_page"})
    @Test(priority = 1)
    public void signInUser(String main_page) throws InterruptedException {
        //Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        // Authorization
        action.signInQaUser(main_page);
        //Timeout
        Thread.sleep(1000);
    }

    //HEADER TESTS
    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 2)
    public void allHeaderAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper account-header header-wrapper--auth header-wrapper--profile']",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_allHeaderAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_allHeaderAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_allHeaderAccountWalletPage/difference.png");

    }

    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 3)
    public void getStartedHeaderAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        //Sleep
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_getStartedHeaderAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_getStartedHeaderAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_getStartedHeaderAccountWalletPage/difference.png");

    }

    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 4)
    public void learnHeaderAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_learnHeaderAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_learnHeaderAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_learnHeaderAccountWalletPage/difference.png");

    }

    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 5)
    public void resourcesHeaderAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_resourcesHeaderAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_resourcesHeaderAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_resourcesHeaderAccountWalletPage/difference.png");

    }

////    @Parameters({"account_wallet_page", "ScShotDir"})
////    @Test(priority = 6)
////    public void langItemHeaderAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
////        // Resolution
////        CommonActions.setBrowserWindowSize("mac 14");
////        //Open a page for test
////        action.openPage(account_wallet_page);
////        //Hover
////        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
////        //Run the Pixel perfect test for a selected element
////        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
////                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_langItemHeaderAccountWalletPage/real_life_screenshot.png",
////                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_langItemHeaderAccountWalletPage/mock_screenshot.png",
////                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_langItemHeaderAccountWalletPage/difference.png");
////
////    }

    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 7)
    public void notificationsHeaderAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-notifications']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='messages-dropdown__component active']",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_notificationsHeaderAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_notificationsHeaderAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_notificationsHeaderAccountWalletPage/difference.png");

    }

    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 8)
    public void profileHeaderAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-profile']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile__dropdown active profile__dropdown--account']",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_profileHeaderAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_profileHeaderAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_profileHeaderAccountWalletPage/difference.png");

    }


    //BODY TESTS
    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 9)
    public void mainSectionAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile-cust-wrapper']",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_mainSectionAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_mainSectionAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_mainSectionAccountWalletPage/difference.png");

    }

    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 10)
    public void stakingAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //Time
        Thread.sleep(2000);
        action.clickByXpath("//button[@class='minting-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.fullPage(
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_stakingAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_stakingAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_stakingAccountWalletPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"account_wallet_page", "ScShotDir"})
    @Test(priority = 11)
    public void allFooterAccountWalletPage(String account_wallet_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_wallet_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_allFooterAccountWalletPage/real_life_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_allFooterAccountWalletPage/mock_screenshot.png",
                ScShotDir+"AccountWallet_page/EnFirefox/Screenshots_allFooterAccountWalletPage/difference.png");

    }



}
