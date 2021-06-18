package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static Functions.driverAllocation.driverAllocate;

public class Selenium {
    static WebDriver driver;
    static WebDriverWait wait;
    @BeforeTest
    public void setup(){
        driver=driverAllocate("chrome");
    }
    @Test
    public void demo() throws InterruptedException {
        driver.get("https://www.frugaltesting.com");
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-menu\"]/div/div[1]")));
       WebElement product= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"MyHeader\"]/li[1]")));
       Actions actions= new Actions(driver);
       actions.moveToElement(product);
       Thread.sleep(5000);
}
@AfterTest
    public void close(){
        driver.close();
}
}
