package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class driverAllocation {
public static WebDriver driverAllocate(String s){
    if(s.equals("chrome")) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/Driver/chromedriver.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();

        // Use File.separator as it will work on any OS
        prefs.put("download.default_directory",new File(System.getProperty("user.dir") + "src/main/downloadedFiles").getAbsolutePath());

        // Adding capabilities to ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        // Launching browser with desired capabilities
        WebDriver driver = new ChromeDriver(options);
      //  driver.manage().window().maximize();
        System.out.println("Executing Chrome Driver in UI mode..\n");
        return driver;
    }

    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/Driver/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    System.out.println("Executing firefox Driver in UI mode..\n");
    return driver;
}
}
