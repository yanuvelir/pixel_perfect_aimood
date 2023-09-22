package tests.whitePaper;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class WhitePaperChromeTests extends BaseTest {
    public WhitePaperChromeTests() {
        super("win_chrome");
    }

    //HEADER TESTS
    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_allHeaderWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_allHeaderWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_allHeaderWhitePaperPage/difference.png");
    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_getStartedWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_getStartedWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_getStartedWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_learnWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_learnWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_learnWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_resourcesWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_resourcesWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_resourcesWhitePaperPage/difference.png");

    }
    
    //BODY TESTS
    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 5)
    public void mainBlockWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='white-paper-section']",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_mainBlockWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_mainBlockWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_mainBlockWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 6)
    public void EweuimtPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='market-token-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='market-token-wrapper']",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_EweuimtPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_EweuimtPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_EweuimtPage/difference.png");
    }
    
    //FOOTER TESTS
    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 7)
    public void allFooterWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_allFooterWhitePaper/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_allFooterWhitePaper/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_allFooterWhitePaper/difference.png");

    }

//    @Parameters({"whitePaper_page", "ScShotDir"})
//    @Test(priority = 8)
//    public void partnFooterWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(whitePaper_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_partnFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_partnFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_partnFooterWhitePaperPage/difference.png");
//
//    }
//
//    @Parameters({"whitePaper_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void subFooterWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(whitePaper_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(6000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_subFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_subFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_subFooterWhitePaperPage/difference.png");
//
//    }
//
//    @Parameters({"whitePaper_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void copFooterWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(whitePaper_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_subFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_subFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnChrome/Screenshots_subFooterWhitePaperPage/difference.png");
//
//    }
}