package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Media {
    public static void takeScreenshotOfTheEntirePage() throws IOException {

        File image = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);

        String now = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+now+"image.png";

        FileUtils.copyFile(image,new File(path));
    }

    public static void takeScreenshotOfThisElement(WebElement element) throws IOException {
        File image = element.getScreenshotAs(OutputType.FILE);
        String now = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/ElementScreenshot/"+now+"image.png";
        FileUtils.copyFile(image,new File(path));
    }
}
