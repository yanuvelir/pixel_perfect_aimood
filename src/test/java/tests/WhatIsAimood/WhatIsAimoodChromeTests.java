package tests.WhatIsAimood;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class WhatIsAimoodChromeTests extends BaseTest {
    public WhatIsAimoodChromeTests() {
        super("win_chrome");
    }

    //HEADER TESTS
    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whatIsAimood_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_allHeaderWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_allHeaderWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_allHeaderWhatIsAimoodPage/difference.png");
    }

    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderWhatIsAimoodPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_getStartedHeaderWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_getStartedHeaderWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_getStartedHeaderWhatIsAimoodPage/difference.png");

    }

    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderWhatIsAimoodPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_learnHeaderWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_learnHeaderWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_learnHeaderWhatIsAimoodPage/difference.png");

    }

    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderWhatIsAimoodPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_resourcesHeaderWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_resourcesHeaderWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_resourcesHeaderWhatIsAimoodPage/difference.png");

    }

//    @Parameters({"whatIsAimood_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderWhatIsAimoodPage(String main_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(main_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_langItemHeaderWhatIsAimoodPage/real_life_screenshot.png",
//                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_langItemHeaderWhatIsAimoodPage/mock_screenshot.png",
//                ScShotDir+"WhatIsAimood_page/EnChrome/Screenshots_langItemHeaderWhatIsAimoodPage/difference.png");
//
//    }

    //BODY TESTS
    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainBlockWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whatIsAimood_page);
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='what-aimood-section']",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_mainBlockWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_mainBlockWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_mainBlockWhatIsAimoodPage/difference.png");

    }

    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 7)
    public void whyChooseWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whatIsAimood_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='choose-wrapper']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='choose-wrapper']",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_whyChooseWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_whyChooseWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_whyChooseWhatIsAimoodPage/difference.png");
    }
    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 8)
    public void ecosystemWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whatIsAimood_page);
        //scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='ecosystem-section']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='ecosystem-section']",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_ecosystemWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_ecosystemWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_ecosystemWhatIsAimoodPage/difference.png");
    }

    //FOOTER TESTS
    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 9)
    public void allFooterWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whatIsAimood_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_allFooterWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_allFooterWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_allFooterWhatIsAimoodPage/difference.png");

    }

//    @Parameters({"whatIsAimood_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void partnFooterWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(whatIsAimood_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_partnFooterWhatIsAimoodPage/real_life_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_partnFooterWhatIsAimoodPage/mock_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_partnFooterWhatIsAimoodPage/difference.png");
//
//    }
//
//    @Parameters({"whatIsAimood_page", "ScShotDir"})
//    @Test(priority = 11)
//    public void subFooterWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(whatIsAimood_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1500);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_subFooterWhatIsAimoodPage/real_life_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_subFooterWhatIsAimoodPage/mock_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_subFooterWhatIsAimoodPage/difference.png");
//
//    }
//
//    @Parameters({"whatIsAimood_page", "ScShotDir"})
//    @Test(priority = 12)
//    public void copFooterWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(whatIsAimood_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_copFooterWhatIsAimoodPage/real_life_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_copFooterWhatIsAimoodPage/mock_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChrome/Screenshots_copFooterWhatIsAimoodPage/difference.png");
//
//    }
}