package features.add;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features/add/calculator.feature",
        plugin = {
                "junit:target/junit-cucumber-reports/calculator.xml",
                "json:target/cucumber-reports/calculator.json",
                "pretty"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CalculatorRunTest {
}
