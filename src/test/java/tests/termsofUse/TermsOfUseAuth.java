package tests.termsofUse;

import org.testng.annotations.Test;
import tests.base.BaseTest;
import org.testng.annotations.Parameters;
import Common.CommonActions;

import java.io.IOException;

public class TermsOfUseAuth extends BaseTest {

    public TermsOfUseAuth() {
        super("win_chrome");
    }

    @Parameters({"main_page"})
    @Test
    public  void loginInToTheDexTrade(String main_page) throws InterruptedException {
        action.loggedAsQaWptUser(main_page);
    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 1)
    public void termsOfUseHeaderTestAuth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(url_terms_of_use);
        action.pause(5000);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"header-wrapper\"]",ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseHeaderTestAuth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseHeaderTestAuth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseHeaderTestAuth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 2)
    public void termsOfUseTextPart1Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTextPart1Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTextPart1Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTextPart1Auth/difference.png");

    }
    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 3)
    public void termsOfUseTextPart2Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.pause(3000);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,860");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart2Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart2Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart2Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 4)
    public void termsOfUseTextPart3Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.pause(3000);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,1717");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart3Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart3Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart3Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 5)
    public void termsOfUseTextPart4Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.pause(3000);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,2576");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart4Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart4Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart4Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 6)
    public void termsOfUseTextPart5Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.pause(3000);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,3433");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart5Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart5Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart5Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 7)
    public void termsOfUseTextPart6Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.pause(3000);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,4292");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart6Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart6Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart6Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 8)
    public void termsOfUseTextPart7Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,5150");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart7Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart7Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart7Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 9)
    public void termsOfUseTextPart8Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.scrollPage("0,6009");
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart8Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart8Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart8Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 10)
    public void termsOfUseTextPart9Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,6863");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart9Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart9Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart9Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 11)
    public void termsOfUseTextPart10Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,7719");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart10Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart10Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart10Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 12)
    public void termsOfUseTextPart11Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,8578");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart11Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart11Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart11Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 13)
    public void termsOfUseTextPart12Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,9446");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart12Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart12Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart12Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 14)
    public void termsOfUseTextPart13Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.scrollPage("0,9633");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart13Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart13Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseTestPart13Auth/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 15)
    public void termsOfUseFooterAuth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(url_terms_of_use);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.pause(3000);
//        action.clickByXpath("//div[@class='footer']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer']",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterAuth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterAuth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterAuth/difference.png");
    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 16)
    public void termsOfUseFooterDropDownPart1Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(url_terms_of_use);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");
        action.clickByXpath("//div[@data-test-id=\"lang-footer\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterDropDownPart1Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterDropDownPart1Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterDropDownPart1Auth/difference.png");
    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 17)
    public void termsOfUseFooterDropDownPart2Auth(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(url_terms_of_use);

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class=\"wallet-nav-container\"]");

        action.clickByXpath("//div[@data-test-id=\"lang-footer\"]");
        action.viewElementByXpath("//div[@data-test-id=\"hi\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterDropDownPart2Auth/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterDropDownPart2Auth/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnChromeAuth/EnChrome/termsOfUseFooterDropDownPart2Auth/difference.png");
    }

}

