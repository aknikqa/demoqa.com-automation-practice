
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

    public class Simpletestdemoqa {
        @Test
        void simpletestdemoqa() {
            open("https://www.google.com/");
            $("button + button").click();
            $("[name=q]").setValue("selenide").pressEnter();
            $("[id=search]").shouldHave(text("selenide.org"));
        }
    }