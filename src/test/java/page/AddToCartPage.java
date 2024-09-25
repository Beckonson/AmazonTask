package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddToCartPage extends CommonMethods {
    @FindBy(css ="div.s-widget-container span.a-size-medium.a-color-base.a-text-normal")
    public WebElement searchResult;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addCart;
    @FindBy(xpath = "//h1[@role='status']")
    public WebElement CartStatus;
    @FindBy(css = ".a-button-text[href='/cart?ref_=sw_gtc']")
    public WebElement addToCartButton;
    @FindBy(id = "nav-cart")
    public WebElement cartButton;
    @FindBy(css = "span.a-truncate-cut")
    public WebElement productName;
    @FindBy(name = "quantityBox")
    public WebElement productQuantity;
    @FindBy(css = "span.a-price-whole")
    public WebElement productPrice;






    public AddToCartPage(){
        PageFactory.initElements(driver,this);
    }
}
