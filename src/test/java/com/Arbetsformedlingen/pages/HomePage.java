package com.Arbetsformedlingen.pages;

import com.Arbetsformedlingen.utilities.ConfigurationReader;
import com.Arbetsformedlingen.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{



    public void goToHomePage(){

        Driver.get().get(ConfigurationReader.get("url"));
    }

    @FindBy(xpath = "//*[@class='functions-nav__item'][1]")
    public WebElement logInButton;

    public void clickLogin() {
        logInButton.click();
    }
}
