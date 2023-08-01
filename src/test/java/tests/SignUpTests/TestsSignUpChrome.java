package tests.SignUpTests;

import Common.CommonActions;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class TestsSignUpChrome extends BaseTest {
    public TestsSignUpChrome() {
        super("win_chrome");
    }


    @Test
    public void SignUpHederTest() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");

        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                "Screenshots/Sign_up_page_tests/EnChromeSignUp/screenshots_signUpHederTest/real_life_screenshot.png",
                "Screenshots/Sign_up_page_tests/EnChromeSignUp/screenshots_signUpHederTest/mock_screenshot.png",
                "Screenshots/Sign_up_page_tests/EnChromeSignUp/screenshots_signUpHederTest/difference.png");


    }

    @Test
    public void SignUpPagePart1() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");

        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfectAssert.byElement("//div[@class=\"ds-container-fluid sign-page-container custom-sign-up-container\"]",
                "Screenshots/Sign_up_page_tests/EnChromeSignUp/screenshots_SignUpPagePart1/real_life_screenshot.png",
                "Screenshots/Sign_up_page_tests/EnChromeSignUp/screenshots_SignUpPagePart1/mock_screenshot.png",
                "Screenshots/Sign_up_page_tests/EnChromeSignUp/screenshots_SignUpPagePart1/difference.png");


    }

}

