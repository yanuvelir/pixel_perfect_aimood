package tests.accountDashboardPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
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
    @Parameters({"account_dashboard_page", "ScShotDir"})
    @Test(priority = 2)
    public void allHeaderAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_dashboard_page);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper account-header header-wrapper--auth header-wrapper--profile']",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_allHeaderAccountDashboardPage/real_life_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_allHeaderAccountDashboardPage/mock_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_allHeaderAccountDashboardPage/difference.png");

    }

    @Parameters({"account_dashboard_page", "ScShotDir"})
    @Test(priority = 3)
    public void getStartedHeaderAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_dashboard_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        //Sleep
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_getStartedHeaderAccountDashboardPage/real_life_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_getStartedHeaderAccountDashboardPage/mock_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_getStartedHeaderAccountDashboardPage/difference.png");

    }

    @Parameters({"account_dashboard_page", "ScShotDir"})
    @Test(priority = 4)
    public void learnHeaderAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_dashboard_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_learnHeaderAccountDashboardPage/real_life_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_learnHeaderAccountDashboardPage/mock_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_learnHeaderAccountDashboardPage/difference.png");

    }

    @Parameters({"account_dashboard_page", "ScShotDir"})
    @Test(priority = 5)
    public void resourcesHeaderAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_dashboard_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_resourcesHeaderAccountDashboardPage/real_life_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_resourcesHeaderAccountDashboardPage/mock_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_resourcesHeaderAccountDashboardPage/difference.png");

    }

////    @Parameters({"account_dashboard_page", "ScShotDir"})
////    @Test(priority = 6)
////    public void langItemHeaderAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
////        // Resolution
////        CommonActions.setBrowserWindowSize("mac 14");
////        //Open a page for test
////        action.openPage(account_dashboard_page);
////        //Hover
////        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
////        //Run the Pixel perfect test for a selected element
////        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
////                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_langItemHeaderAccountDashboardPage/real_life_screenshot.png",
////                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_langItemHeaderAccountDashboardPage/mock_screenshot.png",
////                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_langItemHeaderAccountDashboardPage/difference.png");
////
////    }

    @Parameters({"account_dashboard_page", "ScShotDir"})
    @Test(priority = 7)
    public void notificationsHeaderAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_dashboard_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-notifications']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='messages-dropdown__component active']",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_notificationsHeaderAccountDashboardPage/real_life_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_notificationsHeaderAccountDashboardPage/mock_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_notificationsHeaderAccountDashboardPage/difference.png");

    }

    @Parameters({"account_dashboard_page", "ScShotDir"})
    @Test(priority = 8)
    public void profileHeaderAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_dashboard_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-profile']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile__dropdown active profile__dropdown--account']",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_profileHeaderAccountDashboardPage/real_life_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_profileHeaderAccountDashboardPage/mock_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_profileHeaderAccountDashboardPage/difference.png");

    }


    //BODY TESTS
    @Parameters({"account_dashboard_page", "ScShotDir"})
    @Test(priority = 9)
    public void mainSectionAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_dashboard_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile-cust-wrapper']",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_mainSectionAccountDashboardPage/real_life_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_mainSectionAccountDashboardPage/mock_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_mainSectionAccountDashboardPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"account_dashboard_page", "ScShotDir"})
    @Test(priority = 10)
    public void allFooterAccountDashboardPage(String account_dashboard_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_dashboard_page);
        //Sleep
        Thread.sleep(1000);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_allFooterAccountDashboardPage/real_life_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_allFooterAccountDashboardPage/mock_screenshot.png",
                ScShotDir+"AccountDashboard_page/EnChrome/Screenshots_allFooterAccountDashboardPage/difference.png");

    }
}
