package com.demo.guru.Utility;

import com.demo.guru.Base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UtilClass extends BaseClass {

    public UtilClass(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor script= (JavascriptExecutor) driver;
        script.executeScript("arguments[0].scrollIntoView(true)",element);
    }
    public void hoverOnElement(WebElement element){
        Actions a = new Actions(driver);
        a.moveToElement(element).build().perform();
    }
}
