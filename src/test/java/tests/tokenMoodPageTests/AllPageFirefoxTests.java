package tests.tokenMoodPageTests;

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
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_allHeaderTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_allHeaderTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_allHeaderTokenMoodPage/difference.png");

    }

    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_getStartedHeaderTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_getStartedHeaderTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_getStartedHeaderTokenMoodPage/difference.png");

    }

    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item learn-nav-item']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_learnHeaderTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_learnHeaderTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_learnHeaderTokenMoodPage/difference.png");

    }

    @Parameters({"token_mood_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(token_mood_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][4]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_resourcesHeaderTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_resourcesHeaderTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_resourcesHeaderTokenMoodPage/difference.png");

    }

//    @Parameters({"token_mood_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderTokenMoodPage(String token_mood_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(token_mood_page);
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='section-wrapper']");
//        //Hover
//        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_langItemHeaderTokenMoodPage/real_life_screenshot.png",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_langItemHeaderTokenMoodPage/mock_screenshot.png",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_langItemHeaderTokenMoodPage/difference.png");
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
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_mainSectionTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_mainSectionTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_mainSectionTokenMoodPage/difference.png");

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
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_statisticsSectionTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_statisticsSectionTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_statisticsSectionTokenMoodPage/difference.png");

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
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_allFooterTokenMoodPage/real_life_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_allFooterTokenMoodPage/mock_screenshot.png",
                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_allFooterTokenMoodPage/difference.png");

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
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_partnFooterTokenMoodPage/real_life_screenshot.png",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_partnFooterTokenMoodPage/mock_screenshot.png",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_partnFooterTokenMoodPage/difference.png");
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
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_subFooterTokenMoodPage/real_life_screenshot.png",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_subFooterTokenMoodPage/mock_screenshot.png",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_subFooterTokenMoodPage/difference.png");
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
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_copFooterTokenMoodPage/real_life_screenshot.png",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_copFooterTokenMoodPage/mock_screenshot.png",
//                ScShotDir+"TokenMood_page/EnFirefox/Screenshots_copFooterTokenMoodPage/difference.png");
//
//    }


}
