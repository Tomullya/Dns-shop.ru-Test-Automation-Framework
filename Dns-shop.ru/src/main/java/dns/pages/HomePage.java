package dns.pages;

import dns.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private final String HOME_URL = "https://chitatel.by/";

    public final By LOGIN_BUTTON = By.xpath("//div[@class=\"name\" and text()=\"Вход\"]");

    private WebDriver driver;


    public HomePage() {
        this.driver = Driver.getDriver();

    }

    public void open(){
        driver.get(HOME_URL);
    }


    public void clickLogin(){
        driver.findElement(LOGIN_BUTTON).click();
    }

    public boolean isLoginButtonIsEnable(){
         try {
             clickLogin();
             return true;
         }
         catch (Exception e){
             return false;
         }
    }



}
