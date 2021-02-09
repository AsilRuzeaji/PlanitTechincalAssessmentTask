package com.panit.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "timeline:target/timeline-report"
        }, // here is to generate very nice and human readable report
        features = {
                "src/test/java/resources/features"
        },
        glue = "com/planit/step_definitions",
        dryRun = false,
        tags = "",
        publish = true
)
public class CukesRunner {
}
