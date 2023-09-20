package tests.accountAffiliateProgramPageTests;

import Common.CommonActions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class AllPageFirefoxTests extends BaseTest {
    public AllPageFirefoxTests() {
        super("win_firefox");
    }
    // SIGN IN
    @Parameters({"main_page"})
    @Test(priority = 1)
    public void signInUser(String main_page) throws InterruptedException {
        //Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(main_page);
        // Authorization
        action.signInQaUser(main_page);
        //Timeout
        Thread.sleep(1000);
    }

    //HEADER TESTS
    @Parameters({"account_affiliate_program_page", "ScShotDir"})
    @Test(priority = 2)
    public void allHeaderAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_affiliate_program_page);
        //Sleep
        Thread.sleep(1000);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper account-header header-wrapper--auth header-wrapper--profile']",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_allHeaderAccountAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_allHeaderAccountAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_allHeaderAccountAffiliateProgramPage/difference.png");

    }

    @Parameters({"account_affiliate_program_page", "ScShotDir"})
    @Test(priority = 3)
    public void getStartedHeaderAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_affiliate_program_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        //Sleep
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_getStartedHeaderAccountAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_getStartedHeaderAccountAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_getStartedHeaderAccountAffiliateProgramPage/difference.png");

    }

    @Parameters({"account_affiliate_program_page", "ScShotDir"})
    @Test(priority = 4)
    public void learnHeaderAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_affiliate_program_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_learnHeaderAccountAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_learnHeaderAccountAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_learnHeaderAccountAffiliateProgramPage/difference.png");

    }

    @Parameters({"account_affiliate_program_page", "ScShotDir"})
    @Test(priority = 5)
    public void resourcesHeaderAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_affiliate_program_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_resourcesHeaderAccountAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_resourcesHeaderAccountAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_resourcesHeaderAccountAffiliateProgramPage/difference.png");

    }

////    @Parameters({"account_affiliate_program_page", "ScShotDir"})
////    @Test(priority = 6)
////    public void langItemHeaderAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
////        // Resolution
////        CommonActions.setBrowserWindowSize("mac 14");
////        //Open a page for test
////        action.openPage(account_affiliate_program_page);
////        //Hover
////        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
////        //Run the Pixel perfect test for a selected element
////        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
////                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_langItemHeaderAccountAffiliateProgramPage/real_life_screenshot.png",
////                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_langItemHeaderAccountAffiliateProgramPage/mock_screenshot.png",
////                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_langItemHeaderAccountAffiliateProgramPage/difference.png");
////
////    }

    @Parameters({"account_affiliate_program_page", "ScShotDir"})
    @Test(priority = 7)
    public void notificationsHeaderAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_affiliate_program_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-notifications']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='messages-dropdown__component active']",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_notificationsHeaderAccountAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_notificationsHeaderAccountAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_notificationsHeaderAccountAffiliateProgramPage/difference.png");

    }

    @Parameters({"account_affiliate_program_page", "ScShotDir"})
    @Test(priority = 8)
    public void profileHeaderAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_affiliate_program_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-profile']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile__dropdown active profile__dropdown--account']",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_profileHeaderAccountAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_profileHeaderAccountAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_profileHeaderAccountAffiliateProgramPage/difference.png");

    }


    //BODY TESTS
    @Parameters({"account_affiliate_program_page", "ScShotDir"})
    @Test(priority = 9)
    public void mainSectionAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_affiliate_program_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='d-flex account-content-wrap']",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_mainSectionAccountAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_mainSectionAccountAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_mainSectionAccountAffiliateProgramPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"account_affiliate_program_page", "ScShotDir"})
    @Test(priority = 10)
    public void allFooterAccountAffiliateProgramPage(String account_affiliate_program_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_affiliate_program_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_allFooterAccountAffiliateProgramPage/real_life_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_allFooterAccountAffiliateProgramPage/mock_screenshot.png",
                ScShotDir+"AccountAffiliateProgram_page/EnFirefox/Screenshots_allFooterAccountAffiliateProgramPage/difference.png");

    }



}
