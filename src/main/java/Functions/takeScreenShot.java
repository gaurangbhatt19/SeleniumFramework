package Functions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.Screenshot;

import java.io.File;
import java.io.IOException;

public class takeScreenShot {
    public void screenShot(WebDriver driver) throws IOException {
        File scrFile = (((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"src/main/Screenshots/Grab_"));
    }
}
