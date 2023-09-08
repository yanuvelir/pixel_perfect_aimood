package tests.fundPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
    }

    // DREAM-834
    //HEADER TESTS
    @Parameters({"fund_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(fund_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"Fund_page/EnChrome/Screenshots_allHeaderFundPage/real_life_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_allHeaderFundPage/mock_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_allHeaderFundPage/difference.png");

    }

    @Parameters({"fund_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(fund_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"Fund_page/EnChrome/Screenshots_getStartedHeaderFundPage/real_life_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_getStartedHeaderFundPage/mock_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_getStartedHeaderFundPage/difference.png");

    }

    @Parameters({"fund_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(fund_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"Fund_page/EnChrome/Screenshots_learnHeaderFundPage/real_life_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_learnHeaderFundPage/mock_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_learnHeaderFundPage/difference.png");

    }

    @Parameters({"fund_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(fund_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"Fund_page/EnChrome/Screenshots_resourcesHeaderFundPage/real_life_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_resourcesHeaderFundPage/mock_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_resourcesHeaderFundPage/difference.png");

    }

//    @Parameters({"fund_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(fund_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_langItemHeaderFundPage/real_life_screenshot.png",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_langItemHeaderFundPage/mock_screenshot.png",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_langItemHeaderFundPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"fund_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(fund_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='fund-program-section']",
                ScShotDir+"Fund_page/EnChrome/Screenshots_mainSectionFundPage/real_life_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_mainSectionFundPage/mock_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_mainSectionFundPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"fund_page", "ScShotDir"})
    @Test(priority = 7)
    public void allFooterFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(fund_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"Fund_page/EnChrome/Screenshots_allFooterFundPage/real_life_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_allFooterFundPage/mock_screenshot.png",
                ScShotDir+"Fund_page/EnChrome/Screenshots_allFooterFundPage/difference.png");

    }

//    @Parameters({"fund_page", "ScShotDir"})
//    @Test(priority = 8)
//    public void partnFooterFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(fund_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_partnFooterFundPage/real_life_screenshot.png",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_partnFooterFundPage/mock_screenshot.png",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_partnFooterFundPage/difference.png");
//
//    }
//
//    @Parameters({"fund_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void subFooterFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(fund_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_subFooterFundPage/real_life_screenshot.png",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_subFooterFundPage/mock_screenshot.png",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_subFooterFundPage/difference.png");
//
//    }
//
//    @Parameters({"fund_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void copFooterFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(fund_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_copFooterFundPage/real_life_screenshot.png",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_copFooterFundPage/mock_screenshot.png",
//                ScShotDir+"Fund_page/EnChrome/Screenshots_copFooterFundPage/difference.png");
//
//    }
}
