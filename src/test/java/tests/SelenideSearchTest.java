import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearchTest {
    @BeforeEach
    void setUp() {
        Configuration.baseUrl = "https://github.com";
        Configuration.pollingInterval = 2000;
    }

    @Test
    void wikiSoftAssertionsTest() {
        // - Откройте страницу Selenide в Github
        open("/selenide/selenide");
        // - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("button.js-wiki-more-pages-link").click();
        $(byText("SoftAssertions")).click();


    }


}