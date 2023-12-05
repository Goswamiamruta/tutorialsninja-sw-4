package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    DesktopsPage desktopsPage = new DesktopsPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
//1.1 Mouse hover on Laptops & Notebooks Tab.and click
        topMenuPage.mouseHoverOnLaptopNotebooks();

//1.2 Click on “Show All Laptops & Notebooks”
        topMenuPage.selectMenu("Show AllLaptops & Notebooks");
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
//1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortBy("Price (High > Low)");
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);

//1.4 Verify the Product price will arrange in High to Low order.
        Assert.assertEquals(originalProductsPrice, afterSortByPrice);
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        topMenuPage.mouseHoverOnLaptopNotebooks();
        //2.2 Click on “Show All Laptops & Notebooks”
        topMenuPage.selectMenu("Show AllLaptops & Notebooks");

        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.selectSortBy("Price (High > Low)");
       //2.4 Select Product “MacBook”
        laptopsAndNotebooksPage.selectProductMacBook();
       //2.5 Verify the text “MacBook”
        String actualMacBookText = laptopsAndNotebooksPage.verifyMacBookText();
        Assert.assertEquals(actualMacBookText, "MacBook", "Product not match");

        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebooksPage.clickOnAddToCart();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String actualAddToCartText = laptopsAndNotebooksPage.addCartMessage();
        Assert.assertEquals(actualAddToCartText, "Success: You have added MacBook to your shopping cart!\n" +
                "×", "Message is not match");

        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNotebooksPage.clickOnShoppingCart();
         //2.9 Verify the text "Shopping Cart"
        String actualShoppingCartText = laptopsAndNotebooksPage.verifyTheShoppingCartText();
        Assert.assertEquals(actualShoppingCartText, "Shopping Cart  (0.00kg)", "Text is not match");
        //2.10 Verify the Product name "MacBook"
        String actualMacBookText1 = laptopsAndNotebooksPage.verifyMacBookText1();
        Assert.assertEquals(actualMacBookText1, "MacBook", "Text not match");

       //2.11 Change Quantity "2"
        laptopsAndNotebooksPage.changeTheQty();

       //2.12 Click on “Update” Tab
        laptopsAndNotebooksPage.updateTheQty();

       //2.13 Verify the message “Success: You have modified your shopping cart!”
        String actualModifyCartText = laptopsAndNotebooksPage.verifyTheModifyCartText();
        Assert.assertEquals(actualModifyCartText, "Success: You have modified your shopping cart!\n" +
                "×", "Text is not match");

       //2.14 Verify the Total £737.45
        String actualTotalAmount = laptopsAndNotebooksPage.verifyTheTotalAmount();
        Assert.assertEquals(actualTotalAmount, "£737.45", "Total amount is not match");

       //2.15 Click on “Checkout” button
        laptopsAndNotebooksPage.clickOnCheckOutButton();
      //2.16 Verify the text “Checkout”
        String actualCheckoutText = laptopsAndNotebooksPage.verifyCheckOutText();
        Assert.assertEquals(actualCheckoutText, "Checkout", "Text is not match");
        //2.17 Verify the Text “New Customer”
        String actualNewCustomerText = laptopsAndNotebooksPage.verifyNewCustomerText();
        Assert.assertEquals(actualNewCustomerText, "New Customer", "Text is not match");

      //2.18 Click on “Guest Checkout” radio button
        laptopsAndNotebooksPage.clickOnGuestCheckOut();
    //2.19 Click on “Continue” tab
        laptopsAndNotebooksPage.clickOnContinueButton();
     //2.20 Fill the mandatory fields
        laptopsAndNotebooksPage.enterFirstName("Amruta");
        laptopsAndNotebooksPage.enterLastName("Goswami");
        laptopsAndNotebooksPage.enterEmail("Amruta1232@gmail.com");
        laptopsAndNotebooksPage.enterPhoneNumber("01234567890");
        laptopsAndNotebooksPage.enterAddress1("93 HrrowedeneRoad");
        laptopsAndNotebooksPage.enterCity("Harrow");
        laptopsAndNotebooksPage.enterPostCode("HA2 9SG");
        laptopsAndNotebooksPage.selectCountry("United Kingdom");
        laptopsAndNotebooksPage.selectRegion("Harrow");
    //2.21 Click on “Continue” Button
        laptopsAndNotebooksPage.clickOnLastContinueCheckOutButton();
    //2.22 Add Comments About your order into text area
        laptopsAndNotebooksPage.enterComments("Thank You");

    //2.23 Check the Terms & Conditions check box
        laptopsAndNotebooksPage.clickOnAgree();

    //2.24 Click on “Continue” button
        laptopsAndNotebooksPage.clickOnGuestContinue();

     //2.25 Verify the message “Warning: Payment method required!”
        String actualWarningMessage = laptopsAndNotebooksPage.verifyPaymentWarningText();
        Assert.assertEquals(actualWarningMessage, "Warning: No Payment options are available. Please contact us for assistance!", "Warning text is not match");
    }
}