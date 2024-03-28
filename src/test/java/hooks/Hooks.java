package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("BEFORE METHODS");
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("AFTER METHOD");
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
            Driver.closeDriver();
        }
        Driver.closeDriver();
    }
}
