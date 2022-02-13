package com.christinchick.homeWork10;

import com.christinchick.homeWork10.configuration.LoginAndPassword;
import com.christinchick.homeWork10.configuration.TestBase;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import io.qameta.allure.selenide.AllureSelenide;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.function.Supplier;

import static com.codeborne.selenide.Browsers.OPERA;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TestsCheckFormNumbers extends TestBase {

    @Test
    @Owner("Christinchick")
    @Feature("OpenFormOnSkywardCrimeaRU")
    @Story("Проверка перехода на форму обратной связи")
    @DisplayName("Проверка обратной связи на сайте")
    void homeWorkTwo (){

        SelenideLogger.addListener("allure", new AllureSelenide());

        Selenide.open("https://skyward-crimea.ru");
        $(".elementor-button-wrapper").click();
        $(".elementor-widget-wrap").shouldHave(visible);
        $("#form-field-name").setValue("Кристина");
        $("#form-field-email").setValue("+79780382764");
//        $("button[type='submit']").click();
//        $(".elementor-message").shouldHave(text("Сообщение успешно отправлено!"));
    }
}

