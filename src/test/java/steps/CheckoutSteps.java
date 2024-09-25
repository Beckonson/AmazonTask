package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.CommonMethods;
import utils.ConfigReader;

public class CheckoutSteps extends CommonMethods {

    @When("user click Proceed to checkout")
    public void user_click_proceed_to_checkout() {

        //WebElement proceedToCheckoutButton = driver.findElement(By.name("proceedToRetailCheckout"));
        //proceedToCheckoutButton.click();
        click(checkoutPage.proceedToCheckoutButton);
    }


    @When("user enter  valid  username and password")
    public void user_enter_valid_username_and_password() {
        //WebElement emailField = getwait().until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
        //emailField.sendKeys("beckonson@yahoo.com");
        sendText(ConfigReader.read("email"),checkoutPage.emailField);

        //WebElement continueButton = driver.findElement(By.id("continue"));
        //continueButton.click();
        click(checkoutPage.continueButton);

        //WebElement passwordField = getwait().until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")));
        //passwordField.sendKeys("8GV:aqxG6A3jbC:");
        sendText(ConfigReader.read("password"),checkoutPage.passwordField);

        //WebElement loginButton = driver.findElement(By.id("signInSubmit"));
        //loginButton.click();
        click(checkoutPage.loginButton);
    }

    @When("user validate shipping address")
    public void user_validate_shipping_address() {
        /*
        WebElement phoneNumField = driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressPhoneNumber"));
        //phoneNumField.sendKeys("+2340000090300");
        //sendText(ConfigReader.read("mobilNum"),checkoutPage.phoneNumField);
        String phoneText = phoneNumField.getText();

        WebElement addressField = driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressLine1"));
        //addressField.sendKeys("23 abc Street off Xyz Road");
        //sendText(ConfigReader.read("address"),checkoutPage.addressField);
        String addressFieldText = addressField.getText();

        WebElement zipCodeField = driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressPostalCode"));
        //zipCodeField.sendKeys("50001");
        //sendText(ConfigReader.read("zip"),checkoutPage.zipCodeField);
        String zipText = zipCodeField.getText();

        Assert.assertTrue(phoneNumField.isDisplayed());
        Assert.assertTrue(addressField.isDisplayed());
        Assert.assertTrue(zipCodeField.isDisplayed());
        */

        WebElement shippingAddress= driver.findElement(By.cssSelector("div[class='a-column a-span5 a-text-left'] span[class='a-text-bold']"));
        Assert.assertTrue(shippingAddress.isDisplayed());

        //WebElement shippingAddressSelect = driver.findElement(By.cssSelector("input[data-testid='Address_selectShipToThisAddress']"));
        //shippingAddressSelect.click();
        click(checkoutPage.shippingAddressSelect);

    }
    @Then("user click Proceed to payment")
    public void user_click_proceed_to_payment() {
        WebElement continuePayment = driver.findElement(By.xpath("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']"));
        Assert.assertTrue(continuePayment.isDisplayed());
    }


    }

