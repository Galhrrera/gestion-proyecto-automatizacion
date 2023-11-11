package org.example.StepsDefinitions;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example.StepsDefinitions"},
        monochrome=true,
        plugin= {"pretty", "json:target/JSONReports/report.json"}
)
public class TestRunner {
}
