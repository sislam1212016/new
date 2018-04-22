package bestbuyTests;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BestBuy extends CommonAPIChrome {

    String url = "https://www.bestbuy.com";

    @Test
    public void besybuyBrowserlaunch(){
        chromeDriver.get(url);
    }

    @Test
    public void bestbuyLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//div[@class='fullbleed-wrap dark-bleed']//nav[@class='utility-nav']//li[@class='account js-navitem']//a[@id='profileMenuWrap1']"));
    }


}
