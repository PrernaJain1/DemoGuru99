package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxDemoPage extends BaseClass {
    public UtilClass utilClass;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy(xpath = "//a[text()='Ajax Demo']")
    public WebElement ajaxDemo;

    @FindBy(id = "yes")
    public WebElement yesButton;

    @FindBy(id = "no")
    public WebElement noButton;

    @FindBy(id = "buttoncheck")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@value='Reset']")
    public WebElement resetButton;

    @FindBy(xpath = "//p[@class='radiobutton']")
    public WebElement noVerify;

    public AjaxDemoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass = new UtilClass(driver);
    }

    public void clickOnYesReset(){
        seleniumDropdown.click();
        ajaxDemo.click();
        yesButton.click();
        resetButton.click();
    }
    public void clickOnNoSubmit(){
        noButton.click();
        submitButton.click();
    }
}
