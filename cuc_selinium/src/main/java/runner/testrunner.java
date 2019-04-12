package runner;
//hi
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/Features",plugin = { "pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},monochrome = true,glue= {"seleniumgluecode"}
)

public class testrunner {
	
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("src/main/java/config/configur.xml"));
    
    }
	
}
