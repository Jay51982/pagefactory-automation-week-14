package com.automation.testsuite;


import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {

    CreateAccountPage createAccountPage;
    HomePage homePage;
    SignInPage loginPage;
    ProductPage productPage;
    WomenCategoryPage womenCategoryPage;

    @BeforeMethod
    public void inIt() {
        createAccountPage = new CreateAccountPage();
        homePage = new HomePage();
        loginPage = new SignInPage();
        productPage = new ProductPage();
        womenCategoryPage = new WomenCategoryPage();
    }

    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        createAccountPage.clickOnSignInLink();
        createAccountPage.enterEmailId("shayona1@gmail.com");
        createAccountPage.clickOnCreateAnAccountBtn();
        Thread.sleep(1000);
        createAccountPage.clickGenderRadioBtn("Mr");
        createAccountPage.enterFirstName("John");
        createAccountPage.enterlastName("Smith");
        createAccountPage.enterPassword("BAPS1");
        Thread.sleep(1000);
        createAccountPage.selectDateOfBirth("7");
        createAccountPage.selectMonthOfBirth("12");
        createAccountPage.selectYearOfBirth("1921");
        createAccountPage.enterFirstNameAddressBox("John");
        createAccountPage.enterlastNameAddressBox("Smith");
        createAccountPage.enterAddressFirstLineBox("Kensington Place Road");
        createAccountPage.enterCityBox("Los Angeles");
        Thread.sleep(1000);
        createAccountPage.selectState("California");
        createAccountPage.enterZipCode("12345");
        createAccountPage.selectCounty("United States");
        createAccountPage.enterMobileNo("01245 678901");
        createAccountPage.enterAddressAlias("None");
        createAccountPage.clickOnRegisterBtn();
        Thread.sleep(1000);
        String expectedErrorMessage = "MY ACCOUNT";
        String actualErrorMessage = createAccountPage.getMYACCOUNTText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "MY ACCOUNT - message is not displayed");
    }

}
