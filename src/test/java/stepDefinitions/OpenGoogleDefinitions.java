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
import java.util.NoSuchElementException;

public class OpenGoogleDefinitions {

    WebDriver driver;

    @Given("user is entering google.co.in")
    public void user_is_entering_google_co_in() {
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
    }

    @When("user is typing the search term {string}")
    public void user_is_typing_the_search_term(String searchTerm) {
        driver.findElement(By.name("q")).sendKeys(searchTerm);
    }

    @When("enters the return key")
    public void enters_the_return_key() {
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @Then("user should able to see results for Playwright")
    public void user_should_able_to_see_results_for_playwright() {
            Boolean status = driver.findElement(By.partialLinkText("Playwright")).isDisplayed();
            if (status){
                System.out.println("Results displayed");
            }
    }

}
