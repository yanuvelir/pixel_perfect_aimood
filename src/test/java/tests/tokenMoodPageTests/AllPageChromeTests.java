package tests.tokenMoodPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
    }
    // DREAM-832
    //HEADER TESTS
    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_allHeaderTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_allHeaderTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_allHeaderTokenMoodPage/difference.png");

    }

    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_getStartedHeaderTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_getStartedHeaderTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_getStartedHeaderTokenMoodPage/difference.png");

    }

    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_learnHeaderTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_learnHeaderTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_learnHeaderTokenMoodPage/difference.png");

    }

    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_resourcesHeaderTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_resourcesHeaderTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_resourcesHeaderTokenMoodPage/difference.png");

    }

//    @Parameters({"token_mood_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(token_mood_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_langItemHeaderTokenMoodPage/real_life_screenshot.png",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_langItemHeaderTokenMoodPage/mock_screenshot.png",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_langItemHeaderTokenMoodPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='token-mood-section']",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_mainSectionTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_mainSectionTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_mainSectionTokenMoodPage/difference.png");

    }

    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 7)
    public void statisticsSectionTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='statistics-wrapper']");
        // Change element
        action.changeElementText("(//ul//div[@class='stat-value'])[1]", "888");
        action.changeElementText("(//ul//div[@class='stat-value'])[2]", "3.14");
        action.changeElementText("(//ul//div[@class='stat-value'])[3]", "1703");
        action.changeElementText("(//ul//div[@class='stat-value'])[4]", "777");
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='statistics-wrapper']",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_statisticsSectionTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_statisticsSectionTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_statisticsSectionTokenMoodPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 8)
    public void allFooterTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_allFooterTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_allFooterTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnChrome/Screenshots_allFooterTokenMoodPage/difference.png");

    }

//    @Parameters({"token_mood_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void partnFooterTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(token_mood_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_partnFooterTokenMoodPage/real_life_screenshot.png",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_partnFooterTokenMoodPage/mock_screenshot.png",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_partnFooterTokenMoodPage/difference.png");
//
//    }
//
//    @Parameters({"token_mood_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void subFooterTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(token_mood_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_subFooterTokenMoodPage/real_life_screenshot.png",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_subFooterTokenMoodPage/mock_screenshot.png",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_subFooterTokenMoodPage/difference.png");
//
//    }
//
//    @Parameters({"token_mood_page", "ScShotDir"})
//    @Test(priority = 11)
//    public void copFooterTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(token_mood_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_copFooterTokenMoodPage/real_life_screenshot.png",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_copFooterTokenMoodPage/mock_screenshot.png",
//                ScShotDir+"TokenMood_page/EnChrome/Screenshots_copFooterTokenMoodPage/difference.png");
//
//    }


}