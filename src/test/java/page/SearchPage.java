package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SearchPage extends CommonMethods {
    @FindBy(xpath="//span[@class='a-color-state a-text-bold']")
    public WebElement titleoption;

    public SearchPage(){
        PageFactory.initElements(driver,this);
    }

}
