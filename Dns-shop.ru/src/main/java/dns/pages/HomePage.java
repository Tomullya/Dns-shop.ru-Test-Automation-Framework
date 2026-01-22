package dns.pages;

import dns.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private final String HOME_URL = "https://www.dns-shop.ru/";
    public final By COOKIE_PATH = By.xpath("//div[@class='header-cookie-notification']");
    public final By COOKIE_BUTTON = By.xpath("//div[@class='header-cookie-notification__btn']");
    public final By LOGIN_BUTTON = By.xpath("//div[@class='header-bottom__user-block header-bottom__user-block_not-logged']");

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage() {
        this.driver = Driver.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open(){
        driver.get(HOME_URL);
    }

    public void clickCookie(){
        WebElement cookieButton = wait.until(ExpectedConditions.elementToBeClickable(COOKIE_BUTTON));
        cookieButton.click();
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
