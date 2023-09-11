package tests.resetPasswordPage2Tests;

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
    @Parameters({"resetPassword_page_2", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page_2);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_allHeaderResetPasswordPage2/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_allHeaderResetPasswordPage2/mock_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_allHeaderResetPasswordPage2/difference.png");

    }

    @Parameters({"resetPassword_page_2", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page_2);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_getStartedHeaderResetPasswordPage2/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_getStartedHeaderResetPasswordPage2/mock_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_getStartedHeaderResetPasswordPage2/difference.png");

    }

    @Parameters({"resetPassword_page_2", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page_2);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_learnHeaderResetPasswordPage2/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_learnHeaderResetPasswordPage2/mock_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_learnHeaderResetPasswordPage2/difference.png");

    }

    @Parameters({"resetPassword_page_2", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page_2);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_resourcesHeaderResetPasswordPage2/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_resourcesHeaderResetPasswordPage2/mock_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_resourcesHeaderResetPasswordPage2/difference.png");

    }

//    @Parameters({"resetPassword_page_2", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(resetPassword_page_2);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_langItemHeaderResetPasswordPage2/real_life_screenshot.png",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_langItemHeaderResetPasswordPage2/mock_screenshot.png",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_langItemHeaderResetPasswordPage2/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"resetPassword_page_2", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page_2);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='authentication-recovery']",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_mainSectionResetPasswordPage2/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_mainSectionResetPasswordPage2/mock_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_mainSectionResetPasswordPage2/difference.png");

    }



    //FOOTER TESTS
    @Parameters({"resetPassword_page_2", "ScShotDir"})
    @Test(priority = 7)
    public void allFooterResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(resetPassword_page_2);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_allFooterResetPasswordPage2/real_life_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_allFooterResetPasswordPage2/mock_screenshot.png",
                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_allFooterResetPasswordPage2/difference.png");

    }

//    @Parameters({"resetPassword_page_2", "ScShotDir"})
//    @Test(priority = 8)
//    public void partnFooterResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(resetPassword_page_2);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_partnFooterResetPasswordPage2/real_life_screenshot.png",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_partnFooterResetPasswordPage2/mock_screenshot.png",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_partnFooterResetPasswordPage2/difference.png");
//
//    }
//
//    @Parameters({"resetPassword_page_2", "ScShotDir"})
//    @Test(priority = 9)
//    public void subFooterResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(resetPassword_page_2);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_subFooterResetPasswordPage2/real_life_screenshot.png",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_subFooterResetPasswordPage2/mock_screenshot.png",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_subFooterResetPasswordPage2/difference.png");
//
//    }
//
//    @Parameters({"resetPassword_page_2", "ScShotDir"})
//    @Test(priority = 10)
//    public void copFooterResetPasswordPage2(String resetPassword_page_2, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(resetPassword_page_2);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_copFooterResetPasswordPage2/real_life_screenshot.png",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_copFooterResetPasswordPage2/mock_screenshot.png",
//                ScShotDir+"ResetPassword_page_2/EnChrome/Screenshots_copFooterResetPasswordPage2/difference.png");
//
//    }

}
