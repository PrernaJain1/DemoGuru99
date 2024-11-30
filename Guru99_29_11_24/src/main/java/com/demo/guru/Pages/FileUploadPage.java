package com.demo.guru.Pages;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Utility.UtilClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class FileUploadPage extends BaseClass {
    UtilClass utilClass;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement seleniumDropdown;

    @FindBy(xpath = "//a[text()='File Upload']")
    public WebElement fileUpload;

    @FindBy(id= "uploadfile_0")
    public WebElement choosingFile;

    @FindBy(id= "terms")
    public WebElement acceptTerms;

    @FindBy(id= "submitbutton")
    public WebElement submitButton;

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        utilClass= new UtilClass(driver);
    }

    public void chooseFile() throws InterruptedException {
        seleniumDropdown.click();
        utilClass.scrollToElement(fileUpload);
        fileUpload.click();
        sleep(15000);
        String path = System.getProperty("user.dir")+"//src//main//resources//Upload//img.png";
        choosingFile.sendKeys(path);
        acceptTerms.click();
        submitButton.click();
    }
}
