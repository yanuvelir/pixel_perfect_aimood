package tests.stakingPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
    }
    // DREAM-873
    //HEADER TESTS
    @Parameters({"staking_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(staking_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"Staking_page/EnChrome/Screenshots_allHeaderStakingPage/real_life_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_allHeaderStakingPage/mock_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_allHeaderStakingPage/difference.png");

    }

    @Parameters({"staking_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(staking_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"Staking_page/EnChrome/Screenshots_getStartedHeaderStakingPage/real_life_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_getStartedHeaderStakingPage/mock_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_getStartedHeaderStakingPage/difference.png");

    }

    @Parameters({"staking_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(staking_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"Staking_page/EnChrome/Screenshots_learnHeaderStakingPage/real_life_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_learnHeaderStakingPage/mock_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_learnHeaderStakingPage/difference.png");

    }

    @Parameters({"staking_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(staking_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"Staking_page/EnChrome/Screenshots_resourcesHeaderStakingPage/real_life_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_resourcesHeaderStakingPage/mock_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_resourcesHeaderStakingPage/difference.png");

    }

//    @Parameters({"staking_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(staking_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_langItemHeaderStakingPage/real_life_screenshot.png",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_langItemHeaderStakingPage/mock_screenshot.png",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_langItemHeaderStakingPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"staking_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(staking_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='staking-program-section']",
                ScShotDir+"Staking_page/EnChrome/Screenshots_mainSectionStakingPage/real_life_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_mainSectionStakingPage/mock_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_mainSectionStakingPage/difference.png");

    }

    @Parameters({"staking_page", "ScShotDir"})
    @Test(priority = 7)
    public void delegatedSectionStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(staking_page);
        //Scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='delegated-section']");
        //Time
        Thread.sleep(4000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='delegated-section']",
                ScShotDir+"Staking_page/EnChrome/Screenshots_delegatedSectionStakingPage/real_life_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_delegatedSectionStakingPage/mock_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_delegatedSectionStakingPage/difference.png");

    }

    @Parameters({"staking_page", "ScShotDir"})
    @Test(priority = 8)
    public void calcStakSectionStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(staking_page);
        //Scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='calc-stak-wrapper']");
        //Time
        Thread.sleep(2000);
        //Change data
        action.changeDate();
        // calculation-per-title
        action.changeElementText("//h6[@class='calc-delegate-title calculation-per-title']/span", "'(0.13% 24H)'");
        // table calc-container
        action.changeElementText("//table/tr[@class='mood-calc-flex period-margin']/td[@class='mood-calc-value']", "'~0.13'");
        action.changeElementText("//table/tr[@class='mood-calc-flex']/td[@class='mood-calc-value']", "'2864.2900'");

        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='calc-stak-wrapper']",
                ScShotDir+"Staking_page/EnChrome/Screenshots_calcStakSectionStakingPage/real_life_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_calcStakSectionStakingPage/mock_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_calcStakSectionStakingPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"staking_page", "ScShotDir"})
    @Test(priority = 9)
    public void allFooterStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(staking_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"Staking_page/EnChrome/Screenshots_allFooterStakingPage/real_life_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_allFooterStakingPage/mock_screenshot.png",
                ScShotDir+"Staking_page/EnChrome/Screenshots_allFooterStakingPage/difference.png");

    }

//    @Parameters({"staking_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void partnFooterStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(staking_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_partnFooterStakingPage/real_life_screenshot.png",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_partnFooterStakingPage/mock_screenshot.png",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_partnFooterStakingPage/difference.png");
//
//    }
//
//    @Parameters({"staking_page", "ScShotDir"})
//    @Test(priority = 11)
//    public void subFooterStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(staking_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_subFooterStakingPage/real_life_screenshot.png",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_subFooterStakingPage/mock_screenshot.png",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_subFooterStakingPage/difference.png");
//
//    }
//
//    @Parameters({"staking_page", "ScShotDir"})
//    @Test(priority = 12)
//    public void copFooterStakingPage(String staking_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(staking_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_copFooterStakingPage/real_life_screenshot.png",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_copFooterStakingPage/mock_screenshot.png",
//                ScShotDir+"Staking_page/EnChrome/Screenshots_copFooterStakingPage/difference.png");
//
//    }
}
