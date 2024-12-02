package com.demo.guru.Base;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class BaseClass {
    public WebDriver driver;
    public static Properties properties;
    public Logger logger = LogManager.getLogger(this.getClass());

    public void initialize() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        FileReader reader = new FileReader("src//main//resources//config.properties");
        properties = new Properties();
        properties.load(reader);

        Properties props = System.getProperties();
        PropertyConfigurator.configure(props.getProperty("user.dir")+ "//src//main//resources//log4j.properties");

        driver.get(properties.getProperty("url"));
        driver.manage().deleteAllCookies();
        logger.info("Initialization done....");
    }

    public void getScreenShot(int i) throws IOException {
        //cast driver to TakeScreenshot
        TakesScreenshot screenshot= (TakesScreenshot) driver;

        //Capture screenshot and store into a file
        File srcFile= screenshot.getScreenshotAs(OutputType.FILE);

        //Define destination path for screenshot
        File destFile = new File("src/test/resources/Screenshot/abc"+i+".png") ;

        //Copy file to destination
        FileUtils.copyFile(srcFile,destFile);

        System.out.println("Screenshot captured successfully");

    }

    public int generateRandomNumber(int min, int max){
        Random random = new Random();
        return random.nextInt((max-min)+1);
    }

    public void tearDown(){
        driver.quit();
    }
}
