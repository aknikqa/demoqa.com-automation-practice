

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxtests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";

    }
    @Test
    void FillFormtest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Nik");
        $("#userEmail").setValue("nik@test.com");
        $("#currentAddress").setValue("Some adress 1 ");
        $("#permanentAddress").setValue("Other adress street");
        $("#submit").pressEnter();

        $("#output #name").shouldHave(text("Nik"));
        $("#output #email").shouldHave(text("nik@test.com"));
        $("#output #currentAddress").shouldHave(text("Some adress 1 "));
        $("#output #permanentAddress").shouldHave(text("Other adress street"));

    }
}