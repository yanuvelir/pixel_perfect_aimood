package tests.SignUpTests;

import Common.CommonActions;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class TestsSignUpFirefox extends BaseTest {
    public TestsSignUpFirefox() {
        super("win_firefox");
    }


    @Test
    public void SignUpHederTest() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");

        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                "Screenshots/Sign_up_page_tests/EnFirefoxSignUp/screenshots_signUpHederTestFox/real_life_screenshot.png",
                "Screenshots/Sign_up_page_tests/EnFirefoxSignUp/screenshots_signUpHederTestFox/mock_screenshot.png",
                "Screenshots/Sign_up_page_tests/EnFirefoxSignUp/screenshots_signUpHederTestFox/difference.png");


    }

    @Test
    public void SignUpPagePart1() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");

        action.openPage("https://dex-trade.com/sign-up");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfectAssert.byElement("//div[@class=\"ds-container-fluid sign-page-container custom-sign-up-container\"]",
                "Screenshots/Sign_up_page_tests/EnFirefoxSignUp/screenshots_signUpPagePart1Fox/real_life_screenshot.png",
                "Screenshots/Sign_up_page_tests/EnFirefoxSignUp/screenshots_signUpPagePart1Fox/mock_screenshot.png",
                "Screenshots/Sign_up_page_tests/EnFirefoxSignUp/screenshots_signUpPagePart1Fox/difference.png");


    }

}

