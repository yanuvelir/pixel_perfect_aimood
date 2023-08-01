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
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//header[@class='header-wrapper']");
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//div[@class='cookies-inner']/p/button");
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
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//header[@class='header-wrapper']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"Main_page/EnFirefox/Screenshots_getStartedHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_getStartedHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_getStartedHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='section-wrapper']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item learn-nav-item']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_learnHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_learnHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_learnHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='section-wrapper']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"Main_page/EnFirefox/Screenshots_resourcesHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_resourcesHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_resourcesHeaderMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 5)
    public void langItemHeaderMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='section-wrapper']");
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"Main_page/EnFirefox/Screenshots_langItemHeaderMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_langItemHeaderMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_langItemHeaderMainPage/difference.png");

    }


    //BODY TESTS
    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//section[@class='section-wrapper']");
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='section-wrapper']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainBlockMainPage/difference.png");

    }

    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 6)
    public void videoSectionMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//section[@class='section-wrapper']");
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@class='section-wrapper']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainBlockMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainBlockMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_mainBlockMainPage/difference.png");

    }



    //FOOTER TESTS
    @Parameters({"main_page", "ScShotDir"})
    @Test(priority = 17)
    public void allFooterMainPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage(main_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Find element and scroll the page till the element is found
        action.viewElementByXpath("//footer[@class='footer']");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//footer[@class='footer']");
        //Time
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer']",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allFooterMainPage/real_life_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allFooterMainPage/mock_screenshot.png",
                ScShotDir+"Main_page/EnFirefox/Screenshots_allFooterMainPage/difference.png");

    }



}
