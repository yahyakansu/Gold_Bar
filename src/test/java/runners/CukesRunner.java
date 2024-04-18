package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import utilities.ExtentReport;

@RunWith (Cucumber.class)
@CucumberOptions (
        plugin = {"html:target/cucumber-reports.html","json:target/cukesreport.json"},
        features = "src/test/resources/features",
        glue = "step_defs",
        dryRun = false,
        tags = "@findbar"
)


public class CukesRunner{
    @AfterClass
    public static void tearDown(){
        ExtentReport.endReport();
    }
}

