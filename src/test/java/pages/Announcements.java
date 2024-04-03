package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Announcements {
    public Announcements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //h5[@class='content-title'] hoverover mouse
    //span[@class='actions-hover']  click 3 dot
    //span[.='Edit announcement'] click to edit
    //button[.='Submit'] control submit button

    @FindBy(xpath = "//h5[@class='content-title']")
    public WebElement announcement;

    @FindBy(xpath = "//span[@class='actions-hover']")
    public WebElement threeDot;

    @FindBy(xpath = "//span[.='Edit announcement']")
    public WebElement edit;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submit;
}
