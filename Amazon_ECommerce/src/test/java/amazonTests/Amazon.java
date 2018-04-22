package amazonTests;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Amazon extends CommonAPIChrome {

    String url = "https://www.amazon.com";

    @Test
    public void amazonBrowserLaunch(){
        chromeDriver.get(url);
    }

    @Test
    public void amazonLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@email.com");
        chromeDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd1234");
        chromeDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }
}
