package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class CheckoutPage extends CommonMethods {

    @FindBy(name = "proceedToRetailCheckout")
    public WebElement proceedToCheckoutButton;
    @FindBy(id = "ap_email")
    public WebElement emailField;
    @FindBy(id = "continue")
    public WebElement continueButton;
    @FindBy(id = "ap_password")
    public WebElement passwordField;
    @FindBy(id = "signInSubmit")
    public WebElement loginButton;
    @FindBy(css = "input[data-testid='Address_selectShipToThisAddress']")
    public WebElement shippingAddressSelect;
    @FindBy(css = "//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
    public WebElement continuePayment;
    @FindBy(css = "#address-ui-widgets-enterAddressPhoneNumber")
    public WebElement phoneNumField;
    @FindBy(css = "#address-ui-widgets-enterAddressLine1")
    public WebElement addressField;
    @FindBy(css = "#address-ui-widgets-enterAddressPostalCode")
    public WebElement zipCodeField;




    public CheckoutPage(){
        PageFactory.initElements(driver,this);

    }
}
