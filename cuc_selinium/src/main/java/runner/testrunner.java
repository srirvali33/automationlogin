package runner;

import java.io.File;
import org.junit.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "seleniumgluecode" }, features = "src/main/java/Features/", monochrome = true, plugin = {
		"pretty", "html:target/cucumber", "json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" }

)

public class testrunner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("src/main/java/config/configur.xml"));

	}

}
