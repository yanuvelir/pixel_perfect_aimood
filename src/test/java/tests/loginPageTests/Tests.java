package tests.loginPageTests;

import Common.CommonActions;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class Tests extends BaseTest {
    public Tests() {
        super("win_chrome");
    }


    @Test
    public void loginHederTest() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");

        action.openPage("https://dex-trade.com/login");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfectAssert.byElement("//div[@class='header-wrapper']",
                "Screenshots/Login_page_tests/EnChrome/screenshots_loginHederTest/real_life_screenshot.png",
                "Screenshots/Login_page_tests/EnChrome/screenshots_loginHederTest/mock_screenshot.png",
                "Screenshots/Login_page_tests/EnChrome/screenshots_loginHederTest/difference.png");


    }

    @Test
    public void loginPagePart1() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");

        action.openPage("https://dex-trade.com/login");
        action.waitElementIsVisible("//a[@data-test-id='header signup']");
        pixelPerfectAssert.byElement("//div[@class='ds-container-fluid login-page-container']",
                "Screenshots/Login_page_tests/EnChrome/screenshots_loginPagePart1/real_life_screenshot.png",
                "Screenshots/Login_page_tests/EnChrome/screenshots_loginPagePart1/mock_screenshot.png",
                "Screenshots/Login_page_tests/EnChrome/screenshots_loginPagePart1/difference.png");


    }

}

