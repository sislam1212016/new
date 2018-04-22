package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPIChrome {

    public WebDriver chromeDriver;

    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\IdeaProjects\\AutomationTeam6\\driver\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
    }
}
