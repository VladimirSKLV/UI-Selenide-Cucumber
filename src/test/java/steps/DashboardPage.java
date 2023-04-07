package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import listener.AllureListener;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static constants.Constants.CURRENT_ENV;

public class DashboardPage extends AllureListener {

    private final SelenideElement title = $("section[class$='business-header'] .flex");
    private final SelenideElement loginInput = $("input[id='email']");
    private final SelenideElement passwordInput = $("input[id='password']");
    private final SelenideElement submitButton = $x("//button[contains(@class, 'mt-6')]");
    private final SelenideElement yourRevenue =
            $x("//div[@class='block-text-first']/div[text()=' Ваша выручка: ']");
    private final SelenideElement countReceipt =
            $x("//div[@class='block-text-second']/div[text()=' Количество чеков:  ']");
    private final SelenideElement meanReceipt =
            $x("//div[@class='block-text-third']/div[text()=' Средний чек:  ']");
    private final SelenideElement countCustomers =
            $x("//div[@class='block-text-first']/div[contains(text(), 'Всего покупателей')]");
    private final SelenideElement aiTitle =
            $x("//div[@class='section mb-6']/div[contains(text(), 'SWiP')]");

    @Given("Переходим на главную страницу")
    public void openDashboardPage() {
        Selenide.open(CURRENT_ENV.meUrl());
        if(!title.isDisplayed()) {
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

    @And("Проверяем отображение {string}, {string}, {string}")
    public void checkOtherFields(String expectedReceipt, String expectedMean, String expectedCustomers) {
        boolean isReceiptDisplayed = countReceipt.getText().contains(expectedReceipt);
        boolean isMeanDisplayed = meanReceipt.getText().contains(expectedMean);
        boolean isCustomersDisplayed = countCustomers.getText().contains(expectedCustomers);
        boolean areAllFieldsDisplayed = isReceiptDisplayed && isMeanDisplayed && isCustomersDisplayed;
        if (!areAllFieldsDisplayed) {
            System.out.println("Some of the expected fields are not displayed");
        }
        Assert.assertTrue(areAllFieldsDisplayed);
    }

    @And("Проверяем название блока {string}")
    public void checkAiTitle(String arg0) {
        boolean isAiTitleDisplayed = aiTitle.getText().contains(arg0);
        Assert.assertTrue(isAiTitleDisplayed);
    }
}
