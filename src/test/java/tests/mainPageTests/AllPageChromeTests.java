package tests.mainPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageChromeTests extends BaseTest{
	public AllPageChromeTests() {
		super("win_chrome");
	}

    //HEADER TESTS
    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//div[@class='cookies-inner']/p/button");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"Main_page/EnChrome/Screenshots_allHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_allHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_allHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"Main_page/EnChrome/Screenshots_getStartedHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_getStartedHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_getStartedHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item learn-nav-item']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"Main_page/EnChrome/Screenshots_learnHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_learnHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_learnHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][4]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir+"Main_page/EnChrome/Screenshots_resourcesHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_resourcesHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_resourcesHeaderMainPage/difference.png");

    }

//    @Parameters({"main_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(main_page);
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='section-wrapper']");
//        //Hover
//        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"Main_page/EnChrome/Screenshots_langItemHeaderMainPage/real_life_screenshot.png",
//                ScShotDir+"Main_page/EnChrome/Screenshots_langItemHeaderMainPage/mock_screenshot.png",
//                ScShotDir+"Main_page/EnChrome/Screenshots_langItemHeaderMainPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='section-wrapper']",
                ScShotDir+"Main_page/EnChrome/Screenshots_mainSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_mainSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_mainSectionMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 7)
    public void videoSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@class='video-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='video-wrapper']",
                ScShotDir+"Main_page/EnChrome/Screenshots_videoSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_videoSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_videoSectionMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 8)
    public void roadmapSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@class='roadmap-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='roadmap-wrapper']",
                ScShotDir+"Main_page/EnChrome/Screenshots_roadmapSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_roadmapSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_roadmapSectionMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 9)
    public void statisticsSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@class='statistics-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='statistics-wrapper']",
                ScShotDir+"Main_page/EnChrome/Screenshots_statisticsSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_statisticsSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_statisticsSectionMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 10)
    public void leaningSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@class='leaning-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='leaning-wrapper']",
                ScShotDir+"Main_page/EnChrome/Screenshots_leaningSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_leaningSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_leaningSectionMainPage/difference.png");

    }

    //FOOTER TESTS
    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 11)
    public void allFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@class='footer-new transparent__footer']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer-new transparent__footer']",
                ScShotDir+"Main_page/EnChrome/Screenshots_allFooterMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_allFooterMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_allFooterMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 12)
    public void partnFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='partn-container']",
                ScShotDir+"Main_page/EnChrome/Screenshots_partnFooterMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_partnFooterMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_partnFooterMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 13)
    public void subFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='subfooter']",
                ScShotDir+"Main_page/EnChrome/Screenshots_subFooterMainPage/real_life_screenshot.png",
                ScShotDir+"White Paper/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_subFooterMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 14)
    public void copFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
        //Time
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='copy-container']",
                ScShotDir+"Main_page/EnChrome/Screenshots_copFooterMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_copFooterMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnChrome/Screenshots_copFooterMainPage/difference.png");

    }


}
