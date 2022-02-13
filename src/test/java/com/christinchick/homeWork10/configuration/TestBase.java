package com.christinchick.homeWork10.configuration;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;


public class TestBase {

    @BeforeAll
    static void setUp(){
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
