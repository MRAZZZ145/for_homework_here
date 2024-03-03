package gitHub;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.cssSelector;

public class SelenideRepositorySearch {

    String x = "testcontainers";

    @Test
    void shouldFindSelenideRepositoryAtTheTop() {
        Configuration.holdBrowserOpen = true;
        // открыть главную страницу
        open("https://github.com/");
        sleep(10000);
        // ввести в поле поиска selenide и нажать enter
        $(cssSelector("span.flex-1[data-target]")).click();
        sleep(5000);
        $("input.FormControl-medium").setValue("Selenide").pressEnter();
        sleep(5000);
        // кликнуть на первый репозиторий из списка найденных
        $$("div[data-testid=results-list]").first().$("span.search-match").click(); // выбрать из коллекции первый элемент
        sleep(5000);
        // проверка: заголовок selenide/selenide
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
    }


}
