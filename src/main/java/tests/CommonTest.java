package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import runner.TestRunner;

public class CommonTest {
    @Given("^Open website (.*)$")
    public void open_website(String website) throws Throwable {
        Thread.sleep(3000);
        TestRunner.driver.get(website);
        Thread.sleep(3000);
        TestRunner.driver.manage().window().maximize();
    }
}
