package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Jay Vaghani
 */
public class CreateAccountPage extends Utility {
    /*1. verifyThatUserShouldCreateAccountSuccessfully()
    Click on Sign in Link
    Enter email address
    Click on "Create an account" button
    Fill all mandetory fields
    Click on "Register" button
    Verify message "My Account"
    * */
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signInLink;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailAddressBox;
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAnAccountBtn;
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement mrRadioBtn;
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement mrsRadioBtn;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNameBox;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordBox;
    @FindBy(xpath = "//select[@id='days']")
    WebElement dateOfBirth;
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthOfBirth;
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearOfBirth;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement fNameAddressBox;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lNameAddressBox;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressFirstLineBox;
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityAddressBox;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateAddressBox;
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement countryAddressBox;
    @FindBy(id= "postcode")
    WebElement zipCodeBox;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNo;
    @FindBy(xpath = "//input[@id='alias']")
    WebElement assignAddressBox;

    @FindBy(xpath = "//span[normalize-space()='Register']")
    WebElement registerBtn;
    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement myAccountText;

    public String getMYACCOUNTText() {
        return getTextFromElement(myAccountText);
    }

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnRegisterBtn() {
        clickOnElement(registerBtn);
    }

    public void enterAddressAlias(String addressAlias) {
        sendTextToElement(assignAddressBox, addressAlias);
    }

    public void enterMobileNo(String mobile) {
        sendTextToElement(mobileNo, mobile);
    }
    public void enterZipCode(String zipCode) {
        sendTextToElement(zipCodeBox, zipCode);
    }
    public void selectCounty(String country) {
        selectByVisibleTextFromDropDown(countryAddressBox, country);
    }

    public void selectState(String state) {
        selectByVisibleTextFromDropDown(stateAddressBox, state);
    }

    public void enterCityBox(String city) {
        sendTextToElement(cityAddressBox, city);
    }

    public void enterAddressFirstLineBox(String fline) {
        sendTextToElement(addressFirstLineBox, fline);
    }

    public void enterlastNameAddressBox(String lName) {
        sendTextToElement(lNameAddressBox, lName);
    }

    public void enterFirstNameAddressBox(String fName) {
        sendTextToElement(fNameAddressBox, fName);
    }

    public void selectYearOfBirth(String year) {
        selectByValueFromDropDown(yearOfBirth, year);
    }

    public void selectMonthOfBirth(String month) {
        selectByValueFromDropDown(monthOfBirth, month);
    }

    public void selectDateOfBirth(String date) {

        selectByValueFromDropDown(dateOfBirth,date);
    }

    public void enterPassword(String pword) {
        sendTextToElement(passwordBox, pword);
    }

    public void enterlastName(String lName) {
        sendTextToElement(lastNameBox, lName);
    }

    public void enterFirstName(String fName) {
        sendTextToElement(firstNameBox, fName);
    }

    public void clickGenderRadioBtn(String gender) {
        if (gender == "Mr") {
            clickOnElement(mrRadioBtn);
        } else {
            clickOnElement(mrsRadioBtn);
        }
    }

    public void clickOnCreateAnAccountBtn() {
        clickOnElement(createAnAccountBtn);
    }

    public void clickOnSignInLink() {
        clickOnElement(signInLink);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailAddressBox, email);
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
