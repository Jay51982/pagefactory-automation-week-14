package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductPage extends Utility {
    @FindBy(xpath = "//a[@title='Blouse'][normalize-space()='Blouse']")
    WebElement blouse;
    @FindBy(xpath = "//a[@id='color_8']")
    WebElement white;
    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-in-line first-item-of-tablet-line last-item-of-mobile-line']//a[@title='Printed Dress'][normalize-space()='Printed Dress']")
    WebElement printedDress;
    @FindBy(xpath = "//a[@id='color_13']")
    WebElement colorOrg;
    @FindBy(xpath = "//a[normalize-space()='Printed Chiffon Dress']")
    WebElement prichiDress;
    @FindBy(xpath = "//a[@id='color_15']")
    WebElement colorGrn;
    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-item-of-tablet-line']//a[@title='Printed Summer Dress'][normalize-space()='Printed Summer Dress']")
    WebElement summerDress;
    @FindBy(xpath = "//a[@id='color_14']")
    WebElement colorBlu;
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizesel;
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement qtyAdd;
    @FindBy(xpath = "//span[normalize-space()='Add to cart']")
    WebElement addCart;
    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement verifyAddText;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeBtn;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void selProduct(String proName) {
        if (proName.equalsIgnoreCase("Blouse")) {
            this.clickOnElement(this.blouse);
        } else if (proName.equalsIgnoreCase("Printed Dress")) {
            this.clickOnElement(this.printedDress);
        } else if (proName.equalsIgnoreCase("printed Chiffon Dress")) {
            this.clickOnElement(this.prichiDress);
        } else if (proName.equalsIgnoreCase("Printed Summer Dress with price $28.98")) {
            this.clickOnElement(this.summerDress);
        }

    }

    public void selColour(String color) {
        if (color.equalsIgnoreCase("White")) {
            this.clickOnElement(this.white);
        } else if (color.equalsIgnoreCase("Orange")) {
            this.clickOnElement(this.colorOrg);
        } else if (color.equalsIgnoreCase("Green")) {
            this.clickOnElement(this.colorGrn);
        } else if (color.equalsIgnoreCase("Blue")) {
            this.clickOnElement(this.colorBlu);
        }

    }

    public void enterQtyAdd(String qty) {
        this.qtyAdd.clear();
        this.sendTextToElement(this.qtyAdd, qty);
    }

    public void selectSize(String size) {
        this.selectByVisibleTextFromDropDown(this.sizesel, size);
    }

    public void clickAddCart() {
        this.clickOnElement(this.addCart);
    }

    public void getAddMes(String message) {
        this.verifyThatTextIsDisplayed(this.verifyAddText, message);
    }

    public void setCloseBtn() {
        this.clickOnElement(this.closeBtn);
    }

}
