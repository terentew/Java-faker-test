package pasges;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;

public class FillForm {
    private SelenideElement firstNameinput = $("#firstName");
    private SelenideElement lastNameinput = $("#lastName");
    private SelenideElement emailAddressinput = $("#userEmail");
    private SelenideElement phoneNumberinput = $("#userNumber");
    private SelenideElement genderinput = $("#gender-radio");
    private SelenideElement subjectinput = $("#subjectsInput");
    private SelenideElement choisehobbie = $("[for=hobbies-checkbox-1]");
    private SelenideElement datePicker = $("#dateOfBirthInput");
    private SelenideElement monthSelect = $(".react-datepicker__month-select");
    private SelenideElement yearSelect = $(".react-datepicker__year-select");
    private SelenideElement filepathinput = $("#uploadPicture");
    private SelenideElement currentaddressinput = $("#currentAddress");

    private String daySelect = ".react-datepicker__day--0",
            hobbiesinput = "#hobbiesWrapper";


    public void typeFirstName(String value) {
        firstNameinput.setValue(value);
    }

    public void typeLastName(String value) {
        lastNameinput.setValue(value);
    }

    public void typeEmail(String value) {
        emailAddressinput.setValue(value);
    }

    public void typeNumber(String value) {
        phoneNumberinput.setValue(value);
    }

    public void choiseGender(String value) {
        $("input[value='" + value + "']").parent().click();
    }

    public void typeSubject(String value) {
        $(subjectinput).setValue(value).pressEnter();
        $(subjectinput).click();
    }

    public void choisedata(String dayofbirth, String monthofbirth, String yearofbirth) {
        $(datePicker).click();
        $(monthSelect).selectOption(monthofbirth);
        $(yearSelect).selectOption(yearofbirth);
        $(daySelect + dayofbirth).click();
    }

    public void choiseHobbies() {
        $(choisehobbie).click();
    }

    public void currentAddress(String value) {
        $(currentaddressinput).setValue(value);
    }

    public void sendfile(String value) {
        $(filepathinput).uploadFile(new File(value));
    }

    public void choisestate() {
        $("#react-select-3-input").setValue("NCR").pressEnter();
    }

    public void choisecity() {
        $("#react-select-4-input").setValue("Delhi").pressEnter();
    }

}
