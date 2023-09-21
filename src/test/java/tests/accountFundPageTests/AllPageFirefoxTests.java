package tests.accountFundPageTests;

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
    @Parameters({"account_fund_page", "ScShotDir"})
    @Test(priority = 2)
    public void allHeaderAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_fund_page);
        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//header[@class='header-wrapper account-header header-wrapper--auth header-wrapper--profile']",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_allHeaderAccountFundPage/real_life_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_allHeaderAccountFundPage/mock_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_allHeaderAccountFundPage/difference.png");

    }

    @Parameters({"account_fund_page", "ScShotDir"})
    @Test(priority = 3)
    public void getStartedHeaderAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_fund_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-get-started']");
        //Sleep
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_getStartedHeaderAccountFundPage/real_life_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_getStartedHeaderAccountFundPage/mock_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_getStartedHeaderAccountFundPage/difference.png");

    }

    @Parameters({"account_fund_page", "ScShotDir"})
    @Test(priority = 4)
    public void learnHeaderAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_fund_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-learn']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-learn']",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_learnHeaderAccountFundPage/real_life_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_learnHeaderAccountFundPage/mock_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_learnHeaderAccountFundPage/difference.png");

    }

    @Parameters({"account_fund_page", "ScShotDir"})
    @Test(priority = 5)
    public void resourcesHeaderAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_fund_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.hoverOverAnElementByXpath("//li[@data-testid='head-nav-resources']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-resources']",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_resourcesHeaderAccountFundPage/real_life_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_resourcesHeaderAccountFundPage/mock_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_resourcesHeaderAccountFundPage/difference.png");

    }

////    @Parameters({"account_fund_page", "ScShotDir"})
////    @Test(priority = 6)
////    public void langItemHeaderAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
////        // Resolution
////        CommonActions.setBrowserWindowSize("mac 14");
////        //Open a page for test
////        action.openPage(account_fund_page);
////        //Hover
////        action.hoverOverAnElementByXpath("//div[@data-testid='head-nav-lang']");
////        //Run the Pixel perfect test for a selected element
////        pixelPerfectAssert.byElement("//ul[@data-testid='drop-list-get-started']",
////                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_langItemHeaderAccountFundPage/real_life_screenshot.png",
////                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_langItemHeaderAccountFundPage/mock_screenshot.png",
////                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_langItemHeaderAccountFundPage/difference.png");
////
////    }

    @Parameters({"account_fund_page", "ScShotDir"})
    @Test(priority = 7)
    public void notificationsHeaderAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_fund_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-notifications']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='messages-dropdown__component active']",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_notificationsHeaderAccountFundPage/real_life_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_notificationsHeaderAccountFundPage/mock_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_notificationsHeaderAccountFundPage/difference.png");

    }

    @Parameters({"account_fund_page", "ScShotDir"})
    @Test(priority = 8)
    public void profileHeaderAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_fund_page);
        //Sleep
        Thread.sleep(1000);
        //Hover
        action.clickByXpath ("//button[@data-testid='head-nav-profile']");
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile__dropdown active profile__dropdown--account']",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_profileHeaderAccountFundPage/real_life_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_profileHeaderAccountFundPage/mock_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_profileHeaderAccountFundPage/difference.png");

    }


    //BODY TESTS
    @Parameters({"account_fund_page", "ScShotDir"})
    @Test(priority = 9)
    public void mainSectionAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_fund_page);
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='profile-cust-wrapper']",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_mainSectionAccountFundPage/real_life_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_mainSectionAccountFundPage/mock_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_mainSectionAccountFundPage/difference.png");

    }


    //FOOTER TESTS
    @Parameters({"account_fund_page", "ScShotDir"})
    @Test(priority = 10)
    public void allFooterAccountFundPage(String account_fund_page, String ScShotDir) throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("mac 14");
        //Open a page for test
        action.openPage(account_fund_page);
        //scroll
        action.moveViewableElementIntoCenter2("//footer[@data-testid='footer-new']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@data-testid='footer-new']",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_allFooterAccountFundPage/real_life_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_allFooterAccountFundPage/mock_screenshot.png",
                ScShotDir+"AccountFund_page/EnFirefox/Screenshots_allFooterAccountFundPage/difference.png");

    }



}
