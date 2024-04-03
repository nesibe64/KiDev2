package stepdefinitions;

import io.cucumber.java.en.*;
import utils.ConfigReader;
import utils.Driver;

public class Sample {
    @Given("user try to login with {string}")
    public void user_try_to_login_with(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }
    @Then("user checks each attemp result and reposrts")
    public void user_checks_each_attemp_result_and_reposrts() {

    }
    @Then("app close")
    public void app_close() {

    }
}
