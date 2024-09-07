package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginDataStep {
    WebDriver driver;
    WebDriverWait wait ;
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    @When("^The user enters valid credentials \"(.*?)\" and \"(.*?)\"$")
    public void the_user_enters_valid_credentials_and(String uname, String pword) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys(uname);
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys(pword);
    }
    
    @When("clicks on the login button")
    public void clicks_on_the_login_button() {
        WebElement loginButton =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text() = ' Login '] ")));
        loginButton.click();
    }
    
    @Then("the user should see the home page")
    public void the_user_should_see_the_home_page() {
        By adminNameLocator = By.xpath("//p[text() = 'Time at Work']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(adminNameLocator));
        WebElement adminNameElement = driver.findElement(adminNameLocator);
        boolean status = adminNameElement.isDisplayed();
        Assert.assertTrue(status);
    }
    }


