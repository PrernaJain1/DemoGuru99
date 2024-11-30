package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.AccessingLinkPage;
import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;

public class AccessingLinkTestCase extends BaseClass {

    @Test
    public void clickHere() throws IOException {
        initialize();
        AccessingLinkPage accessingLinkPage = new AccessingLinkPage(driver);
        accessingLinkPage.clickOnFirstLink();
        assertTrue(accessingLinkPage.googleImage.isDisplayed());
        accessingLinkPage.clickOnSecondLink();
        assertTrue(accessingLinkPage.facebookImage.isDisplayed());
        tearDown();
    }
}
