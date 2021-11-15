package com.Arbetsformedlingen.pages;

import com.Arbetsformedlingen.utilities.BrowserUtils;
import com.Arbetsformedlingen.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage{


    @FindBy(xpath = "(//a[normalize-space()='Användarnamn och lösenord'])[1]")
    public WebElement usernameAndPassword;

    public void clickUsernamePasswordButton() {
        usernameAndPassword.click();
            }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//*[@id='txtLosen']")
    public WebElement passwordBox;

    public void fillCredentials() {
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
    }

    @FindBy(xpath = "//*[@data-event-name='Login']")
    public  WebElement logInButton;

    public void clickLogInButton() {
        BrowserUtils.clickWithJS(logInButton);
    }


    }


