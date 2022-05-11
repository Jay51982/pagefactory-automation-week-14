package com.automation.testsuite;


import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class SignPageTest extends TestBase {

CreateAccountPage createAccountPage;
HomePage homePage;
SignInPage signInPage;
ProductPage productPage;
WomenCategoryPage womenCategoryPage;

@BeforeMethod
    public void inIt() {
    createAccountPage = new CreateAccountPage();
    homePage = new HomePage();
    signInPage = new SignInPage();
    productPage = new ProductPage();
    womenCategoryPage = new WomenCategoryPage();
}
@Test
public void userShouldNavigateToSignInPageSuccessFully() throws InterruptedException {

    createAccountPage.clickOnSignInLink();

    Thread.sleep(1000);
    String expectedErrorMessage = "AUTHENTICATION";
    String actualErrorMessage = signInPage.getAuthenticationText();
    Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "AUTHENTICATION - message is not displayed");
}

@Test(dataProvider = "credentials",dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,String message){
    createAccountPage.clickOnSignInLink();
    signInPage.enterRegisteredEmaiID(username);
    signInPage.enterRegisteredPassword(password);
    signInPage.clickOnRegistedSignIn();
    String expectedResult = message;
    String actualResult = signInPage.verifyErrorMessage(message);
    Assert.assertEquals(actualResult,expectedResult,"Message not found.");
}
    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        createAccountPage.clickOnSignInLink();
        signInPage.enterRegisteredEmaiID("prime256@gmail.com");
        signInPage.enterRegisteredPassword("Prime456");
        signInPage.clickOnRegistedSignIn();
        String expectedResult = "Sign out";
        String actualResult = signInPage.getErrorMessage();
        Assert.assertEquals(actualResult,expectedResult,"Message not found.");
    }
    @Test
    public void verifyThatUserShouldLogOutSuccessFully(){
        createAccountPage.clickOnSignInLink();
        signInPage.enterRegisteredEmaiID("prime256@gmail.com");
        signInPage.enterRegisteredPassword("Prime456");
        signInPage.clickOnRegistedSignIn();
        signInPage.clickOnSignOutButton();
        String expectedResult = "Sing in";
        String actualResult = signInPage.getErrorMessage();
        Assert.assertEquals(actualResult,expectedResult,"Message not found.");
    }


}
