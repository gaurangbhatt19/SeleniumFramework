package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static Functions.DriverAllocation.driverAllocate;
import static Functions.takeScreenShot.*;
import static Pages.Login.*;

public class Selenium {
    static WebDriver driver;
    static WebDriverWait wait;
    @BeforeTest
    public void setup(){
        driver=driverAllocate("chrome");
    }
    @Test
    public void demo() throws InterruptedException, IOException {
        loginPageCpanelGrab(driver,"riyafrugal","Test@1234");
        Thread.sleep(5000);
        screenShotFolder(driver,"CpanelLoginPage");
}
@AfterTest
    public void close(){
        driver.close();
}
}
