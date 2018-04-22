package unitedHealthCareTests;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UnitedHealthCare extends CommonAPIChrome {

    String url = "https://www.uhc.com/";

    @Test
    public void uhcBrowserLaunch(){
        chromeDriver.get(url);
    }

    @Test
    public void uhcLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//div[@class='login section']//button[@id='loginmenubutton']")).click();
    }
}
