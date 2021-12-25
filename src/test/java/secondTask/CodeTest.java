package secondTask;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.w3c.dom.Text;

import static com.codeborne.selenide.Browsers.OPERA;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static java.nio.channels.SocketChannel.open;

public class CodeTest {

    @Test
    // Не получилось перенести элементы, с помощью Action().
    void DragAndDrop() {
       Selenide.open("https://the-internet.herokuapp.com/drag_and_drop");
       $("#column-b").dragAndDropTo($("#column-a"));
       $("#column-b").shouldHave(text("A")).shouldHave(visible);
    }
    }



