package gitHub;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class BestContributor {

    @Test
    void solncevShouldBeTheTopContributor() {
        Configuration.holdBrowserOpen = true;
        // открыть страницу репозитория селенида
        open("https://github.com/selenide/selenide");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        sleep(10000);
        // подвести мышку к первому аватару (поиск элемента на странице по тексту)
        $(".BorderGrid").$(Selectors.byText("Contributors"))
                .ancestor(".BorderGrid-row")
                .$$("ul li").first().hover();
        sleep(5000);
        // проверка тееста в всплывающем сообщении
        $$(".Popover-message").findBy(Condition.visible)
                .shouldHave(Condition.text("Andrei Solntsev"));
    }
}
