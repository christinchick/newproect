package firstTask;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionTest {
    @Test
    void homeWorkTwo (){
        SelenideLogger.addListener("allure", new AllureSelenide());

        Selenide.open("https://skyward-crimea.ru");
        $(".elementor-button-wrapper").click();
        $(".elementor-widget-wrap").shouldHave(visible);
        $("#form-field-name").setValue("Кристина");
        $("#form-field-email").setValue("+79780382764");
        $("button[type='submit']").click();
        $(".elementor-message").shouldHave(text("Сообщение успешно отправлено!"));
    }
}
