package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DataTableWithoutHeaderDef {

    WebDriver driver;
    WebDriverWait wait ;
    @Given("You are on the login page")
    public void you_are_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("You enter the below credentials")
    public void you_enter_the_below_credentials(DataTable dataTable) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        // Convert DataTable to List of List of Strings
        List<List<String>> data = dataTable.asLists(String.class);

        // Get username and password from the credentials
        for (List<String> row : data) {
            if (row.size() >= 2) { // Ensure the row has at least two columns
                String uname = row.get(0); // Username
                String pword = row.get(1); // Password
                WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
                username.sendKeys(uname);
                WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
                password.sendKeys(pword);

            }
        }
    }

        @When("click  the login button")
        public void click_the_login_button(){
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text() = ' Login '] ")));
            loginButton.click();
        }

    }

