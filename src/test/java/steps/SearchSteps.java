package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;

public class SearchSteps extends CommonMethods {

    //public WebDriver driver;

    @Given("user  navigate to Amazon web home page")
    public void user_navigate_to_amazon_web_home_page() {
        driver = new EdgeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    //Enter product name "gaming laptop" in the search bar
    @When("user enters the full name of a product gaming laptop")
    public void user_enters_the_full_name_of_a_product_gaming_laptop() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gaming laptop");

    }

    //Click the search button
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();


    }
    @Then("user should see relevant products that match the search term {string} in the search results")
    public void user_should_see_relevant_products_that_match_the_search_term_in_the_search_results(String string) {
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".s-main-slot .s-result-item"));
        WebElement titleLoc = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(!searchResults.isEmpty());
        Assert.assertTrue(titleLoc.isDisplayed());
        

    }


}
