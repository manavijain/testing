package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resource/Features/1_login.feature"},
					glue = ("stepdef"),
					plugin = {"pretty", "html:target/htmlreports/report.html"},
					tags = "@set1"
				)


public class runner extends AbstractTestNGCucumberTests
{

}
