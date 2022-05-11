package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;


/**
 * Created by Jay Vaghani
 */
public class SignInPage extends Utility {

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailAddress;

    @FindBy(xpath = "")
    WebElement password;

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signInButton;

    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAccountButton;

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement AUTHENTICATIONText;
    @FindBy(xpath = "//input[@id='email']")
    WebElement enterRegiteredEmail;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement enterRegisteredPassword;
    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement registeredSignInBtn;
    @FindBy(xpath = "//li[normalize-space()='Invalid email address.']")
    WebElement registeredLoginMessage;
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOutBtn;




    public SignInPage() {
        PageFactory.initElements(driver,this);
    }

    public String getSignOutText() {
        return getTextFromElement(signOutBtn);
    }

    public void clickOnSignOutButton(){
        clickOnElement(signOutBtn);
    }
    public String getErrorMessage() {
        return getTextFromElement(registeredLoginMessage);
    }
    public void clickOnRegistedSignIn(){
        clickOnElement(registeredSignInBtn);
    }

    public void enterRegisteredEmaiID(String email) {
       // Reporter.log("Enter password " + email + " to password field " + enterRegisteredEmaiID().toString());

        sendTextToElement(enterRegiteredEmail,email);
    }
    public void enterRegisteredPassword(String password) {
        //Reporter.log("Enter password " + password + " to password field " + enterRegisteredPassword.toString());

        sendTextToElement(enterRegisteredPassword, password);
    }

    public String getAuthenticationText() {
        return getTextFromElement(AUTHENTICATIONText);
    }
    public String verifyErrorMessage(String errorMsg) {

        List<WebElement> topMenuNames = driver.findElements(By.xpath("//body/div[@id='page']/div[@class='columns-container']/div[@id='columns']/div[@class='row']/div[@id='center_column']/div[1]"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(errorMsg)) {
                break;
            }
        }
        return errorMsg;
    }





//
//    public String getWelcomeText() {
//        return getTextFromElement(welcomeText);
//    }
//
//    public void enterEmailId(String email) {
//        sendTextToElement(emailField, email);
//    }
//
//    public void enterPassword(String password) {
//        sendTextToElement(passwordField, password);
//    }
//
//    public void clickOnLoginButton() {
//        clickOnElement(loginButton);
//    }
//
//    public String getErrorMessage() {
//        return getTextFromElement(errorMessage);
//    }

}
