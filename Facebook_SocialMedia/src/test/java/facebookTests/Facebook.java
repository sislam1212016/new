package facebookTests;

import commonAPI.CommonAPIChrome;
import facebookMain.FacebookMain;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import javax.swing.*;

public class Facebook extends FacebookMain{

    String url = "https://www.facebook.com";

    @Test
    public void facebookBrowserLaunch(){
        chromeDriver.get(url);
    }

    @Test
    public void facebookLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        chromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();


    }

    @Test
    public void postTest(){
        postFacebook();
    }


    @Test
    public void createFacebookAccount(){
        chromeDriver.get(url);
    }

    @Test
    public void createPage(){
        chromeDriver.get(url);
    }
    @Test
    public void findGroups(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//div[@dir='ltr']")).click();
    }

    @Test
    public void verifyFriendRequest(){
        chromeDriver.get(url);
    }

    @Test
    public void findFriends(){
        chromeDriver.get(url);

    }
    @Test
    public void receiveMessage(){
        chromeDriver.get(url);
    }


    @Test
    public void facebookLogout(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
        chromeDriver.findElement(By.partialLinkText("menu_logout")).click();
    }
}
