import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.BasePage.driver;

public class LoginTests extends BaseTest {
    @Test
    public void LoginValidEmailPasswordTest() {


        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

         loginPage.login();

        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());
    }
}
