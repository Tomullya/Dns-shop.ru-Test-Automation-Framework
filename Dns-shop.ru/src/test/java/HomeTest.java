import dns.driver.Driver;
import dns.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeTest {
    private HomePage homePage;

    @BeforeEach
    public void openHomePage(){
        homePage = new HomePage();
        homePage.open();

    }
    @Test
    public void testIsLoginButtonEnable(){
        Assertions.assertTrue(homePage.isLoginButtonIsEnable());
    }

    @AfterEach
    public  void tearDown(){
        //Driver.quit();
    }
}
