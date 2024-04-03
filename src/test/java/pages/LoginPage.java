package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@formcontrolname='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    public WebElement password;

    @FindBy(xpath = "//button[.=' Login ']")
    public WebElement loginbutton;

    @FindBy(id = "m_aside_left_offcanvas_toggle")
    public WebElement left;

    @FindBy(xpath = "(//span[.=' Dashboard '])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "//div[.=' Invalid email / password combination ']")
    public WebElement alert;



}
