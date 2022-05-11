package com.automation.pages;


import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;


/**
 * Created by Jay Vaghani
 */
public class WomenCategoryPage extends Utility {

    @FindBy(xpath = "//span[@class='navigation_page']")
    WebElement womenText;
    @FindBy(xpath = "//label[@for='layered_category_4']//a[contains(text(),'Tops')]")
    WebElement tops;
    @FindBy(xpath = "//label[@for='layered_category_8']//a[contains(text(),'Dresses')]")
    WebElement dresses;
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortByDropDown;
//    @FindBy(xpath = "//select[@id='selectProductSort']")
//    WebElement productList;
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAnAccount;
    @FindBy(xpath = "//a[@title='Women']")
    WebElement women;
    @FindBy(xpath = "//span[@class='category-name']")
    WebElement womenTab;
    @FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_3']//li")
    List<WebElement> colourList;
    @FindBy(xpath = "//ul[@class='product_list grid row']//h5//a")
    List<WebElement> productList;

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

   public void clickOnWomen() {
        this.clickOnElement(this.women);
    }

    public String verifyWomen() {
        return this.getTextFromElement(this.womenTab);
    }

    public void selectColour(String colour) {
        Iterator variable2 = this.colourList.iterator();

        while(variable2.hasNext()) {
            WebElement colur = (WebElement)variable2.next();
            if (colur.getText().contains(colour)) {
                System.out.println(colur);
                this.mouseHoverToElementAndClick(colur);
            }
        }
    }

}
