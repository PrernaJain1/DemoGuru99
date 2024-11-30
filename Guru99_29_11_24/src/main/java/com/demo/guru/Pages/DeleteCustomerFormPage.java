package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerFormPage extends BaseClass {
    public UtilClass utilClass;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy(xpath = "//a[text()='Delete Customer Form']")
    public WebElement deleteOption;

    @FindBy(xpath = "//input[@name='cusid']")
    public WebElement customerId;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submitButton;

    public DeleteCustomerFormPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass = new UtilClass(driver);
    }

    public void deletingForm(){
        seleniumDropdown.click();
        utilClass.scrollToElement(deleteOption);
        deleteOption.click();
        customerId.click();
        customerId.sendKeys(properties.getProperty("custId"));
        submitButton.click();
        Alert a = driver.switchTo().alert();
        a.accept();
        System.out.println(a.getText());
        a.accept();
    }
}
