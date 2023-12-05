package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.TopMenuPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuPage homePage =new TopMenuPage();

    @Test
    public void  verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverOnDesktops();

        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.selectMenu("Show AllDesktops");

        //1.3 Verify the text ‘Desktops’
        String actualDesktopsText = homePage.verifyDesktopsText();
        Assert.assertEquals(actualDesktopsText,"Desktops","text not match");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverOnLaptopNotebooks();

        // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.selectMenu("Show AllLaptops & Notebooks");

        // 2.3 Verify the text ‘Laptops & Notebooks’
        String actualLaptopNotebooksText = homePage.verifyLaptopNotebooksText();
        Assert.assertEquals(actualLaptopNotebooksText, "Laptops & Notebooks", "Text not match");

    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

            //3.1 Mouse hover on “Components” Tab and click
            homePage.mouseHoverOnComponents();

            //3.2 call selectMenu method and pass the menu = “Show All Components”
            homePage.selectMenu("Show AllComponents");

            // 3.3 Verify the text ‘Components’
            String actualComponentsText = homePage.verifyComponentsText();
            Assert.assertEquals(actualComponentsText,"Components","Text not match");

        }
    }



