package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.sql.Driver;

public class AddToCartSteps extends CommonMethods {
    @When("user select a product from the search results")
    public void user_select_a_product_from_the_search_results() {
        //WebElement searchResult = driver.findElement(By.cssSelector("div.s-widget-container span.a-size-medium.a-color-base.a-text-normal"));
        //searchResult.click();
        click(addToCartPage.searchResult);
    }
    @When("user click the {string} button")
    public void user_click_the_button(String addToCart) {
        //WebElement addCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
        //addCart.click();
        click(addToCartPage.addCart);
    }
    @Then("user verify that the {string} message appears")
    public void user_verify_that_the_message_appears(String string) {
        WebElement CartStatus = driver.findElement(By.xpath("//h1[@role='status']"));
        String CartText=CartStatus.getText();
        //System.out.println("Cart massage:" + CartText);
    }
    @Then("user validate the product details \\(name, quantity, price) in the cart")
    public void user_verify_the_product_details_name_quantity_price_in_the_cart() {

        // Clicking the "Add to Cart" button
        //WebElement addToCartButton = getwait().until(ExpectedConditions.elementToBeClickable(By.cssSelector(".a-button-text[href='/cart?ref_=sw_gtc']")));
        //addToCartButton.click();
        click(addToCartPage.addToCartButton);

        //Waiting for "Added to Cart" confirmation and navigate to cart
        //WebElement cartButton = getwait().until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-cart")));
        //cartButton.click();
        click(addToCartPage.cartButton);

        // Validating Product Name
        WebElement productName = getwait().until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.a-truncate-cut")));
        String actualProductName = productName.getText();
        String expectedProductName = "Acer"; // The expected product name
        Assert.assertTrue("Product name in the cart does not match.", actualProductName.contains(expectedProductName));

        // Validating Quantity
        WebElement productQuantity = driver.findElement(By.name("quantityBox"));
        String actualQuantity = productQuantity.getAttribute("value");
        Assert.assertEquals("Product quantity is incorrect.", "1", actualQuantity); // Assuming 1 as the expected quantity

        // Validating Price
        WebElement productPrice = driver.findElement(By.cssSelector("span.a-price-whole"));
        String actualPrice = productPrice.getText();
        Assert.assertNotNull("Product price is not displayed.", actualPrice); // Ensure the price is displayed

    }
}





