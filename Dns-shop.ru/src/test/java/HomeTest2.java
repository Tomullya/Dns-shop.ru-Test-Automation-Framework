import dns.pages.*;
import org.junit.jupiter.api.*;

public class HomeTest2 {
    private HomePage homePage;

    @Test
    public void openHomePageTest() {
        homePage = new HomePage();
        homePage.open();

    }
}
