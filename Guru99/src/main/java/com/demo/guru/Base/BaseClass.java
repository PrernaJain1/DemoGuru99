package com.demo.guru.Base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    public WebDriver driver;
    public Properties properties;
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

    public void tearDown(){
        driver.quit();
    }
}
