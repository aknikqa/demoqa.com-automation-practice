

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Automationpracticeform {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";

    }
    @Test
    void FillFormtest() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $("#firstName").setValue("Nik");
        $("#lastName").setValue("Somelastname");
        $("#userEmail").setValue("nik@test.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1920");
        $(".react-datepicker__day--005").click();
        $("#subjectsInput").setValue("Hindi").pressEnter();
        $("[for='hobbies-checkbox-1']").click();
        $("[for='hobbies-checkbox-3']").click();
        $("#uploadPicture").uploadFromClasspath("Screenshot_228.png");
        $("#currentAddress").setValue("city:Torino, street:Via");
        $("#react-select-3-input").val("Haryana").pressEnter();
        $("#react-select-4-input").val("Karnal").pressEnter();
        $("#submit").pressEnter();


        $(".table-responsive").shouldHave(
                text("Nik"),
                text("Somelastname"),
                text("nik@test.com"),
                text("1234567890"),
                text("05 May,1920"),
                text("Hindi"),
                text("Sports, Music"),
                text("Screenshot_228.png"),
                text("city:Torino, street:Via"),
                text("Haryana Karnal")
        );

    }

}