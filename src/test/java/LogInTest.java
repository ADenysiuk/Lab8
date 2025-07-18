import edu.IFNTUNG.bpbOnline.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {
    @Test
    public void logIn(){
        String button = new HomePage(driver)
                .clickOnAuthorizeButton()
                .enterEmail("andrii.denysiuk-ki232@nung.edu.ua")
                .enterPassword("60025021Andr")
                .remember()
                .logIn()
                .getMessage("Авторизація");
        Assert.assertTrue(button.contains("Авторизація"));
    }
}
