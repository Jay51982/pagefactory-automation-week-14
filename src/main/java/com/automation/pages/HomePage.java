package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses']")
    WebElement DRESSES;
    @FindBy(xpath = "//li[@class='sfHover']//a[@title='T-shirts'][normalize-space()='T-shirts']")
    WebElement TSHIRT;
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement singInLinks;
    @FindBy(xpath = "//img[@alt='My Store']")
    WebElement logoLocators;
    @FindBy(xpath = "//a[@title='Women']")
    WebElement WOMEN;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

}
