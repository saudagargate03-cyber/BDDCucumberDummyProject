package runnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",glue="stepDefinations",monochrome=true, tags="@smoke")
public class TestRunner extends AbstractTestNGCucumberTests{
	

}
