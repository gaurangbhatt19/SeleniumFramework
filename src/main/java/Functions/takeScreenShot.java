package Functions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;


public class takeScreenShot {
    public static void screenShot(WebDriver driver, String message) throws IOException {
        File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
        LocalDateTime currentDateTime= LocalDateTime.now();
        String s=currentDateTime.toString();
        s=s.replace(":","_");
        s=s.replace(".","");
        System.out.println(System.getProperty("user.dir")+"\\src\\main\\Screenshots\\Grab_"+message+"_"+s+".png");
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\src\\main\\Screenshots\\Grab_"+message+"_"+s+".png"));

    }
    public void screenShotFunction(){

    }
}
