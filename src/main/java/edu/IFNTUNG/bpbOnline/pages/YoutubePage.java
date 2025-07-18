package edu.IFNTUNG.bpbOnline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YoutubePage extends BasePage {
    private By name = By.xpath("//span[@class=\"yt-core-attributed-string yt-core-attributed-string--white-space-pre-wrap\"][@dir=\"auto\"][@role=\"text\"]");
    public YoutubePage(WebDriver driver) {
        super(driver);
    }
    public String getMessage(String message){
        return getText(name, message);
    }

}
