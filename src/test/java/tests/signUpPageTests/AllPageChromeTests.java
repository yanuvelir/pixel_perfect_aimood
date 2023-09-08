package tests.signUpPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;
public class AllPageChromeTests extends BaseTest{
    public AllPageChromeTests() {
        super("win_chrome");
    }
    //HEADER TESTS
    @Parameters({"signUp_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signUp_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_allHeaderSignUpPage/real_life_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_allHeaderSignUpPage/mock_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_allHeaderSignUpPage/difference.png");

    }

    @Parameters({"signUp_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signUp_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_getStartedHeaderSignUpPage/real_life_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_getStartedHeaderSignUpPage/mock_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_getStartedHeaderSignUpPage/difference.png");

    }

    @Parameters({"signUp_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signUp_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_learnHeaderSignUpPage/real_life_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_learnHeaderSignUpPage/mock_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_learnHeaderSignUpPage/difference.png");

    }

    @Parameters({"signUp_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signUp_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_resourcesHeaderSignUpPage/real_life_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_resourcesHeaderSignUpPage/mock_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_resourcesHeaderSignUpPage/difference.png");

    }

//    @Parameters({"signUp_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(signUp_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_langItemHeaderSignUpPage/real_life_screenshot.png",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_langItemHeaderSignUpPage/mock_screenshot.png",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_langItemHeaderSignUpPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"signUp_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signUp_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//main[@class='main']",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_mainSectionSignUpPage/real_life_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_mainSectionSignUpPage/mock_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_mainSectionSignUpPage/difference.png");

    }



    //FOOTER TESTS
    @Parameters({"signUp_page", "ScShotDir"})
    @Test(priority = 7)
    public void allFooterSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(signUp_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@class='footer-new item']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer-new item']",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_allFooterSignUpPage/real_life_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_allFooterSignUpPage/mock_screenshot.png",
                ScShotDir+"SignUp_page/EnChrome/Screenshots_allFooterSignUpPage/difference.png");

    }

//    @Parameters({"signUp_page", "ScShotDir"})
//    @Test(priority = 8)
//    public void partnFooterSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(signUp_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_partnFooterSignUpPage/real_life_screenshot.png",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_partnFooterSignUpPage/mock_screenshot.png",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_partnFooterSignUpPage/difference.png");
//
//    }
//
//    @Parameters({"signUp_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void subFooterSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(signUp_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_subFooterSignUpPage/real_life_screenshot.png",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_subFooterSignUpPage/mock_screenshot.png",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_subFooterSignUpPage/difference.png");
//
//    }
//
//    @Parameters({"signUp_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void copFooterSignUpPage(String signUp_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(signUp_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_copFooterSignUpPage/real_life_screenshot.png",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_copFooterSignUpPage/mock_screenshot.png",
//                ScShotDir+"SignUp_page/EnChrome/Screenshots_copFooterSignUpPage/difference.png");
//
//    }
    
}
