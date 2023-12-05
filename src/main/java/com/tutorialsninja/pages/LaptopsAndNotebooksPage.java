package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {
    By sort = By.id("input-sort");
    By selectProduct = By.linkText("MacBook");
    By macBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By successText = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By macBookText1 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By changeQtyLink = By.xpath("//input[contains(@name, 'quantity')]");
    By updateQtyLink = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modifiedCartText = By.xpath("//div[@id='checkout-cart']/div[1]");
    By totalAmountText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkOut = By.xpath("//a[@class='btn btn-primary']");
    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckOut = By.xpath("//input[@value='guest']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstName = By.xpath("//input[@id='input-payment-firstname']");
    By lastName = By.xpath("//input[@id='input-payment-lastname']");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.xpath("//input[@id='input-payment-telephone']");
    By address1 = By.xpath("//input[@id='input-payment-address-1']");
    By city = By.xpath("//input[@id='input-payment-city']");
    By postcode = By.xpath("//input[@id='input-payment-postcode']");
    By country = By.xpath("//select[@id='input-payment-country']");
    By region = By.xpath("//select[@id='input-payment-zone']");
    By continueButtonLast = By.xpath("//input[@id='button-guest']");
    By comments = By.xpath("//textarea[@name='comment']");
    By agree = By.xpath("//input[@type='checkbox']");
    By guestContinueButton = By.xpath("//input[@name = 'agree']");
    By warningText = By.xpath("//div[@class='alert alert-warning alert-dismissible']");

    public void selectSortBy(String sortBy) {
        selectByVisibleTextFromDropDown(sort, sortBy);
    }


    public void selectProductMacBook() {
        clickOnElement(selectProduct);
    }

    public String verifyMacBookText() {
        return getTextFromElement(macBookText);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String addCartMessage() {
        return getTextFromElement(successText);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String verifyTheShoppingCartText() {
        return getTextFromElement(shoppingCartText);
    }

    public String verifyMacBookText1() {
        return getTextFromElement(macBookText1);
    }

    public void changeTheQty() {
        driver.findElement(changeQtyLink).clear();
        sendTextToElement(changeQtyLink, "2");
    }

    public void updateTheQty() {
        clickOnElement(updateQtyLink);
    }

    public String verifyTheModifyCartText() {
        return getTextFromElement(modifiedCartText);
    }

    public String verifyTheTotalAmount() {
        return getTextFromElement(totalAmountText);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOut);
    }

    public String verifyCheckOutText() {
        return getTextFromElement(checkOutText);
    }

    public String verifyNewCustomerText() {
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckOut() {
        clickOnElement(guestCheckOut);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void enterFirstName(String firstNme) {
        sendTextToElement(firstName, firstNme);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterEmail(String value) {
        sendTextToElement(email, value);
    }

    public void enterPhoneNumber(String value) {
        sendTextToElement(telephone, value);
    }

    public void enterAddress1(String value) {
        sendTextToElement(address1, value);
    }

    public void enterCity(String value) {
        sendTextToElement(city, value);
    }

    public void enterPostCode(String value) {
        sendTextToElement(postcode, value);
    }

    public void selectCountry(String value) {
        selectByVisibleTextFromDropDown(country, value);
    }

    public void selectRegion(String value) {
        selectByVisibleTextFromDropDown(region, value);
    }

    public void clickOnLastContinueCheckOutButton() {
        clickOnElement(continueButtonLast);
    }

    public void enterComments(String value) {
        sendTextToElement(comments, value);
    }

    public void clickOnAgree() {
        clickOnElement(agree);
    }

    public void clickOnGuestContinue() {
        clickOnElement(guestContinueButton);
    }


    public String verifyPaymentWarningText() {
        return getTextFromElement(warningText);
    }
}