package dns.pages;

import dns.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final String HOME_URL = "https://www.dns-shop.ru";
    public final By COOKIE_PATH = By.xpath("//div[@class='header-cookie-notification']");
    public final By COOKIE_CLEAR_BUTTON = By.xpath("//div[@class='header-cookie-notification__btn']");
    public final By LOGIN_BUTTON = By.xpath("//div[@class='header-bottom__user-block header-bottom__user-block_not-logged']");

    private WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public void open(){
        driver.get(HOME_URL);
    }

    public void clickCookie(){
        driver.findElement(COOKIE_CLEAR_BUTTON).click();
    }

    public void clickLogin(){
        driver.findElement(LOGIN_BUTTON).click();
    }



}
