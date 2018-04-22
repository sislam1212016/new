package netflixTests;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Netflix extends CommonAPIChrome{

    String url = "https:www.netflix.com";
    @Test
    public void netflixBrowserLaunch(){
        chromeDriver.get(url);
    }

    @Test
    public void netflixLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.linkText("Sign In")).click();
        chromeDriver.findElement(By.name("email")).sendKeys("test@email.com");
        chromeDriver.findElement(By.name("password")).sendKeys("1234abcd");
        chromeDriver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
    }
}
