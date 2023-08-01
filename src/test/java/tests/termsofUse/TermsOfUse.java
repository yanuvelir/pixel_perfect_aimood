package tests.termsofUse;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class TermsOfUse extends BaseTest {
    public TermsOfUse() {
        super("win_chrome");
    }

//    @Test(priority = 1)
//    public void termsOfUseHeaderTest() throws IOException, InterruptedException {
//
//        CommonActions.setBrowserWindowSize("FULL HD");
//        //Open a page for test
//        action.openPage("https://dex-trade.com/info/terms-of-use");
//
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//a[@data-test-id='header login']");
//
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class=\"header-wrapper\"]",
//                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTest/real_life_screenshot.png",
//                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTest/mock_screenshot.png",
//                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTest/difference.png");
//
//    }

    @Test(priority = 2)
    public void termsOfUseTextPart1() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart1/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart1/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart1/difference.png");

    }

    @Test(priority = 3)
    public void termsOfUseTextPart2() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,860");
//        Thread.sleep(12000);
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart2/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart2/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart2/difference.png");

    }

    @Test(priority = 4)
    public void termsOfUseTextPart3() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,1717");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart3/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart3/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart3/difference.png");

    }

    @Test(priority = 5)
    public void termsOfUseTextPart4() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,2576");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart4/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart4/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart4/difference.png");

    }

    @Test(priority = 6)
    public void termsOfUseTextPart5() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,3433");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart5/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart5/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart5/difference.png");

    }

    @Test(priority = 7)
    public void termsOfUseTextPart6() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,4292");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart6/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart6/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart6/difference.png");

    }

    @Test(priority = 8)
    public void termsOfUseTextPart7() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,5150");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart7/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart7/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart7/difference.png");

    }

    @Test(priority = 9)
    public void termsOfUseTextPart8() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.scrollPage("0,6009");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart8/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart8/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart8/difference.png");

    }

    @Test(priority = 10)
    public void termsOfUseTextPart9() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,6863");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart9/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart9/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart9/difference.png");

    }

    @Test(priority = 11)
    public void termsOfUseTextPart10() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,7719");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart10/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart10/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart10/difference.png");

    }

    @Test(priority = 12)
    public void termsOfUseTextPart11() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,8578");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart11/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart11/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart11/difference.png");

    }

    @Test(priority = 13)
    public void termsOfUseTextPart12() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage("https://dex-trade.com/info/terms-of-use");
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,9446");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart12/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart12/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart12/difference.png");

    }

    @Parameters({"url_terms_of_use", "ScShotDir"})
    @Test(priority = 14)
    public void termsOfUseTextPart13(String url_terms_of_use, String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        action.openPage(url_terms_of_use);
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        action.scrollPage("0,9633");
        pixelPerfectAssert.byElement("//div[@class=\"light-page__styles legal-page__styles\"]",
                ScShotDir+"termsOfUse/EnChrome/termsOfUseHeaderTestPart13/real_life_screenshot.png",
                ScShotDir+"termsOfUse/EnChrome/termsOfUseHeaderTestPart13/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseHeaderTestPart13/difference.png");

    }

    @Test(priority = 15)
    public void termsOfUseFooter(String ScShotDir) throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com/info/terms-of-use");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"footer__inner\"]",
                ScShotDir+"termsOfUse/EnChrome/termsOfUseFooter/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooter/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooter/difference.png");
    }

    @Test(priority = 16)
    public void termsOfUseFooterDropDownPart1() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com/info/terms-of-use");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        action.clickByXpath("//div[@data-test-id=\"lang-footer\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart1/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart1/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart1/difference.png");
    }

    @Test(priority = 17)
    public void termsOfUseFooterDropDownPart2() throws IOException, InterruptedException {
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com/info/terms-of-use");

        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//a[@data-test-id='header login']");

        action.clickByXpath("//div[@data-test-id=\"lang-footer\"]");
        action.viewElementByXpath("//div[@data-test-id=\"hi\"]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class=\"dropdown-container language-container footer-lang-style\"]",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart2/real_life_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart2/mock_screenshot.png",
                "Screenshots/termsOfUse/EnChrome/termsOfUseFooterDropDownPart2/difference.png");
    }

}

