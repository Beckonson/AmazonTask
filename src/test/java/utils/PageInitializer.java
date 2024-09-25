package utils;

import page.AddToCartPage;
import page.CheckoutPage;
import page.SearchPage;
import steps.SearchSteps;

public class PageInitializer {
    public static SearchPage search;

    public static AddToCartPage addToCartPage;
    public static CheckoutPage checkoutPage;

    public static void initializePageObjects(){
        search = new SearchPage();
        addToCartPage = new AddToCartPage();
        checkoutPage =new CheckoutPage();
    }
}
