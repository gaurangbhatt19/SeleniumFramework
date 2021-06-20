package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendKeys {
    public static void sendKeysByXpath(WebDriver driver,String xpath, String message){
        WebDriverWait wait = new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).sendKeys(message);
    }
}
