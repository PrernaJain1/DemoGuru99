package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollBarPage extends BaseClass {
    UtilClass utilClass;

    @FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy (xpath = "//a[text()='Scrollbar Demo']")
    public WebElement scrollBarDemo;

    @FindBy (xpath = "//a[text()='VBScript']")
    public WebElement vbScript;

    public ScrollBarPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass = new UtilClass(driver);
    }

    public void scrollingToElement(){
        seleniumDropdown.click();
        utilClass.scrollToElement(scrollBarDemo);
        scrollBarDemo.click();
        utilClass.scrollToElement(vbScript);
        vbScript.click();
    }
}
