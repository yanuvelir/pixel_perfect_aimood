package tests.SignIn;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class SignInChromeTests extends BaseTest {
    public SignInChromeTests() {
        super("win_chrome");
    }

    //HEADER TESTS
    @Parameters({"SignIn_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderMainPage(String SignIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignIn_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(300);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allHeaderSignInPage/real_life_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allHeaderSignInPage/mock_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allHeaderSignInPage/difference.png");
    }

       @Parameters({"SignIn_page", "ScShotDir"})
    @Test(priority = 2)
    public void mainBlockWhitePaperPage(String SignIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignIn_page);
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//main[@class='main']",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_mainBlockSignInPage/real_life_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_mainBlockSignInPage/mock_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_mainBlockSignInPage/difference.png");

    }

    @Parameters({"SignIn_page", "ScShotDir"})
    @Test(priority = 3)
    public void Forgot (String SignIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignIn_page);
        //scroll
        action.moveViewableElementIntoCenter2("//button[@class='link-like__button reset-password__link']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//button[@class='link-like__button reset-password__link']",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_Forgot/real_life_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_Forgot/mock_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_Forgot/difference.png");
    }
    @Parameters({"SignIn_page", "ScShotDir"})
    @Test(priority = 4)
    public void Dont (String SignIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignIn_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='not-registered__row']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='not-registered__row']",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_Dont/real_life_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_Dont/mock_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_Dont/difference.png");
    }

    @Parameters({"SignIn_page", "ScShotDir"})
    @Test(priority = 5)
    public void allPageSignInPage (String SignIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignIn_page);
               Thread.sleep(3000);
                action.waitElementIsVisible("//div[@class='authentication__modal login__modal']");
                pixelPerfectAssert.fullPage(ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allPageSignInPage/real_life_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allPageSignInPage/mock_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allPageSignInPage/difference.png");
    }
    @Parameters({"SignIn_page", "ScShotDir"})
    @Test(priority = 6)
    public void allFooterMainPage(String SignIn_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignIn_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='log-footer__component']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='log-footer__component']",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allFooterSignInPage/real_life_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allFooterSignInPage/mock_screenshot.png",
                ScShotDir + "SignIn/EnChromeSignInPage/Screenshots_allFooterSignInPage/difference.png");

    }

   }