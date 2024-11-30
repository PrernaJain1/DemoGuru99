package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class DragAndDropPage extends BaseClass {
    UtilClass utilClass;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy(xpath = "//a[text()='Drag and Drop Action']")
    public WebElement dragAnddrop;

    @FindBy(xpath = "//a[contains(text(),' BANK ')]")
    public WebElement bank;

    @FindBy(xpath = "(//li[@class='placeholder'])[1]")
    public WebElement account;

    @FindBy(xpath = "(//a[contains(text(),' 5000')])[1]")
    public WebElement amount;

    @FindBy(id = "amt7")
    public WebElement amountTarget;

    @FindBy(xpath = "//a[text()=' SALES ']")
    public WebElement sales;

    @FindBy(id = "loan")
    public WebElement account1;

    @FindBy(id = "amt8")
    public WebElement amountTarget1;

    @FindBy(xpath = "//a[text()='Perfect!']")
    public WebElement perfectText;

    public DragAndDropPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass= new UtilClass(driver);
    }

    public void dragAndDropAction() throws InterruptedException {
        seleniumDropdown.click();
        utilClass.scrollToElement(dragAnddrop);
        dragAnddrop.click();
        utilClass.scrollToElement(bank);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Actions a = new Actions(driver);
        a.clickAndHold(bank).moveToElement(account).release().build().perform();
        a.clickAndHold(amount).moveToElement(amountTarget).release().build().perform();
        a.clickAndHold(sales).moveToElement(account1).release().build().perform();
        a.clickAndHold(amount).moveToElement(amountTarget1).release().build().perform();

    }
}
