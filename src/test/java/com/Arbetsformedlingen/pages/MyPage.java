package com.Arbetsformedlingen.pages;
import com.Arbetsformedlingen.utilities.BrowserUtils;
import com.Arbetsformedlingen.utilities.ConfigurationReader;
import com.Arbetsformedlingen.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyPage extends BasePage {

    JavascriptExecutor executor = (JavascriptExecutor) Driver.get();

    @FindBy(xpath = "//span[normalize-space()='Mina uppgifter']")
    public WebElement minaUppgifter;

    public void clickMinaUppgifter() {
        BrowserUtils.clickWithJS(minaUppgifter);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement redigeraUppgifter;

    public void clickRedigeraUppgifterButton() {
        redigeraUppgifter.click();
    }

    @FindBy(xpath = "//*[@name='phoneCell']")
    public WebElement mobilTelefonNummerBox;

    public void changeInfo() {
        mobilTelefonNummerBox.clear();
        mobilTelefonNummerBox.sendKeys(ConfigurationReader.get("telephone"));
    }


    @FindBy(xpath = "//div[normalize-space()='Spara uppgifter']")
    public WebElement sparaUppgifterButton;

    public void clickSparaUppgifterButton() {
        sparaUppgifterButton.click();
    }

    @FindBy(xpath = "(//*[@class='asms-read-only-field__value'])[6]")
    public WebElement mobilTelefonNummer;

    public void monitorNewValue() {
        System.out.println("mobilTelefonNummer = " + mobilTelefonNummer.getText());
        Assert.assertEquals(ConfigurationReader.get("telephone"), mobilTelefonNummer.getText());

    }


}