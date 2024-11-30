package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.DragAndDropPage;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class DragAndDropTestCase extends BaseClass {
    @Test
    public void DragAndDropElements() throws IOException, InterruptedException {
        initialize();
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.dragAndDropAction();
        assertEquals(dragAndDropPage.perfectText.getText(),"Perfect!");
        tearDown();
    }
}
