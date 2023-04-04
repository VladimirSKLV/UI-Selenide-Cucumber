package tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/scenarios"},
        glue = {"steps"}
)
@Test
public class AuthTest extends AbstractTestNGCucumberTests {
}
