package gitHub;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Homework_1 {

    @Test
    void Homework_1() {
        Configuration.holdBrowserOpen = true;
        // Откройте страницу Selenide в GitHub
        open("https://github.com/selenide/selenide");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        sleep(10000);
        // Перейти в раздел Wiki проекта
        $("ul li a[id=wiki-tab]").click();
        sleep(5000);
        // Убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $$(".markdown-body ul li a").findBy(Condition.text("Soft assertions"))
                .shouldHave(Condition.text("Soft assertions")).scrollTo().click();
        sleep(5000);
        // Открыть сраницу SoftAssertions, проверить что внутри есть пример кода для JUnit5
        $$(".markdown-body h4").findBy(Condition.text("JUnit5")).scrollTo();
    }
}
