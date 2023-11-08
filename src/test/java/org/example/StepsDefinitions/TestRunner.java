package org.example.StepsDefinitions;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro.feature",
        glue = {"StepsDefinitions"},
        monochrome=true,
        plugin= {"pretty", "json:target/JSONReports/report.json"}
)
public class TestRunner {
}
