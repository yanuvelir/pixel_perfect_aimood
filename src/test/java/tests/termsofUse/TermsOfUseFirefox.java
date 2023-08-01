package tests.termsofUse;

import Common.CommonActions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;


public class TermsOfUseFirefox extends BaseTest {

    public TermsOfUseFirefox() {
        super("win_firefox");
    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 1)//dataProvider = "testData"
    public void termsOfUseHeaderTestFirefox(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test

//        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.openPage(url_terms_of_use);

        action.ifWalletButtonIsPresentThenLogout();

        action.pause(3000);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"header-wrapper\"]",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseHeaderTestFirefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseHeaderTestFirefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseHeaderTestFirefox/difference.png");
    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 2)
    public void termsOfUseTextPart1(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart1Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart1Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart1Firefox/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 3)
    public void termsOfUseTextPart2(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,860");
//        Thread.sleep(12000);
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart2Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart2Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart2Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 4)
    public void termsOfUseTextPart3(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,1717");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart3Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart3Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart3Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 5)
    public void termsOfUseTextPart4(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,2576");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart4Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart4Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart4Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 6)
    public void termsOfUseTextPart5(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,3433");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart5Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart5Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart5Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 7)
    public void termsOfUseTextPart6(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,4292");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart6Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart6Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart6Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 8)
    public void termsOfUseTextPart7(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,5150");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart7Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart7Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart7Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 9)
    public void termsOfUseTextPart8(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.scrollPage("0,6009");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart8Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart8Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart8Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 10)
    public void termsOfUseTextPart9(String url_terms_of_use,String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,6863");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart9Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart9Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart9Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 11)
    public void termsOfUseTextPart10(String url_terms_of_use,String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,7719");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart10Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart10Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart10Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 12)
    public void termsOfUseTextPart11(String url_terms_of_use,String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,8578");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart11Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart11Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart11Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 13)
    public void termsOfUseTextPart12(String url_terms_of_use,String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,9446");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart12Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart12Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart12Firefox/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 14)
    public void termsOfUseTextPart13(String url_terms_of_use,String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,9633");
        pixelPerfectAssert.fullPage(ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart13Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart13Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseTestPart13Firefox/difference.png");


    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 15)
    public void termsOfUseFooter(String url_terms_of_use,String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(url_terms_of_use);

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.pause(3000);
//        action.clickByXpath("//div[@class='footer']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer']",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterFirefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterFirefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterFirefox/difference.png");
    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 16)
    public void termsOfUseFooterDropDownPart1(String url_terms_of_use,String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(url_terms_of_use);

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        action.clickByXpath("//div[@data-test-id=\"lang-footer\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterDropDownPart1Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterDropDownPart1Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterDropDownPart1Firefox/difference.png");
    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 17)
    public void termsOfUseFooterDropDownPart2(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(url_terms_of_use);

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        action.clickByXpath("//div[@data-test-id=\"lang-footer\"]");
        action.viewElementByXpath("//div[@data-test-id=\"hi\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterDropDownPart2Firefox/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterDropDownPart2Firefox/mock_screenshot.png",
                ScShotDir+"termsOfUse/EnFirefox/termsOfUseFooterDropDownPart2Firefox/difference.png");
    }
}
