package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.RadioAndCheckBoxPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class RadioAndCheckBox extends BaseClass {

    @Test
    public void clickOnRadioButtonAndCheckbox() throws IOException {
        initialize();
        RadioAndCheckBoxPage radioAndCheckBoxPage = new RadioAndCheckBoxPage(driver);
        radioAndCheckBoxPage.clickOnRadioAndCheckButton();
        tearDown();
    }
}
