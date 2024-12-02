package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class DemoFlashMoviePage extends BaseClass {
    public UtilClass utilClass;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy (xpath = "//a[text()='Flash Movie Demo']")
    public WebElement flashMovieDemo;

    @FindBy (xpath = "//font[text()='DEMO Flash Movie']")
    public WebElement demoFlashText;

    @FindBy (xpath = "//input[@name='Play']")
    public WebElement playButton;

    @FindBy (xpath = "//input[@name='Stop']")
    public WebElement stopButton;

    @FindBy (xpath = "//input[@name='Zoomin']")
    public WebElement zoomInButton;

    @FindBy (xpath = "//input[@name='Zoomout']")
    public WebElement zoomOutButton;

    public DemoFlashMoviePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass = new UtilClass(driver);
    }

    public void demoText() throws IOException {
        seleniumDropdown.click();
        utilClass.scrollToElement(flashMovieDemo);
        flashMovieDemo.click();
    }
}
