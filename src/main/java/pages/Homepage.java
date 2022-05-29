package pages;

import genariclib.Propertyfile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Homepage
{
    Propertyfile pdata=new Propertyfile();

   @FindBy(xpath = "//input[@placeholder='First Name']")
    private WebElement Firstnametb;
   @FindBy(xpath = "//input[@placeholder='Last Name']")
   private WebElement Lastnametb;

public Homepage(WebDriver driver)
{
    PageFactory.initElements(driver,this);
}
public void Firstnametb() throws IOException {
    Firstnametb.sendKeys(pdata.getproperty("FirstName"));

}

    public void Lastnametb()
    {
     Lastnametb.sendKeys("Hajare");

    }


}
