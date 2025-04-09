package runner1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resource/Features1/checkout.feature"},
					glue = ("stepdef1"),
					plugin = {"pretty", "html:target/htmlreports/report.html"}//,
					//tags = "@set1"
				)


public class checkout_testrunner extends AbstractTestNGCucumberTests
{

}
