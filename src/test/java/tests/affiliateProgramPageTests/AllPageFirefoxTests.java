package tests.affiliateProgramPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class AllPageFirefoxTests extends BaseTest {
    public AllPageFirefoxTests() {
        super("win_firefox");
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
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_allHeaderAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_allHeaderAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_allHeaderAffiliateProgramPage/difference.png");

    }

    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 2)
    public void getStartedHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_getStartedHeaderAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_getStartedHeaderAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_getStartedHeaderAffiliateProgramPage/difference.png");

    }

    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 3)
    public void learnHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_learnHeaderAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_learnHeaderAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_learnHeaderAffiliateProgramPage/difference.png");

    }

    @Parameters({"affiliate_program_page", "ScShotDir"})
    @Test(priority = 4)
    public void resourcesHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(affiliate_program_page);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(100);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_resourcesHeaderAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_resourcesHeaderAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_resourcesHeaderAffiliateProgramPage/difference.png");

    }

//    @Parameters({"affiliate_program_page", "ScShotDir"})
//    @Test(priority = 5)
//    public void langItemHeaderAffiliateProgramPage(String affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(affiliate_program_page);
//        //Hover
//        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_langItemHeaderAffiliateProgramPage/real_life_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_langItemHeaderAffiliateProgramPage/mock_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_langItemHeaderAffiliateProgramPage/difference.png");
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
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_mainSectionAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_mainSectionAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_mainSectionAffiliateProgramPage/difference.png");

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
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_affiliateSectionAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_affiliateSectionAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_affiliateSectionAffiliateProgramPage/difference.png");

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
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_allFooterAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_allFooterAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_allFooterAffiliateProgramPage/difference.png");

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
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_partnFooterAffiliateProgramPage/real_life_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_partnFooterAffiliateProgramPage/mock_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_partnFooterAffiliateProgramPage/difference.png");
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
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_subFooterAffiliateProgramPage/real_life_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_subFooterAffiliateProgramPage/mock_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_subFooterAffiliateProgramPage/difference.png");
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
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_copFooterAffiliateProgramPage/real_life_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_copFooterAffiliateProgramPage/mock_screenshot.png",
//                ScShotDir+"AffiliateProgram_page/EnFirefox/Screenshots_copFooterAffiliateProgramPage/difference.png");
//
//    }


}

