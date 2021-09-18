package features.addtwo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features/addtwo/calculator.feature",
        plugin = {
                "junit:target/junit-cucumber-reports/calculatortwo.xml",
                "json:target/cucumber-reports/calculatortwo.json",
                "pretty"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CalculatorRunTest {
}
