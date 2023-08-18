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
    public void allHeaderMainPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(300);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_allHeaderWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_allHeaderWhitePaperPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_allHeaderWhitePaperPage/difference.png");
    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderMainPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_getStartedWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_getStartedWhitePaperPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_getStartedWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderMainPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item learn-nav-item']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_learnWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_learnWhitePaperPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_learnWhitePaperPage/mock_screenshot.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderMainPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][4]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_resourcesWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_resourcesWhitePaperPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_resourcesWhitePaperPage/difference.png");

    }

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
        pixelPerfectAssert.byElement("//div[@class='whitepaper-container']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_mainBlockWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_mainBlockWhitePaperPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_mainBlockWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 6)
    public void EweuimtPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@class='market-token-wrapper section-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='market-token-wrapper section-new']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_EweuimtPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_EweuimtPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_EweuimtPage/difference.png");
    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 7)
    public void allFooterMainPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@class='footer-new transparent__footer']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer-new transparent__footer']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_allFooterWhitePaper/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_allFooterWhitePaper/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_allFooterWhitePaper/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 8)
    public void partnFooterMainPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='partn-container']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_partnFooterWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_partnFooterWhitePaperPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_partnFooterWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 9)
    public void subFooterMainPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
        //Time
        Thread.sleep(1500);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='subfooter']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/difference.png");

    }

    @Parameters({"whitePaper_page", "ScShotDir"})
    @Test(priority = 10)
    public void copFooterMainPage(String whitePaper_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whitePaper_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
        //Time
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='copy-container']",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/real_life_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/mock_screenshot.png",
                ScShotDir + "White Paper/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/difference.png");

    }
}