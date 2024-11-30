package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
    UtilClass utilClass;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement login;

    @FindBy(id ="email")
    public WebElement emailTextbox;

    @FindBy(id ="passwd")
    public WebElement PasswordTextbox;

    @FindBy(id ="SubmitLogin")
    public WebElement submitButton;

    @FindBy(xpath = "//h3[text()='Successfully Logged in...']")
    public WebElement successfulLogin;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass= new UtilClass(driver);
    }

    public void Login(){
        seleniumDropdown.click();
        utilClass.scrollToElement(login);
        login.click();
        emailTextbox.sendKeys(properties.getProperty("email"));
        PasswordTextbox.sendKeys(properties.getProperty("password"));
        submitButton.click();
    }
}
