package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.Announcements;
import pages.Dashboard;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class CreateAndEditAnn {

    LoginPage loginPage = new LoginPage();
    Dashboard dashboard = new Dashboard();
    Announcements announcements = new Announcements();

    @Given("user goes to the page with email and pass")
    public void user_goes_to_the_page_with_email_and_pass() {

        Driver.getDriver().get(ConfigReader.getProperty("kitchendev_url"));
        Driver.wait(2);
        loginPage.email.sendKeys(ConfigReader.getProperty("kitchen_user"));
        Driver.wait(2);
        loginPage.password.sendKeys(ConfigReader.getProperty("kitchen_pass"));
        Driver.wait(2);
        loginPage.loginbutton.click();
        Driver.wait(2);

    }
    @When("user goes to the Announcements page")
    public void user_goes_to_the_announcements_page() {

        dashboard.announcements.click();
        Driver.wait(2);

    }

    @When("user clicks the three dot to edit an announcement")
    public void user_clicks_the_three_dot_to_edit_an_announcement() {

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(announcements.announcement).perform();
        Driver.wait(1);
        announcements.threeDot.click();
        Driver.wait(1);

    }


    @Then("user clicks edit announcement and able to see edit popup")
    public void user_clicks_edit_announcement_and_able_to_see_edit_popup() {

        announcements.edit.click();
        Driver.wait(1);
        Assert.assertTrue(announcements.submit.isDisplayed());

    }
}
