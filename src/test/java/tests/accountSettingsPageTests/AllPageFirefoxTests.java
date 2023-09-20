package tests.accountSettingsPageTests;

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
//    @Parameters({"fund_page", "ScShotDir"})
//    @Test(priority = 1)
//    public void allHeaderFundPage(String fund_page, String ScShotDir) throws IOException, InterruptedException {
//        // Resolution
//        CommonActions.setBrowserWindowSize("mac 14");
//        //Open a page for test
//        action.openPage(fund_page);
//        //Click button "Accept" use of cookies
//        action.ifButtonIsPresentClick("//button[@class='accept-cookies-btn']");
//        Thread.sleep(1000);
//        //Run the Pixel perfect test for a selected element
//        pixelPerfectAssert.byElement("//header[@class='header-wrapper']",
//                ScShotDir+"Fund_page/EnFirefox/Screenshots_allHeaderFundPage/real_life_screenshot.png",
//                ScShotDir+"Fund_page/EnFirefox/Screenshots_allHeaderFundPage/mock_screenshot.png",
//                ScShotDir+"Fund_page/EnFirefox/Screenshots_allHeaderFundPage/difference.png");
//
//    }


}
