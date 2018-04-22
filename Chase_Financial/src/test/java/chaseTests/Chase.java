package chaseTests;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Chase extends CommonAPIChrome {

    String url = "https://www.chase.com";

    @Test
    public void chaseBrowserLaunch(){
        chromeDriver.get(url);
    }

    @Test
    public void chaseLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//header[@data-feature='header']//a[@id='skip-sidemenu']")).click();
            chromeDriver.findElement(By.cssSelector(".chaseanalytics-track-link.signInBtn")).click();
     /*   chromeDriver.findElement(By.xpath("//input[@name='userId']")).sendKeys("test@email.com");
        chromeDriver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd1234");
        chromeDriver.findElement(By.xpath("//button[@id='signin-button']")).click();
 */   }
}
