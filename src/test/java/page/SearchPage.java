package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SearchPage extends CommonMethods {
    @FindBy(id="twotabsearchtextbox")
    public WebElement productSearch;

    @FindBy(xpath = "//*[@id='nav-search-submit-button")
    public WebElement submitSearch;

    @FindBy(xpath = "//input[@id='p_36/range-slider_slider-item_lower-bound-slider']")
    public WebElement minPriceInput;

    @FindBy(xpath = "//input[@id='p_36/range-slider_slider-item_upper-bound-slider']")
    public WebElement maxPriceInput;

    @FindBy(xpath = "//input[@aria-label='Go - Submit price range']")
    public WebElement goButton;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement Pricerangetitle;

    @FindBy(xpath = "//li[@id='p_123/247341']//i[@class='a-icon a-icon-checkbox']")
    public WebElement brandbotton;

    @FindBy(xpath = "//a[@class='a-link-normal s-navigation-item']//span[@class='a-size-base a-color-base a-text-bold']")
    public WebElement brandselect;


    public SearchPage(){
        PageFactory.initElements(driver,this);
    }

}
