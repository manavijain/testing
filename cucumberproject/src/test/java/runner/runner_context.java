package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//resource/logincontext"},
					glue = ("stepdef_context"),
					plugin = {"pretty", "html:target/htmlreports/report.html"},
					tags="@set5"
				)


public class runner_context  extends AbstractTestNGCucumberTests
{

}


