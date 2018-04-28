package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPIChrome {

    public WebDriver chromeDriver;

    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.chrome.driver", "/Users/shafiq/IdeaProjects/AutomationTeam6/driver/driver_Mac/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        chromeDriver = new ChromeDriver(options);
    }


}
