package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver", "C:\\My Software\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://example.testproject.io/web/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


    }

    @When("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        driver.get("https://example.testproject.io/web/");
        Thread.sleep(2000);

    }

    @Then("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(2000);


    }

    @Then("user clicks on login")
    public void user_clicks_on_login() throws InterruptedException {
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);

    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {
        driver.findElement(By.id("logout")).isDisplayed();
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }


}
