package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.sql.Driver;

public class AddToCartSteps extends CommonMethods {
    @When("user select a product from the search results")
    public void user_select_a_product_from_the_search_results() {
        driver.findElement(By.cssSelector("div.s-widget-container span.a-size-medium.a-color-base.a-text-normal")).click();
    }
    @When("user click the {string} button")
    public void user_click_the_button(String string) {
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    }
    @Then("user verify that the {string} message appears")
    public void user_verify_that_the_message_appears(String string) {
        WebElement Cartstatus = driver.findElement(By.xpath("//h1[@role='status']"));
        String CartText=Cartstatus.getText();
        System.out.println("Cart massage:" + CartText);

    }


    }


