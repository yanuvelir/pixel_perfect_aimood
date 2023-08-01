package tests.marketsPageTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.io.IOException;

public class FooterTests extends BaseTest {
    public FooterTests() {
        super("win_chrome");
    }

    @Test
    public void allFooterMarketsPage() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//footer[@class='footer']",
                "Screenshots/Markets_page/EnChrome/Screenshots_allFooterMarketsPage/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_allFooterMarketsPage/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_allFooterMarketsPage/difference.png");

    }

    @Test
    public void langFooterMarketsPageDropDownPart1() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        // Click lang
        action.clickByXpath("//div[@data-test-id='lang-footer']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
                "Screenshots/Markets_page/EnChrome/Screenshots_langFooterMarketsPageDropDownPart1/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_langFooterMarketsPageDropDownPart1/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_langFooterMarketsPageDropDownPart1/difference.png");

    }

    @Test
    public void langFooterMarketsPageDropDownPart2() throws IOException, InterruptedException {
        //Open a page for test
        action.openPage("https://dex-trade.com/markets");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='markets-container']");
        //Click button "Accept" use of cookies
        action.clickByXpath("//button[@class='close-button']");
        // Click lang
        action.clickByXpath("//div[@data-test-id='lang-footer']");
        // Select Hindi
        action.viewElementByXpath("//div[@data-test-id='hi']");
        //Hover
        action.hoverOverAnElementByXpath("//div[@data-test-id='hi']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='dropdown-container language-container footer-lang-style']",
                "Screenshots/Markets_page/EnChrome/Screenshots_langFooterMarketsPageDropDownPart2/real_life_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_langFooterMarketsPageDropDownPart2/mock_screenshot.png",
                "Screenshots/Markets_page/EnChrome/Screenshots_langFooterMarketsPageDropDownPart2/difference.png");

    }
}
