package facebookTests;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Facebook extends CommonAPIChrome{

    String url = "https://www.facebook.com";

    @Test
    public void facebookBrowserLaunch(){
        chromeDriver.get(url);
    }

    @Test
    public void facebookLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@email.com");
        chromeDriver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234abcd");
        chromeDriver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
