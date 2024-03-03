package gitHub;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class Homework_2 {

    @Test
    void task_1() {
        Configuration.holdBrowserOpen = true;
        open("https://github.com/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        sleep(7000);

        $x("//button[contains(text(),'Solutions')]").hover();
        sleep(5000);

        $(withText("Enterprise")).click();
        sleep(5000);

        $x("//p[contains(text(),'and deliver')]").shouldHave(exactText("To build, scale, and deliver secure software."));

    }

    @Test
    void task_2() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.holdBrowserOpen = true;
        open("/drag_and_drop");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        sleep(7000);

        actions().moveToElement($(byText("A"))).clickAndHold().moveByOffset(250, 0).release().perform();
        //$("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));

    }
}
