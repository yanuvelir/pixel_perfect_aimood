package tests.accountP2PPageTests;

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
    @Parameters({"account_p2p_page", "ScShotDir"})
    @Test(priority = 2)
    public void allHeaderAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_p2p_page);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper account-header header-wrapper--auth header-wrapper--profile']",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_allHeaderAccountP2PPage/real_life_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_allHeaderAccountP2PPage/mock_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_allHeaderAccountP2PPage/difference.png");

    }

    @Parameters({"account_p2p_page", "ScShotDir"})
    @Test(priority = 3)
    public void getStartedHeaderAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_p2p_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        //Sleep
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_getStartedHeaderAccountP2PPage/real_life_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_getStartedHeaderAccountP2PPage/mock_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_getStartedHeaderAccountP2PPage/difference.png");

    }

    @Parameters({"account_p2p_page", "ScShotDir"})
    @Test(priority = 4)
    public void learnHeaderAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_p2p_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_learnHeaderAccountP2PPage/real_life_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_learnHeaderAccountP2PPage/mock_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_learnHeaderAccountP2PPage/difference.png");

    }

    @Parameters({"account_p2p_page", "ScShotDir"})
    @Test(priority = 5)
    public void resourcesHeaderAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_p2p_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_resourcesHeaderAccountP2PPage/real_life_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_resourcesHeaderAccountP2PPage/mock_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_resourcesHeaderAccountP2PPage/difference.png");

    }

////    @Parameters({"account_p2p_page", "ScShotDir"})
////    @Test(priority = 6)
////    public void langItemHeaderAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
////        // Resolution
////        CommonActions.setBrowserWindowSize("mac 14");
////        //Open a page for test
////        action.openPage(account_p2p_page);
////        //Hover
////        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
////        //Run the Pixel perfect test for a selected element
////        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
////                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_langItemHeaderAccountP2PPage/real_life_screenshot.png",
////                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_langItemHeaderAccountP2PPage/mock_screenshot.png",
////                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_langItemHeaderAccountP2PPage/difference.png");
////
////    }

    @Parameters({"account_p2p_page", "ScShotDir"})
    @Test(priority = 7)
    public void notificationsHeaderAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_p2p_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-notifications']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='messages-dropdown__component active']",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_notificationsHeaderAccountP2PPage/real_life_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_notificationsHeaderAccountP2PPage/mock_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_notificationsHeaderAccountP2PPage/difference.png");

    }

    @Parameters({"account_p2p_page", "ScShotDir"})
    @Test(priority = 8)
    public void profileHeaderAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_p2p_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-profile']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile__dropdown active profile__dropdown--account']",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_profileHeaderAccountP2PPage/real_life_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_profileHeaderAccountP2PPage/mock_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_profileHeaderAccountP2PPage/difference.png");

    }


    //BODY TESTS
    @Parameters({"account_p2p_page", "ScShotDir"})
    @Test(priority = 9)
    public void mainSectionAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_p2p_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile-cust-wrapper']",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_mainSectionAccountP2PPage/real_life_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_mainSectionAccountP2PPage/mock_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_mainSectionAccountP2PPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"account_p2p_page", "ScShotDir"})
    @Test(priority = 10)
    public void allFooterAccountP2PPage(String account_p2p_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_p2p_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_allFooterAccountP2PPage/real_life_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_allFooterAccountP2PPage/mock_screenshot.png",
                ScShotDir+"AccountP2P_page/EnFirefox/Screenshots_allFooterAccountP2PPage/difference.png");

    }



}
