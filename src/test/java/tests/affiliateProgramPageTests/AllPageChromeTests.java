package tests.affiliateProgramPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class AllPageChromeTests extends BaseTest {
    public AllPageChromeTests() {
        super("win_chrome");
    }
    // DREAM-839
    //HEADER TESTS
    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 1)
    public void allHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_allHeaderAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_allHeaderAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_allHeaderAffiliateProgramPage/difference.png");

    }

    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_getStartedHeaderAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_getStartedHeaderAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_getStartedHeaderAffiliateProgramPage/difference.png");

    }

    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item learn-nav-item']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//li[@class='header-nav-item learn-nav-item']/div[@class='header-drop-down']",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_learnHeaderAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_learnHeaderAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_learnHeaderAffiliateProgramPage/difference.png");

    }

    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][4]");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//nav/ul/li[5]/div[@class='header-drop-down']",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_resourcesHeaderAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_resourcesHeaderAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_resourcesHeaderAffiliateProgramPage/difference.png");

    }

//    @Parameters({"affiliate_program_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(affiliate_program_page);
//        //Waiting when the page is completely loaded
//        action.waitElementIsVisible("//div[@class='section-wrapper']");
//        //Hover
//        action.hoverOverAnElementByXpath("//li[@class='header-nav-item'][1]");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='header-drop-down'][1]",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_langItemHeaderAffiliateProgramPage/real_life_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_langItemHeaderAffiliateProgramPage/mock_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_langItemHeaderAffiliateProgramPage/difference.png");
//
//    }


    //BODY TESTS
    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 6)
    public void mainSectionAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='affiliate-program-section']",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_mainSectionAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_mainSectionAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_mainSectionAffiliateProgramPage/difference.png");

    }

    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 7)
    public void affiliateSectionAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Scroll
        action.moveViewableElementIntoCenter2("//section[@data-testid='affiliate-wrapper']");
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//section[@data-testid='affiliate-wrapper']",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_affiliateSectionAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_affiliateSectionAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_affiliateSectionAffiliateProgramPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 8)
    public void allFooterAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_allFooterAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_allFooterAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_allFooterAffiliateProgramPage/difference.png");

    }

//    @Parameters({"affiliate_program_page", "ScShotDir"})
//    @Test(priority = 9)
//    public void partnFooterAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(affiliate_program_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='partn-container']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='partn-container']",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_partnFooterAffiliateProgramPage/real_life_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_partnFooterAffiliateProgramPage/mock_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_partnFooterAffiliateProgramPage/difference.png");
//
//    }
//
//    @Parameters({"affiliate_program_page", "ScShotDir"})
//    @Test(priority = 10)
//    public void subFooterAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(affiliate_program_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='subfooter']");
//        //Time
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='subfooter']",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_subFooterAffiliateProgramPage/real_life_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_subFooterAffiliateProgramPage/mock_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_subFooterAffiliateProgramPage/difference.png");
//
//    }
//
//    @Parameters({"affiliate_program_page", "ScShotDir"})
//    @Test(priority = 11)
//    public void copFooterAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(affiliate_program_page);
//        //scroll
//        action.moveViewableElementIntoCenter2("//div[@class='copy-container']");
//        //Time
//        Thread.sleep(100);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//div[@class='copy-container']",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_copFooterAffiliateProgramPage/real_life_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_copFooterAffiliateProgramPage/mock_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnChrome/Screenshots_copFooterAffiliateProgramPage/difference.png");
//
//    }
}