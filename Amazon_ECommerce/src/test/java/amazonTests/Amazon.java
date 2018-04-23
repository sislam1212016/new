package amazonTests;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon extends CommonAPIChrome {

    String url = "https://www.amazon.com";

    @Test //test1
    public void amazonBrowserLaunch(){
        chromeDriver.get(url);
    }

    @Test //test2
    public void amazonLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//div[@id='nav-tools']//a[@class='nav-a nav-a-2']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("test@email.com");
        chromeDriver.findElement(By.xpath("//div[@class='a-section']//input[@id='continue']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("abcd1234");
        chromeDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    }

    @Test //test3
    public void findSearchbar(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox"));
    }

    @Test //test4
    public void searchForItems(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
    }

    @Test //test5
    public void searchGoBack(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
    }

    @Test //test6
    public void searchGoBackAndRefresh(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().refresh();
    }

    @Test //test7
    public void searchGoBackGoForward(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
    }

    @Test //test8
    public void searchGoBackGoForwardClearSearch(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).clear();
    }

    @Test //test9
    public void searchForItemsGoBackAndSearchMore(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacAir", Keys.ENTER);
        chromeDriver.navigate().back();
    }

    @Test //test10
    public void searchGoBackGoForwardClearSearchAndSearchForMoreItems() {
        chromeDriver.get(url);
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("ps4 games", Keys.ENTER);
        chromeDriver.navigate().back();
        chromeDriver.navigate().forward();
        chromeDriver.navigate().refresh();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).clear();
        chromeDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cuff Links", Keys.ENTER);
    }

    @Test //test11
    public void amazonBrowserClose(){
        chromeDriver.get(url);
        chromeDriver.close();
    }

    @Test //test12
    public void amzonBrowserTitle(){
        chromeDriver.get(url);
        System.out.println(chromeDriver.getCurrentUrl());
        System.out.println(chromeDriver.getTitle());
        chromeDriver.close();
    }
    
}
