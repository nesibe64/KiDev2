package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class Sample1 {

   LoginPage loginPage = new LoginPage();

    @Given("user goes the page")
    public void user_goes_the_page() {

        Driver.getDriver().get(ConfigReader.getProperty("kitchendev_url"));
        Driver.wait(2);

    }
    @When("user enters username")
    public void user_enters_username() {
        loginPage.email.sendKeys(ConfigReader.getProperty("kitchen_user"));
        Driver.wait(2);

    }
    @When("user enters password")
    public void user_enters_password() {
        loginPage.password.sendKeys(ConfigReader.getProperty("kitchen_pass"));
        Driver.wait(2);
        loginPage.loginbutton.click();
        Driver.wait(2);

    }
    @Then("user is on dashboard")
    public void user_is_on_dashboard() {

        Assert.assertEquals(loginPage.dashboard.getText(),"Dashboard");


    }

    @When("user enters wrong username")
    public void user_enters_wrong_username() {

        loginPage.email.sendKeys("wrong@email.com");

    }
    @When("user enters wrong password")
    public void user_enters_wrong_password() {
        loginPage.password.sendKeys("wrongpass");
        loginPage.loginbutton.click();

    }
    @Then("user see alert message")
    public void user_see_alert_message() {

        Assert.assertTrue(loginPage.alert.isDisplayed());

    }
}
