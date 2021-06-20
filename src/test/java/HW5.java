
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pasges.FillForm;
import com.github.javafaker.Faker;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HW5 {
    static Logger log = LoggerFactory.getLogger(HW5.class);
    public String subjectName = "English",
            gender = "Male",
            yearofbirth = "1980",
            monthofbirth = "January",
            dayofbirth = "10",
            hobbie = "Sports",
            filepath = "src/test/resources/testpic.jpg";

    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            emailAddress = faker.internet().emailAddress(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            address = faker.address().fullAddress();

    @BeforeAll
    static void setUpConfig() {
        log.info("@BeforeAll");
        // Configuration.startMaximized = true;
    }

    FillForm fillForm = new FillForm();

    @Test
    void selenideFormFill() {
        open("https://demoqa.com/automation-practice-form");

        fillForm.typeFirstName(firstName);
        fillForm.typeLastName(lastName);
        fillForm.typeEmail(emailAddress);
        fillForm.choiseGender(gender);
        fillForm.typeNumber(userNumber);
        fillForm.choisedata(dayofbirth, monthofbirth, yearofbirth);
        fillForm.typeSubject(subjectName);
        fillForm.sendfile(filepath);
        fillForm.choiseHobbies();
        fillForm.currentAddress(address);
        fillForm.choisestate();
        fillForm.choisecity();

        $("#submit").scrollTo().click();
        $(".table").shouldHave(text(firstName), text(lastName), text(emailAddress), text(gender), text(userNumber),
                text(dayofbirth), text(monthofbirth), text(yearofbirth), text(hobbie), text(subjectName), text(address), text("NCR"), text("Delhi"));
    }
}


