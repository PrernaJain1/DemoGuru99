package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.AjaxDemoPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static org.testng.AssertJUnit.assertFalse;

public class AjaxDemoTestCase extends BaseClass {

    @Test
    public void clickOnRadioButtons() throws IOException {
        initialize();
        AjaxDemoPage ajaxDemoPage = new AjaxDemoPage(driver);
        ajaxDemoPage.clickOnYesReset();
        assertFalse(ajaxDemoPage.yesButton.isSelected());
        ajaxDemoPage.clickOnNoSubmit();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(ajaxDemoPage.noVerify.getText(),"Radio button is checked and it's value is No");
        softAssert.assertAll();
        tearDown();
    }
}
