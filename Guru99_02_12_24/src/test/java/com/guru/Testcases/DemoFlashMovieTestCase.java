package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.DemoFlashMoviePage;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class DemoFlashMovieTestCase extends BaseClass {

    @Test (description = "Verifying text of movie page", enabled = true)
    public void verifyText() throws IOException {
        initialize();
        DemoFlashMoviePage demoFlashMoviePage = new DemoFlashMoviePage(driver);
        demoFlashMoviePage.demoText();
        assertEquals(demoFlashMoviePage.demoFlashText.getText(),"DEMO Flash Movie");
        tearDown();
    }

    @Test (description = "Clicking on buttons", invocationCount = 2)
    public void clickOnButtons() throws IOException {
        initialize();
        DemoFlashMoviePage demoFlashMoviePage = new DemoFlashMoviePage(driver);
        demoFlashMoviePage.demoText();
        demoFlashMoviePage.playButton.click();
        demoFlashMoviePage.stopButton.click();
        demoFlashMoviePage.zoomInButton.click();
        demoFlashMoviePage.zoomOutButton.click();
        tearDown();

    }
}
