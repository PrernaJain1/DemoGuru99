package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.TooltipPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class TooltipTestCase extends BaseClass {

    @Test(priority = 1, description = "It will check the name of file in tooltip section")
    public void checkFileNameToolTip() throws IOException {
        initialize();
        TooltipPage tool = new TooltipPage(driver);
        tool.downloadNow();
        Assert.assertEquals(tool.fileName.getText(),properties.getProperty("fileNameToolTip"),"Equal names");
        tearDown();
    }

    @Test(priority = 2, description = "It will check the size of file in tooltip section")
    public void checkSizeToolTip() throws IOException {
        initialize();
        TooltipPage tool = new TooltipPage(driver);
        tool.downloadNow();
        //Soft assert
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(tool.size.getText(),properties.getProperty("fileSize"),"Equal version");
        tearDown();
    }
}
