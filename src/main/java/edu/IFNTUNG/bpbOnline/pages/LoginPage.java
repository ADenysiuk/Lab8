package edu.IFNTUNG.bpbOnline.pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By email = By.xpath("//input[@id='Email']");
    private By password = By.xpath("//input[@id='Password']");
    private By remember = By.xpath("//input[@id='Remember']");
    private By submit = By.xpath("//button[@type='submit'][contains(text(),'Увійти')]");
    private By register = By.xpath("//a[contains(text(), 'Зареєструйтесь')]");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public RegisterPage registerAccount(){
        click(register);
        return new RegisterPage(driver);
    }
    public LoginPage enterEmail(String email){
        enterText(email, this.email);
        return this;
    }
    public LoginPage enterPassword(String password){
        enterText(password, this.password);
        return this;
    }
    public LoginPage remember(){
        click(remember);
        return this;
    }
    public HomePage logIn(){
        click(submit);
        return new HomePage(driver);
    }
}
