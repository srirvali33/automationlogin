package cuc_selinium.cuc_selinium;
import java.io.File;
import org.junit.*;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue= {"seleniumgluecode"},features = "src/main/java/Features",plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
monochrome = true)
public class AppTest
{

	@AfterClass
    public static void writeExtentReport() {
	Reporter.loadXMLConfig(new File("src/test/java/config/configur.xml"));
	}
}
