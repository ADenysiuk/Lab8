package edu.IFNTUNG.bpbOnline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By auth = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[3]/a");
    private By youtube = By.xpath("//a[@data-type=\"youtube\"][@class=\"social-subscribe-link\"]");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public LoginPage clickOnAuthorizeButton(){
        click(auth);
        return new LoginPage(driver);
    }
    public YoutubePage goToYoutubePage(){
        click(youtube);
        return new YoutubePage(driver);
    }
    public String getMessage(String message){
        return getText(auth, message);
    }
}