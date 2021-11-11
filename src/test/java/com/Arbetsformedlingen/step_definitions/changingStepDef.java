package com.Arbetsformedlingen.step_definitions;

import com.Arbetsformedlingen.pages.HomePage;
import com.Arbetsformedlingen.pages.LogInPage;
import com.Arbetsformedlingen.pages.MyPage;
import com.Arbetsformedlingen.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class changingStepDef {

    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    MyPage myPage = new MyPage();


    @Given("the user verifies to be homepage")
    public void the_user_verifies_to_be_homepage() {
       homePage.goToHomePage();
        Assert.assertEquals(Driver.get().getTitle(),"Arbetsförmedlingen.se - Arbetsförmedlingen");
    }

    @And("the user clicks log in icon")
    public void the_user_clicks_log_in_icon() {
        homePage.clickLogin();
    }

    @And("the user clicks Username and Password button")
    public void the_user_clicks_Username_and_Password_button() {
       logInPage.clickUsernamePasswordButton();
    }

    @And("the user fills personal credentials")
    public void the_user_fills_personal_credentials() {
       logInPage.fillCredentials();
    }
    @And("the user clicks Log in button")
    public void the_user_clicks_Log_in_button() {
        logInPage.clickLogInButton();
    }
    @And("the user click Mina Uppgifter button")
    public void the_user_click_Mina_Uppgifter_button() {
        myPage.clickMinaUppgifter();
    }
    @And("the user click Redigera Uppgifter button")
    public void the_user_click_Redigera_Uppgifter_button() {
        myPage.clickRedigeraUppgifterButton();
    }
    @And("the user changes info")
    public void the_user_changes_info() {
        myPage.changeInfo();
    }
    @When("the user cliks Save button")
    public void the_user_cliks_Save_button() {
        myPage.clickSparaUppgifterButton();
    }
    @Then("the user monitors new information")
    public void the_user_monitors_new_information() {
        myPage.monitorNewValue();
    }


}
