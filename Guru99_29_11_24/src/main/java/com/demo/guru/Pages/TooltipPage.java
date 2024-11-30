package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class TooltipPage extends BaseClass {
    public UtilClass utilClass;

    @FindBy (xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy (xpath = "//a[text()='Tooltip']")
    public WebElement toolTip;

    @FindBy (id = "download_now")
    public WebElement downloadNow;

    @FindBy (xpath = "//td[text()='flowplayer-3.2.7.zip']")
    public WebElement fileName;

    @FindBy (xpath = "//td[text()='112 kB']")
    public WebElement size;

    public TooltipPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        utilClass = new UtilClass(driver);
    }

    public void downloadNow(){
        seleniumDropdown.click();
        utilClass.scrollToElement(toolTip);
        toolTip.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        utilClass.hoverOnElement(downloadNow);
    }
}
