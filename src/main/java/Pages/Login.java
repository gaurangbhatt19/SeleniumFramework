package Pages;


import org.openqa.selenium.WebDriver;

import static Functions.SendKeys.*;
import static Functions.ClickElement.*;

public class Login {
    public static void loginPageCpanelGrab(WebDriver driver, String username, String password){
       try {
           driver.get("https://cpanel.grab.in/Admin/index");
           driver.manage().window().maximize();
           sendKeysByXpath(driver,"//input[@name=\"username\"]",username);
           sendKeysByXpath(driver,"//input[@name=\"password\"]",password);
           clickByXpath(driver,"//*[@id=\"m_login_signin_submit\"]");
           Thread.sleep(1000);

       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
