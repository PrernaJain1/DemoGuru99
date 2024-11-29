package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.TooltipPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TooltipTestCase extends BaseClass {

    @Test(priority = 1)
    public void checkFileNameToolTip() throws IOException {
        initialize();
        TooltipPage tool = new TooltipPage(driver);
        tool.downloadNow();
        Assert.assertEquals(tool.fileName.getText(),properties.getProperty("fileNameToolTip"),"Equal names");
        tearDown();
    }

    @Test(priority = 2)
    public void checkVersionToolTip() throws IOException {
        initialize();
        TooltipPage tool = new TooltipPage(driver);
        tool.downloadNow();
        Assert.assertEquals(tool.fileVersion.getText(),properties.getProperty("fileVersion"),"Equal version");
        tearDown();
    }
}
