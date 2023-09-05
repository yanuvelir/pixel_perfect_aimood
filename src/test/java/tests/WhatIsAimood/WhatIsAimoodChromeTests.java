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
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_allHeaderWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_allHeaderWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_allHeaderWhatIsAimoodPage/difference.png");
    }


    //BODY TESTS
    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 2)
    public void mainBlockWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(whatIsAimood_page);
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='what-aimood-section']",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_mainBlockWhatIsAimoodPage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_mainBlockWhatIsAimoodPage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_mainBlockWhatIsAimoodPage/difference.png");

    }

    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 3)
    public void WhyChooseWhatIsAimoodPage(String whatIsAimood_page, String ScShotDir) throws IOException, InterruptedException {
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
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_WhyChoosePage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_WhyChoosePage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_WhyChoosePage/difference.png");
    }
    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 4)
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
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_TfeuamWbEUPage/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_TfeuamWbEUPage/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_TfeuamWbEUPage/difference.png");
    }


    //FOOTER TESTS
    @Parameters({"whatIsAimood_page", "ScShotDir"})
    @Test(priority = 5)
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
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_allFooterWhatIsAimood/real_life_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_allFooterWhatIsAimood/mock_screenshot.png",
                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_allFooterWhatIsAimood/difference.png");

    }

//    @Parameters({"whatIsAimood_page", "ScShotDir"})
//    @Test(priority = 6)
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
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_partnFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_partnFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_partnFooterWhitePaperPage/difference.png");
//
//    }
//
//    @Parameters({"whatIsAimood_page", "ScShotDir"})
//    @Test(priority = 7)
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
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_subFooterWhitePaperPage/difference.png");
//
//    }
//
//    @Parameters({"whatIsAimood_page", "ScShotDir"})
//    @Test(priority = 8)
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
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_copFooterWhitePaperPage/real_life_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_copFooterWhitePaperPage/mock_screenshot.png",
//                ScShotDir + "WhatIsAimood_page/EnChromeWhitePaper/Screenshots_copFooterWhitePaperPage/difference.png");
//
//    }
}