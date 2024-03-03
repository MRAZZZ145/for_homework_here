import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    /*
    Открыть форму авторизации
    https://qa.guru/cms/system/login
    Ввести адрес электронной почты
    Ввести пароль
    Нажать на кнопку "Войти"
    Нажать на кнопку "Личный кабинет"
    Проверить успешную авторизацию
     */

    @Test
    void successfulLoginTest() throws InterruptedException {
        Configuration.holdBrowserOpen = true; // Открывается браузер и не будет закрываться
        open("https://vk.com/"); // Открыть ссылку в браузере
        Thread.sleep(10000);
        $(By.cssSelector("input.VkIdForm__input[name=login]")).setValue("Rhbkk");

    }

    @Test
    void unsuccessfulLoginTest() {

    }
}
