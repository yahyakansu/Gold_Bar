package step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import utilities.ExtentReport;

public class Hook {
    @Before
    public void setup(Scenario scenario){
        ExtentReport.startTest(scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "screenshot report");
            ExtentReport.fail();
        }else {
            ExtentReport.pass();
        }
        Driver.closeDriver();
    }
}
