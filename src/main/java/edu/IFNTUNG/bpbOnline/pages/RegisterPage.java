package edu.IFNTUNG.bpbOnline.pages;

import edu.IFNTUNG.bpbOnline.utils.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    private By email = By.xpath("//input[@id='Email']");//.sendKeys("Andrjm09@gmail.com");
    private By telephone = By.xpath("//input[@type='tel']");//.sendKeys("380999039775");
    private By password = By.xpath("//input[@class='enter-pswrd']");//.sendKeys("60025021Andr");
    private By confirmPassword = By.xpath("//input[@class='register-pswrd-confirm']");//.sendKeys("60025021Andr");
    private By submitButton = By.xpath("//button[@type='submit'][@class=\"btn-filled-orange\"]");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public RegisterPage enterEmail(String length){
        String email = StringUtils.generateRandomEmail(Integer.parseInt(length));
        enterText(email, this.email);
        return this;
    }
    public RegisterPage enterPhone(String telephone){
        enterText(telephone, this.telephone);
        return this;
    }
    public RegisterPage enterPasswordAndConfirmPassword(String password) {
        enterText(password, this.password);
        enterText(password, this.confirmPassword);
        return this;
    }
    public HomePage submit(){
        click(submitButton);
        return new HomePage(driver);
    }
}
