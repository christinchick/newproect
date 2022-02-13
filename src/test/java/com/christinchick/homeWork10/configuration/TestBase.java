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
        Configuration.browserSize= System.getProperty("browserSize", "300x300");
        String remoteUrl = System.getProperty("remoteUrl");
        String login = System.getProperty("login");
        String password = System.getProperty("password");
        String url = "https://" + login + ":" + password + "@" + remoteUrl;


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
