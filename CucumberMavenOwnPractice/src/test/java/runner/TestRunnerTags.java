package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Vignesh\\WorkSpace\\CucumberMavenOwnPractice\\features\\TagsDemo.feature",
glue= "stepdefinition",
format= {"pretty","html:target/reports/cucumber.html","json:target/reports/cucumber.json","junit:target/reports/cucumber.xml"},
monochrome = true,
strict = true,
tags= {"@SmokeTest","@RegressionTest"},
dryRun = false
)
public class TestRunnerTags {

}
