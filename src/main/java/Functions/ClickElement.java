package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickElement {
    public static void clickByXpath(WebDriver driver,String xpath){
        WebDriverWait wait= (WebDriverWait) new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
    }
}
