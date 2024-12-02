package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RadioAndCheckBoxPage extends BaseClass {
    public UtilClass utilClass;

    @FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy (xpath = "//a[text()='Radio & Checkbox Demo']")
    public WebElement radioCheckBox;

    @FindBy (id= "vfb-7-2")
    public WebElement radioButton;

    @FindBy (xpath="//input[contains(@value,'checkbox')]")
    public static List<WebElement> checkBoxes;

    public RadioAndCheckBoxPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        utilClass = new UtilClass(driver);
    }

    public void clickOnRadioAndCheckButton(){
        seleniumDropdown.click();
        utilClass.scrollToElement(radioCheckBox);
        radioCheckBox.click();
        radioButton.click();

        for(WebElement check : checkBoxes){
            check.click();
        }
        //Uncheck
        for(WebElement check : checkBoxes){
            check.click();
        }
    }
}
