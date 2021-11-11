package com.Arbetsformedlingen.pages;


import com.Arbetsformedlingen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@class='nav-link']")
    public List<WebElement> navigationMenuItems;


    public void selectNaviTab(String string) {
        for (WebElement navigationMenuItem : navigationMenuItems) {
            if(navigationMenuItem.getText().equalsIgnoreCase(string)){
                navigationMenuItem.click();
                break;
            }
        }

    }
}
