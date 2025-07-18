import edu.IFNTUNG.bpbOnline.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YoutubePageTest extends BaseTest {
    @Test
    public void goToYoutubePage(){
        String channelName = new HomePage(driver)
                .goToYoutubePage()
                .getMessage("ITVDN");
        Assert.assertTrue(channelName.contains("ITVDN"));
    }
}
