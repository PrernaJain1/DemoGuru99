package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessingLinkPage extends BaseClass {
    public UtilClass utilClass;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy(xpath = "//a[text()='Accessing Link']")
    public WebElement accessingLink;

    @FindBy(xpath = "(//a[text()='click here'])[1]")
    public WebElement clickHereFirst;

    @FindBy(xpath = "(//a[text()='click here'])[2]")
    public WebElement clickHereSecond;

    @FindBy(xpath = "//img[@alt='Google']")
    public WebElement googleImage;

    @FindBy(xpath = "//img[@alt='Facebook']")
    public WebElement facebookImage;

    public AccessingLinkPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass = new UtilClass(driver);
    }

    public void clickOnFirstLink(){
        seleniumDropdown.click();
        utilClass.scrollToElement(accessingLink);
        accessingLink.click();
        clickHereFirst.click();

    }

    public void clickOnSecondLink(){
        driver.navigate().back();
        clickHereSecond.click();
    }
}
