package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hover {
    public static void hoverElement(WebDriver driver,String xpath){
        WebDriverWait wait= new WebDriverWait(driver,100);
        WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        Actions actions= new Actions(driver);
        actions.moveToElement(element);
    }
}
