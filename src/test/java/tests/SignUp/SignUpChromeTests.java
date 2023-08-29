package tests.SignUp;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class SignUpChromeTests extends BaseTest {
    public SignUpChromeTests() {
        super("win_chrome");
    }

    //HEADER TESTS
    @Parameters({"SignUp_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderSignUpPage(String SignUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignUp_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(300);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allHeaderSignUpPage/real_life_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allHeaderSignUpPage/mock_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allHeaderSignUpPage/difference.png");
    }

       @Parameters({"SignUp_page", "ScShotDir"})
    @Test(priority = 2)
    public void mainBlockWhitePaperPage(String SignUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignUp_page);
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//main[@class='main']",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_mainBlockSignUpPage/real_life_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_mainBlockSignUpPage/mock_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_mainBlockSignUpPage/difference.png");

    }

    @Parameters({"SignUp_page", "ScShotDir"})
    @Test(priority = 4)
    public void Already (String SignUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignUp_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='have-account__row']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='have-account__row']",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_AlreadyFooterSignUp/real_life_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_AlreadyFooterSignUp/mock_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_AlreadyFooterSignUp/difference.png");
    }

    @Parameters({"SignUp_page", "ScShotDir"})
    @Test(priority = 5)
    public void allPageSignUpPage (String SignUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignUp_page);
               Thread.sleep(300);
                action.waitElementIsVisible("//div[@class='authentication__modal register__modal']");
                pixelPerfectAssert.fullPage(ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allPageSignUpPage/real_life_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allPageSignUpPage/mock_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allPageSignUpPage/difference.png");
    }
    @Parameters({"SignUp_page", "ScShotDir"})
    @Test(priority = 6)
    public void allFooterSignUp(String SignUp_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(SignUp_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='log-footer__component']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='log-footer__component']",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allFooterSignUp/real_life_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allFooterSignUp/mock_screenshot.png",
                ScShotDir + "SignUp/EnChromeSignUp/Screenshots_allFooterSignUp/difference.png");

    }

   }