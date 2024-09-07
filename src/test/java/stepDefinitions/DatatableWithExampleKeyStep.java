package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DatatableWithExampleKeyStep {
    WebDriver driver;
    WebDriverWait wait ;
    @Given("Proceed to login page")
    public void proceed_to_login_page() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("^user enter \"(.*?)\" and password \"(.*?)\"$")
    public void user_enter_and_password(String uname, String pword) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys(uname);
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys(pword);
    }
    @When("clicked login button")
    public void clicked_login_button() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text() = ' Login '] ")));
        loginButton.click();
    }

}
