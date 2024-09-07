package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

 public class LoginSteps {

    WebDriver driver;
    WebDriverWait wait ;
    @Given("user is on login page")
    public void user_is_on_login_page() {

        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("The user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin" + Keys.ENTER);
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");
    }
    @When("clicks the login button")
    public void clicks_the_login_button() {
       WebElement loginButton =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text() = ' Login '] ")));
       loginButton.click();

    }
    @Then("the user should be navigated to home page")
    public void the_user_should_be_navigated_to_home_page() {
        By adminNameLocator = By.xpath("//p[text() = 'manda user']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(adminNameLocator));
        WebElement adminNameElement = driver.findElement(adminNameLocator);
        Assert.assertTrue(adminNameElement.isDisplayed(), "The admin name element should be displayed.");
        }

    }


