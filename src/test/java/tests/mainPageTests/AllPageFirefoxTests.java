package tests.mainPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageFirefoxTests extends BaseTest {
    public AllPageFirefoxTests() {
        super("win_firefox");
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
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_getStartedHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_getStartedHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_getStartedHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_learnHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_learnHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_learnHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_resourcesHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_resourcesHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_resourcesHeaderMainPage/difference.png");

    }

//    @Parameters({"main_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(main_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_langItemHeaderMainPage/real_life_screenshot.png",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_langItemHeaderMainPage/mock_screenshot.png",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_langItemHeaderMainPage/difference.png");
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
        pixelPerfectAssert.byElement("//section[@data-testid='section-wrapper']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainSectionMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 7)
    public void videoSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='video-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='video-wrapper']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_videoSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_videoSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_videoSectionMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 8)
    public void roadmapSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='roadmap-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='roadmap-wrapper']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_roadmapSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_roadmapSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_roadmapSectionMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 9)
    public void statisticsSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='statistics-wrapper']");
        // Change element
        action.changeElementText("(//ul//div[@class='stat-value'])[1]", "888");
        action.changeElementText("(//ul//div[@class='stat-value'])[2]", "3.14");
        action.changeElementText("(//ul//div[@class='stat-value'])[3]", "1703");
        action.changeElementText("(//ul//div[@class='stat-value'])[4]", "777");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='statistics-wrapper']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_statisticsSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_statisticsSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_statisticsSectionMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 10)
    public void leaningSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='leaning-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='leaning-wrapper item']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_leaningSectionMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_leaningSectionMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_leaningSectionMainPage/difference.png");

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
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allFooterMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allFooterMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allFooterMainPage/difference.png");

    }

//    @Parameters({"main_page", "ScShotDir"})
//    @Test(priority = 12)
//    public void partnFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(main_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_partnFooterMainPage/real_life_screenshot.png",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_partnFooterMainPage/mock_screenshot.png",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_partnFooterMainPage/difference.png");
//
//    }
//
//    @Parameters({"main_page", "ScShotDir"})
//    @Test(priority = 13)
//    public void subFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(main_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_subFooterMainPage/real_life_screenshot.png",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_subFooterMainPage/mock_screenshot.png",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_subFooterMainPage/difference.png");
//
//    }
//
//    @Parameters({"main_page", "ScShotDir"})
//    @Test(priority = 14)
//    public void copFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(main_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_copFooterMainPage/real_life_screenshot.png",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_copFooterMainPage/mock_screenshot.png",
//                ScShotDir+"Main_page/EnFirefox/Screenshots_copFooterMainPage/difference.png");
//
//    }


}
