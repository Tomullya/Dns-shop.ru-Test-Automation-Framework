import dns.driver.Driver;
import dns.pages.HomePage;
import dns.utils.Wait;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeTest {
    private HomePage homePage;

    @BeforeEach
    public void openHomePageAndCloseCookies(){
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookie();
    }
    @Test
    public void testIsLoginButtonEnable(){
        Assertions.assertTrue(homePage.isLoginButtonIsEnable());
    }

    @AfterEach
    public  void tearDown(){
        Driver.quit();
    }
}
