package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions (features = {"src/test/resources/Features"}
        ,glue={"stepDefination"},plugin = {"json:target/cucumber.json"})
public class Firstnamerun extends AbstractTestNGCucumberTests
{
    @BeforeSuite
    public void beforesuit()
    {

    }
    @AfterSuite
    public void aftersuit()
    {

    }


}
