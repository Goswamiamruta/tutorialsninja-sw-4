package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
    //1.1 create method with name "selectMenu" it has one parameter name "menu" of type String.
    //1.2 This method should click on the menu whatever name is passed as parameter. Write the following Test.


    public void selectMenu(String menu) {

        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (
                StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }
    By desktopLink = By.linkText("Desktops");
    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By showAllDeskStops = By.xpath("//a[contains(text(),'Show AllDesktops')]");
    By laptopNotebooks = By.linkText("Laptops & Notebooks");
    By laptopNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By components = By.linkText("Components");
    By componentsText = By.xpath("//h2[contains(text(),'Components')]");

    public String verifyDesktopsText() {
        return getTextFromElement(desktopsText);
    }

    public void mouseHoverOnDesktops() {
        mouseHoverToElementAndClick(desktopLink);
    }
    public void selectMenu(){
        clickOnElement(showAllDeskStops);
    }
    public void mouseHoverOnLaptopNotebooks() {
        mouseHoverToElementAndClick(laptopNotebooks);
    }

    public String verifyLaptopNotebooksText() {
        return getTextFromElement(laptopNotebooksText);
    }
    public void mouseHoverOnComponents() {
        mouseHoverToElementAndClick(components);
    }

    public String verifyComponentsText() {
        return getTextFromElement(componentsText);
    }

}