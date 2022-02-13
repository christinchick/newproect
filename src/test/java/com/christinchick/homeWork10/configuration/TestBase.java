package com.christinchick.homeWork10.configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;


public class TestBase {

    @BeforeAll
    static void setUp() {
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion= System.getProperty("version", "91");
        Configuration.browserSize= System.getProperty("browserSize", "1960x760");
        Configuration.baseUrl = "https://skyward-crimea.ru";
        String remoteUrl = System.getProperty("remoteUrl","selenoid.autotests.cloud/wd/hub");
        String login = System.getProperty("login","user1");
        String password = System.getProperty("password","1234");
        String url = "https://" + login + ":" + password + "@" + remoteUrl;
        Configuration.remote = url;


    DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
    Configuration.browserCapabilities = capabilities;
}


    @AfterEach
    void addAttachments() {

        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
