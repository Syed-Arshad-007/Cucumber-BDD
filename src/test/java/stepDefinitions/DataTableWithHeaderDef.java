package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class DataTableWithHeaderDef {

    WebDriver driver;
    WebDriverWait wait ;

    @Given("Go to login page")
    public void go_to_login_page() {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("enter the below mentioned credentials")
    public void enter_the_below_mentioned_credentials(DataTable dataTable) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        // Convert DataTable to List of Map of Strings
        List<Map<String,String>> keyValPair = dataTable.asMaps(String.class, String.class);

        // Get username and password from the credentials
        String uname = keyValPair.get(0).get("Username");
        String pword =  keyValPair.get(0).get("Password");

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys(uname);
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys(pword);
    }
    @When("click on the login button after entering credentials")
    public void click_on_the_login_button_after_entering_credentials() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text() = ' Login '] ")));
        loginButton.click();
    }

}
