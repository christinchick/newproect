package firstTask;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SoftAssertionTest {
    @Test
    void homeWorkTwo (){

        Selenide.open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".Layout-sidebar").$(byText("Show 2 more pages…")).click();
        $(".Layout-sidebar").$(byText("SoftAssertions")).shouldHave(visible);
        $(".Layout-sidebar").$(byText("SoftAssertions")).click();
        $(".markdown-body").$(byText("Using JUnit5 extend test class:")).shouldHave(visible);
    }
}
