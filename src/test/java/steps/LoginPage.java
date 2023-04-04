package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import listener.AllureListener;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static constants.Constants.CURRENT_ENV;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class LoginPage extends AllureListener {

    private final SelenideElement loginInput = $("input[id='email']");
    private final SelenideElement passwordInput = $("input[id='password']");
    private final SelenideElement submitButton = $x("//button[contains(@class, 'mt-6')]");
    private final SelenideElement title = $x("//div[text()='Вход']");

    @Given("Я открываю страницу сайта")
    public void openMeLogIn() {
        Selenide.open(CURRENT_ENV.meUrl());
        if(title.isDisplayed()) {
            waitLoadMainPage();
        }
    }

    @When("Я ввожу свои учетные данные")
    public void inputFields() {
        loginInput.sendKeys(CURRENT_ENV.meUsername());
        passwordInput.sendKeys(CURRENT_ENV.mePassword());
    }

    @And("Я нажимаю на кнопку входа")
    public void clickButton() {
        submitButton.click();
        Selenide.sleep(4000);
    }

    @Then("Я попадаю на страницу профиля")
    public void waitLoadMainPage() {
        String mainPage = CURRENT_ENV.mainPage();
        String actualPage = Selenide.webdriver().driver().url();
        assertEquals(mainPage, actualPage);
    }

    @And("Я получаю статус {int}")
    public void checkStatus(int expectedStatus) {
        given()
                .get(Selenide.webdriver().driver().url())
                .then()
                .statusCode(expectedStatus);
    }
}
