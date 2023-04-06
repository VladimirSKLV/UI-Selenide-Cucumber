package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import listener.AllureListener;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static constants.Constants.CURRENT_ENV;

public class DashboardPage extends AllureListener {

    private final SelenideElement title = $("section[class$='business-header'] .flex");
    private final SelenideElement loginInput = $("input[id='email']");
    private final SelenideElement passwordInput = $("input[id='password']");
    private final SelenideElement submitButton = $x("//button[contains(@class, 'mt-6')]");
    private final SelenideElement yourRevenue = $x("//div[@class='block-text-first']/div[text()=' Ваша выручка: ']");

    @Given("Переходим на главную страницу")
    public void openDashboardPage() {
        if(!title.isDisplayed()) {
            Selenide.open(CURRENT_ENV.meUrl());
            loginInput.sendKeys(CURRENT_ENV.meUsername());
            passwordInput.sendKeys(CURRENT_ENV.mePassword());
            submitButton.click();
            Selenide.sleep(1500);
        }
    }

    @And("Проверяем отображение {string}")
    public boolean checkRevenue(String revenue) {
        return yourRevenue.getText().contains(revenue);
    }
}
