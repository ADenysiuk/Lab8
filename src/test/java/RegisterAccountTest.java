import edu.IFNTUNG.bpbOnline.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterAccountTest extends BaseTest {

    private static final String EXPECTED_RESULT = "Авторизація";;

    @Test
    public void register(){
        String button = new HomePage(driver)
                .clickOnAuthorizeButton()
                .registerAccount()
                .enterEmail("10")
                .enterPhone("380999039775")
                .enterPasswordAndConfirmPassword("60025021Andr")
                .submit()
                .getMessage("Авторизація");
        Assert.assertTrue(button.contains(EXPECTED_RESULT));
    }
}
