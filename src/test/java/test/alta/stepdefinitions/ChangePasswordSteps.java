package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;

public class ChangePasswordSteps {
    @Steps
    LoginScreen loginScreen;


    @Given("user on the login page")
    public void onTheLoginPage(){
        Assert.assertTrue(loginScreen.isOnLoginPage());
    }

    @When("user click on lupa password? button")
    public void clickLupaPasswordButton(){
        loginScreen.clickLupaPasswordButton();
    }

    @And("user input {string} on email field")
    public void inputEmail(String email){
        loginScreen.inputEmail(email);
    }
    @And("user click lanjut button")
    public void clickLanjutButton(){
        loginScreen.clickLanjutButton();
    }
    @And("user input new {string} on New Password field")
    public void inputNewPassword(String password){
        loginScreen.insertNewPassword(password);
    }

    @And("user click confirm button")
    public void clickConfirmButton1(){
        loginScreen.clickConfirmbuttonOne();
    }
    @Then("user click on confirm button")
    public void clickConfirmButton2(){
        loginScreen.clickConfirmButtonTwo();
    }




}
