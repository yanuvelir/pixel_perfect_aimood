package tests.resetPasswordPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
    }
    //HEADER TESTS
    @Parameters({"resetPassword_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_allHeaderResetPasswordPage/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_allHeaderResetPasswordPage/mock_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_allHeaderResetPasswordPage/difference.png");

    }

    @Parameters({"resetPassword_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_getStartedHeaderResetPasswordPage/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_getStartedHeaderResetPasswordPage/mock_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_getStartedHeaderResetPasswordPage/difference.png");

    }

    @Parameters({"resetPassword_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_learnHeaderResetPasswordPage/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_learnHeaderResetPasswordPage/mock_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_learnHeaderResetPasswordPage/difference.png");

    }

    @Parameters({"resetPassword_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_resourcesHeaderResetPasswordPage/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_resourcesHeaderResetPasswordPage/mock_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_resourcesHeaderResetPasswordPage/difference.png");

    }

//    @Parameters({"resetPassword_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(resetPassword_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_langItemHeaderResetPasswordPage/real_life_screenshot.png",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_langItemHeaderResetPasswordPage/mock_screenshot.png",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_langItemHeaderResetPasswordPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"resetPassword_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//main[@class='main']",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_mainSectionResetPasswordPage/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_mainSectionResetPasswordPage/mock_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_mainSectionResetPasswordPage/difference.png");

    }



    //FOOTER TESTS
    @Parameters({"resetPassword_page", "ScShotDir"})
    @Test(priority = 7)
    public void allFooterResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@class='footer-new item']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer-new item']",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_allFooterResetPasswordPage/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_allFooterResetPasswordPage/mock_screenshot.png",
                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_allFooterResetPasswordPage/difference.png");

    }

//    @Parameters({"resetPassword_page", "ScShotDir"})
//    @Test(priority = 8)
//    public void partnFooterResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(resetPassword_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_partnFooterResetPasswordPage/real_life_screenshot.png",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_partnFooterResetPasswordPage/mock_screenshot.png",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_partnFooterResetPasswordPage/difference.png");
//
//    }
//
//    @Parameters({"resetPassword_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void subFooterResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(resetPassword_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_subFooterResetPasswordPage/real_life_screenshot.png",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_subFooterResetPasswordPage/mock_screenshot.png",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_subFooterResetPasswordPage/difference.png");
//
//    }
//
//    @Parameters({"resetPassword_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void copFooterResetPasswordPage(String resetPassword_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(resetPassword_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_copFooterResetPasswordPage/real_life_screenshot.png",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_copFooterResetPasswordPage/mock_screenshot.png",
//                ScShotDir+"ResetPassword_page/EnChrome/Screenshots_copFooterResetPasswordPage/difference.png");
//
//    }
    
}
