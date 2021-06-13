package pasges;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FillFirstLastName {
    private SelenideElement firstNameinput=$("#firstName");
    private SelenideElement lastNameinput=$("#lastName");

    public void typeFirstName(String value) {
        firstNameinput.setValue(value);
    }

    public void typeLastName(String value) {
        lastNameinput.setValue(value);
    }
}