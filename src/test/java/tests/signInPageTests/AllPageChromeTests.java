package tests.signInPageTests;

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
    @Parameters({"signIn_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signIn_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_allHeaderSignInPage/real_life_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_allHeaderSignInPage/mock_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_allHeaderSignInPage/difference.png");

    }

    @Parameters({"signIn_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signIn_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_getStartedHeaderSignInPage/real_life_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_getStartedHeaderSignInPage/mock_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_getStartedHeaderSignInPage/difference.png");

    }

    @Parameters({"signIn_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signIn_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_learnHeaderSignInPage/real_life_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_learnHeaderSignInPage/mock_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_learnHeaderSignInPage/difference.png");

    }

    @Parameters({"signIn_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signIn_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_resourcesHeaderSignInPage/real_life_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_resourcesHeaderSignInPage/mock_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_resourcesHeaderSignInPage/difference.png");

    }

//    @Parameters({"signIn_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(signIn_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_langItemHeaderSignInPage/real_life_screenshot.png",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_langItemHeaderSignInPage/mock_screenshot.png",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_langItemHeaderSignInPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"signIn_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signIn_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='authentication-login']",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_mainSectionSignInPage/real_life_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_mainSectionSignInPage/mock_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_mainSectionSignInPage/difference.png");

    }



    //FOOTER TESTS
    @Parameters({"signIn_page", "ScShotDir"})
    @Test(priority = 7)
    public void allFooterSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signIn_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_allFooterSignInPage/real_life_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_allFooterSignInPage/mock_screenshot.png",
                ScShotDir+"SignIn_page/EnChrome/Screenshots_allFooterSignInPage/difference.png");

    }

//    @Parameters({"signIn_page", "ScShotDir"})
//    @Test(priority = 8)
//    public void partnFooterSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(signIn_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_partnFooterSignInPage/real_life_screenshot.png",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_partnFooterSignInPage/mock_screenshot.png",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_partnFooterSignInPage/difference.png");
//
//    }
//
//    @Parameters({"signIn_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void subFooterSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(signIn_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_subFooterSignInPage/real_life_screenshot.png",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_subFooterSignInPage/mock_screenshot.png",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_subFooterSignInPage/difference.png");
//
//    }
//
//    @Parameters({"signIn_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void copFooterSignInPage(String signIn_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(signIn_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_copFooterSignInPage/real_life_screenshot.png",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_copFooterSignInPage/mock_screenshot.png",
//                ScShotDir+"SignIn_page/EnChrome/Screenshots_copFooterSignInPage/difference.png");
//
//    }
}
