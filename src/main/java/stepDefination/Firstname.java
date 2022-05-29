package stepDefination;

import genariclib.Baseclass;
import genariclib.Propertyfile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Homepage;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Firstname
{
    public WebDriver driver;
    Homepage hp=new Homepage(driver);

    @Given("User opens chrome browser")
    public void user_opens_chrome_browser()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\it related softtware\\selenium related software\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @When("User enters application url")
    public void user_enters_application_url() throws IOException {
        Propertyfile property=new Propertyfile();

        driver.get(property.getproperty("url"));

    }



    @Then("User enters first name")
    public void userEntersFirstName() throws InterruptedException, IOException {
        Homepage hp=new Homepage(driver);
        hp.Firstnametb();
        Thread.sleep(1000);
        driver.quit();
    }




}
