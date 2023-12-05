package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {
    By account = By.xpath("//span[normalize-space()='My Account']");
    By registerAccount = By.xpath("//h1[normalize-space()='Register Account']");
    By accountCreatedText = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By firstName = By.xpath("//input[@id='input-firstname']");
    By lastName = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By telephone = By.xpath("//input[@id='input-telephone']");
    By password = By.xpath("//input[@id='input-password']");
    By confirmPassword = By.xpath("//input[@id='input-confirm']");
    By agree = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By continueButton2 = By.xpath("//a[contains(text(),'Continue')]");
    By accountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
    By returningCustomer = By.xpath("//h2[normalize-space()='Returning Customer']");
    By myAccount = By.xpath("//h2[normalize-space()='My Account']");
    By emailId = By.xpath("//input[@id='input-email']");
    By password2 = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@value='Login']");
    public void selectMyAccountOptions(String option) {
        clickOnElement(account);

    }

    public String getRegisterAccountText() {
        return getTextFromElement(registerAccount);
    }

    public void enterFirstName(String firstNme) {
        sendTextToElement(firstName, firstNme);
    }

    public void enterLastName(String value) {
        sendTextToElement(lastName, value);
    }

    public void enterEmail(String value) {
        sendTextToElement(email, value);
    }

    public void enterPhoneNumber(String value) {
        sendTextToElement(telephone, value);
    }

    public void enterPassword(String value) {
        sendTextToElement(password, value);
    }

    public void enterConfirmPassword(String value) {
        sendTextToElement(confirmPassword, value);
    }

    public void selectSubscribeButton(String value) {
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }

    public void clickOnAgree() {
        clickOnElement(agree);
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
    }

    public void clickOnContinue2() {
        clickOnElement(continueButton2);
    }

    public String getAccountCreatedText() {
        return getTextFromElement(accountCreatedText);
    }

    public String getAccountLogoutText() {
        return getTextFromElement(accountLogout);
    }

    public String getReturningCustomerText() {
        return getTextFromElement(returningCustomer);
    }

    public String getMyAccountText() {
        return getTextFromElement(myAccount);
    }
    public void enterEmailId(String value){
        sendTextToElement(emailId, value);
    }
    public void enterPassword2(String value){
        sendTextToElement(password2, value);
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }

}
