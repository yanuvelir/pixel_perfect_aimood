package tests.base;

import Common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import pages.base.Action;
import pages.pixel_perfect.PixelPerfectAssert;

import static Common.Config.CLEAR_COOKIES_AND_STORAGE;

public class BaseTest {
    protected WebDriver driver;
    protected Action action;
    protected CommonActions commonActions;
    protected PixelPerfectAssert pixelPerfectAssert;
    private String platformAndBrowser;

    public BaseTest(String platformAndBrowser) {
        this.platformAndBrowser = platformAndBrowser;
    }

    @BeforeMethod
    public void setUp() {
        driver = CommonActions.createDriver(platformAndBrowser);
        action = new Action(driver);
        commonActions = new CommonActions();
        pixelPerfectAssert = new PixelPerfectAssert(driver);

    }

    @AfterClass
    public void tearDown() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            js.executeScript("window.sessionStorage.clear()");
        }

        CommonActions.resetDriver();
    }

}

