package tests.mainPageTests;

import Common.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import java.io.IOException;

public class HelpCrunchChromeTest extends BaseTest {
    public HelpCrunchChromeTest(){
        super("win_chrome");
    }

    //HELP CRUNCH
    @Test(priority = 1)
    public void helpCrunchMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com/");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        //Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        //Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-start-screen helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchMainPage/difference.png");

    }

    @Test(priority = 2)
    public void helpCrunchStartConversationMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com/");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        // Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        // Клік кнопки Start Conversation
        action.clickByXpath("//div[@class='hcw-start-screen-compact__item']");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-chat helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchStartConversationMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchStartConversationMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchStartConversationMainPage/difference.png");

    }

    @Test(priority = 3)
    public void helpCrunchTextAreaMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com/");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        // Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        // Клік кнопки Start Conversation
        action.clickByXpath("//div[@class='hcw-start-screen-compact__item']");
        // ввести текст в інпут
        action.InputTextByXpath("//textarea[@id='helpcrunchChatTextarea']", "Hello, test message.");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-chat helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchTextAreaMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchTextAreaMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchTextAreaMainPage/difference.png");

    }

    @Test(priority = 4)
    public void helpCrunchKnowledgeBaseMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com/");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        // Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        // Клік кнопки Start Conversation
        action.clickByXpath("(//div[@class='hcw-start-screen-compact__item'])[4]");
        //Time
        Thread.sleep(1000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-knowledge-base helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchKnowledgeBaseMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchKnowledgeBaseMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchKnowledgeBaseMainPage/difference.png");

    }

    @Test(priority = 5)
    public void helpCrunchSendMessageMainPage() throws IOException, InterruptedException {
        // Resolution
        CommonActions.setBrowserWindowSize("FULL HD");
        //Open a page for test
        action.openPage("https://dex-trade.com/");
        //Waiting when the page is completely loaded
        action.waitElementIsVisible("//div[@class='right-nav']");
        //Click button "Accept" use of cookies
        action.ifButtonIsPresentClick("//button[@class='close-button']");
        // Перехід на iframe чата
        driver.switchTo().frame("helpcrunch-iframe");
        // Клік кнопки віджета
        action.clickByXpath("//div[@class='hcw-widget__button']");
        //Time
        Thread.sleep(2000);
        //Click button back
        action.clickByXpath("//button[@class='hcw-header-button _back']");
        // Клік кнопки Start Conversation
        action.clickByXpath("//div[@class='hcw-start-screen-compact__item']");
        // ввести текст в інпут
        action.InputTextByXpath("//textarea[@id='helpcrunchChatTextarea']", "Hello, test message.");
        // Click Send button Send
        action.clickByXpath("//button[@class='hcw-message-form__send']");
        //Time
        Thread.sleep(2000);
        //Run the Pixel perfect test for a selected element
        pixelPerfectAssert.byElement("//div[@class='hcw-chat helpcrunch-state-chat helpcrunch-chat-position-right hcw-widget-layout-1']",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchSendMessageMainPage/real_life_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchSendMessageMainPage/mock_screenshot.png",
                "Screenshots/Main_page/EnChrome/Screenshots_helpCrunchSendMessageMainPage/difference.png");

    }

}
