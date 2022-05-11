package com.automation.testsuite;


import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {

CreateAccountPage createAccountPage;
HomePage homePage;
SignInPage signInPage;
ProductPage productPage;
WomenCategoryPage womenCategoryPage;

    public WomenCategoryPageTest() {
    }

    @BeforeMethod
    public void inIt() {
        this.womenCategoryPage = new WomenCategoryPage();
        this.productPage = new ProductPage();
    }

    @Test
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully() {
        this.womenCategoryPage.clickOnWomen();
        String expected = "Women";
        String actual = this.womenCategoryPage.verifyWomen();
        Assert.assertEquals(actual, expected, "not displayed");
    }

    @Test(
            dataProvider = "product",
            dataProviderClass = TestData.class
    )
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour) throws InterruptedException {
        this.womenCategoryPage.clickOnWomen();
        this.productPage.selProduct(product);
        Thread.sleep(2000L);
        this.productPage.selColour(colour);
        this.productPage.enterQtyAdd(qty);
        this.productPage.selectSize(size);
        this.productPage.clickAddCart();
        this.productPage.getAddMes("Product successfully added to your shopping cart");
        Thread.sleep(2000L);
        this.productPage.setCloseBtn();
    }
}
