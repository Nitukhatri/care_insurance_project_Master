package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = ".//Features//CareSupremeFeatures//getFreeQuoteFeatures.feature",
		glue = "CareSupremeTest",
		dryRun = false,
		monochrome = true,
		tags =  "@test",
		plugin = {"pretty","html:target/cucumber-reports/getFreeQuoteReport.html"}
	)

public class careSupremeRunner extends AbstractTestNGCucumberTests {

}
