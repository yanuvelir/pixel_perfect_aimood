package tests.whitePaper;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class WhitePaperFirefoxTests extends BaseTest {
    public WhitePaperFirefoxTests() {
        super("win_firefox");
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
        Thread.sleep(3000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_allHeaderWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_allHeaderWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_allHeaderWhitePaperPage/difference.png");
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
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_getStartedWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_getStartedWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_getStartedWhitePaperPage/difference.png");

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
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_learnWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_learnWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_learnWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 2)
    public void marketPlaceHeaderWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Hover
        action.hoverOverAnElementByXpath("//a[@data-testid='head-nav-market-place']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//a[@data-testid='head-nav-market-place']",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_marketPlaceWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_marketPlaceWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_marketPlaceWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 2)
    public void whitePaperHeaderWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Hover
        action.hoverOverAnElementByXpath("//a[@data-testid='head-nav-white-paper']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//a[@data-testid='head-nav-white-paper']",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_whitePaperHeaderWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_whitePaperHeaderWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_whitePaperHeaderWhitePaperPage/difference.png");

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
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_resourcesWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_resourcesWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_resourcesWhitePaperPage/difference.png");

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
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_mainBlockWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_mainBlockWhitePaperPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_mainBlockWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 6)
    public void marketTokenWhitePaperPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
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
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_EweuimtPage/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_EweuimtPage/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_EweuimtPage/difference.png");
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
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_allFooterWhitePaper/real_life_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_allFooterWhitePaper/mock_screenshot.png",
                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_allFooterWhitePaper/difference.png");

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
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_partnFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_partnFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_partnFooterWhitePaperPage/difference.png");
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
//        Thread.sleep(1500);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_subFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_subFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_subFooterWhitePaperPage/difference.png");
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
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_copFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_copFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhitePaper_page/EnFirefoxWhitePaper/Screenshots_copFooterWhitePaperPage/difference.png");
//
//    }
}