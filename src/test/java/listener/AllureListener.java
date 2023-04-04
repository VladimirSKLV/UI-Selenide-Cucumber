package listener;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;

@Listeners(AllureListener.class)
public class AllureListener extends TestListenerAdapter {
    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        saveScreenshot(Selenide.screenshot(OutputType.BYTES));
    }
}
