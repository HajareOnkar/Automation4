package genariclib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Baseclass
{
    public WebDriver driver;
    public void open()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\it related softtware\\selenium related software\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
