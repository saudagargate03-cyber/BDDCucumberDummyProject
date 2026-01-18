package runnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinations",monochrome=true, tags="@smoke")
public class testNGRunner extends AbstractTestNGCucumberTests{
	

}
