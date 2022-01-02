package runner;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberPropertiesProvider;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import steps.BaseClass;

@CucumberOptions(features={"src/test/java/features"}, 
				 glue = "steps", //package
				 monochrome = true,
				 publish = true,
				// tags = "@Smoke" //to execute regression test cases only
				// tags = "@Regression or @Smoke" // all the scenarios with either @Regression or @Smoke
				// tags = "@Regression and @Smoke" // all the scenarios having both @Regression and @Smoke
				 tags = "not @Regression" //except regression all other scenarios will be executed
		)
public class CucumberRunner extends BaseClass{
	
	
}
