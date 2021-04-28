package ING_Insurance.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\ING_Insurance\\FeatureFiles\\ING_RestAPI.feature",
		//glue =  "src\\test\\java\\ING_Insurance\\StepDefenition",
		plugin = {"pretty",  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports/CucumberTestReport.json", "junit:target/cucumber-reports/cucumber.xml", "html:target/cucumber-html-reports"},
		monochrome = true,
		dryRun = false,
		tags = "@DeleteCall"
		)
public class RunCukesTest {

}
