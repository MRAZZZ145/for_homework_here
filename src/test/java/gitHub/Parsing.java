package gitHub;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Parsing {
    public static void main(String[] args) {
        int n = 10;
        String[] x = new String[n];
        Configuration.holdBrowserOpen = true;
        open("https://github.com/selenide/selenide/wiki");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        sleep(5000);
        String m = String.valueOf($$(".markdown-body ul li a").size());
        System.out.println(m);
        /*for (int i = 0; i < n; i++) {
            x[i] = String.valueOf($$(".markdown-body ul li a").get(i).getText());
        }
        for (String y : x) {
            System.out.println(y);
        }*/
    }

    @Test
    void ShortParsing() {
        int size;

        Configuration.holdBrowserOpen = true;
        open("https://github.com/selenide/selenide/wiki");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        sleep(5000);
        size = $$(".markdown-body ul li a").size();

        String[] lists = new String[size];

        for (int i = 0; i < size; i++) {
            lists[i] = String.valueOf($$(".markdown-body ul li a").get(i).getText());
        }

        for (String list : lists) {
            System.out.println(list);
        }
    }
}