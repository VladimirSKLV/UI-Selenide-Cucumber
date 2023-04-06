package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static constants.Constants.Allure.QA;

@CucumberOptions(
        features = {"src/test/resources/scenarios"},
        glue = {"steps"}
)
@Test
@Owner(QA)
public class AuthTest extends AbstractTestNGCucumberTests {
}
