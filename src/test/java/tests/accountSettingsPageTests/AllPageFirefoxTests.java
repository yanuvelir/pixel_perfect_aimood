package tests.accountSettingsPageTests;

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
    @Parameters({"account_settings_page", "ScShotDir"})
    @Test(priority = 2)
    public void allHeaderAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_settings_page);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper account-header header-wrapper--auth header-wrapper--profile']",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_allHeaderAccountSettingsPage/real_life_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_allHeaderAccountSettingsPage/mock_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_allHeaderAccountSettingsPage/difference.png");

    }

    @Parameters({"account_settings_page", "ScShotDir"})
    @Test(priority = 3)
    public void getStartedHeaderAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_settings_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        //Sleep
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_getStartedHeaderAccountSettingsPage/real_life_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_getStartedHeaderAccountSettingsPage/mock_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_getStartedHeaderAccountSettingsPage/difference.png");

    }

    @Parameters({"account_settings_page", "ScShotDir"})
    @Test(priority = 4)
    public void learnHeaderAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_settings_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_learnHeaderAccountSettingsPage/real_life_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_learnHeaderAccountSettingsPage/mock_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_learnHeaderAccountSettingsPage/difference.png");

    }

    @Parameters({"account_settings_page", "ScShotDir"})
    @Test(priority = 5)
    public void resourcesHeaderAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_settings_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_resourcesHeaderAccountSettingsPage/real_life_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_resourcesHeaderAccountSettingsPage/mock_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_resourcesHeaderAccountSettingsPage/difference.png");

    }

////    @Parameters({"account_settings_page", "ScShotDir"})
////    @Test(priority = 6)
////    public void langItemHeaderAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
////        // Resolution
////        CommonActions.setBrowserWindowSize("mac 14");
////        //Open a page for test
////        action.openPage(account_settings_page);
////        //Hover
////        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
////        //Run the Pixel perfect test for a selected element
////        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
////                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_langItemHeaderAccountSettingsPage/real_life_screenshot.png",
////                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_langItemHeaderAccountSettingsPage/mock_screenshot.png",
////                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_langItemHeaderAccountSettingsPage/difference.png");
////
////    }

    @Parameters({"account_settings_page", "ScShotDir"})
    @Test(priority = 7)
    public void notificationsHeaderAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_settings_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-notifications']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='messages-dropdown__component active']",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_notificationsHeaderAccountSettingsPage/real_life_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_notificationsHeaderAccountSettingsPage/mock_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_notificationsHeaderAccountSettingsPage/difference.png");

    }

    @Parameters({"account_settings_page", "ScShotDir"})
    @Test(priority = 8)
    public void profileHeaderAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_settings_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-profile']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile__dropdown active profile__dropdown--account']",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_profileHeaderAccountSettingsPage/real_life_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_profileHeaderAccountSettingsPage/mock_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_profileHeaderAccountSettingsPage/difference.png");

    }


    //BODY TESTS
    @Parameters({"account_settings_page", "ScShotDir"})
    @Test(priority = 9)
    public void mainSectionAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_settings_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile-cust-wrapper']",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_mainSectionAccountSettingsPage/real_life_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_mainSectionAccountSettingsPage/mock_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_mainSectionAccountSettingsPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"account_settings_page", "ScShotDir"})
    @Test(priority = 10)
    public void allFooterAccountSettingsPage(String account_settings_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_settings_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_allFooterAccountSettingsPage/real_life_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_allFooterAccountSettingsPage/mock_screenshot.png",
                ScShotDir+"AccountSettings_page/EnFirefox/Screenshots_allFooterAccountSettingsPage/difference.png");

    }



}
