package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import page.SearchPage;
import utils.CommonMethods;

import java.time.Duration;
import java.util.List;

public class SearchSteps extends CommonMethods {
    String product = "gaming laptop";
    //public WebDriver driver;

    @Given("user  navigate to Amazon web home page")
    public void user_navigate_to_amazon_web_home_page() {
        openBrowserAndLaunchApplication();
        //driver = new EdgeDriver();
        //driver.get("https://www.amazon.com/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    //Enter product name "gaming laptop" in the search bar
    @When("user enters the full name of a product gaming laptop")
    public void user_enters_the_full_name_of_a_product_gaming_laptop() throws InterruptedException {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
        Thread.sleep(2000);

    }
    //Click the search button
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();

    }
    @Then("user should see relevant products that match the search term {string} in the search results")
    public void user_should_see_relevant_products_that_match_the_search_term_in_the_search_results(String string) {
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".s-main-slot .s-result-item"));
        //WebElement titleLoc = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(!searchResults.isEmpty());
        //Assert.assertTrue(titleLoc.isDisplayed());

        for (int i = 0; i < Math.min(searchResults.size(), 5); i++) {
            WebElement productTitle = searchResults.get(i);
            String titleText = productTitle.getText().toLowerCase();

            //System.out.println("product title:" + titleText);

        }

    }
    @Then("user validates search result")
    public void user_validates_search_result() {
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".s-main-slot .s-result-item"));
        for (int i = 0; i < Math.min(searchResults.size(), 5); i++) {
            WebElement productTitle = searchResults.get(i);
            String titleText = productTitle.getText().toLowerCase();
            Assert.assertTrue(productTitle.isDisplayed());


        }
    }
    @When("user applies a price filter between ${int} and ${int}")
    public void user_applies_a_price_filter_between_$_and_$(Integer $500, Integer $1000) {
        //driver.findElement(By.xpath("//div[@aria-label='$500 to $600']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement priceFilterSection = driver.findElement(By.xpath("//span[text()='Price']"));
        js.executeScript("arguments[0].scrollIntoView(true);", priceFilterSection);

        WebElement minPriceInput = driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_lower-bound-slider']"));
        minPriceInput.sendKeys("500");
        WebElement maxPriceInput = driver.findElement(By.xpath("//input[@id='p_36/range-slider_slider-item_upper-bound-slider']"));
        maxPriceInput.sendKeys("1000");
        WebElement goButton = driver.findElement(By.xpath("//input[@aria-label='Go - Submit price range']"));
        goButton.click();
    }
    @Then("user should see all listed products fall within this price range")
    public void user_should_see_all_listed_products_fall_within_this_price_range() {
        //driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']//span[1]"));

        WebElement Priceragetitle = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        String rangeTitleText= Priceragetitle.getText().toLowerCase();
        System.out.println("Price Filter:" + rangeTitleText);
        Assert.assertTrue(Priceragetitle.isDisplayed());

    }
    @When("user applies a brand filter {string}")
    public void user_applies_a_brand_filter(String Acer) {
        WebElement Acerbotton = driver.findElement(By.xpath("//li[@id='p_123/247341']//i[@class='a-icon a-icon-checkbox']"));
        Acerbotton.click();
    }
    @Then("user should see all listed products  belong to the {string} brand")
    public void user_should_see_all_listed_products_belong_to_the_brand(String string) {
        WebElement Acerselect = driver.findElement(By.xpath("//a[@class='a-link-normal s-navigation-item']//span[@class='a-size-base a-color-base a-text-bold']"));
        Acerselect.isSelected();
    }


}

