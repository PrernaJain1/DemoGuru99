package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.RadioAndCheckBoxPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertFalse;

public class RadioAndCheckBox extends BaseClass {

    @Test
    public void clickOnRadioButtonAndCheckbox() throws IOException {
        initialize();
        RadioAndCheckBoxPage radioAndCheckBoxPage = new RadioAndCheckBoxPage(driver);
        radioAndCheckBoxPage.clickOnRadioAndCheckButton();
        for(WebElement check : RadioAndCheckBoxPage.checkBoxes){
            assertFalse(check.isSelected());
        }

        tearDown();
    }
}
