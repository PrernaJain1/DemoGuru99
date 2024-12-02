package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.ScrollBarPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScrollBarTestCase extends BaseClass {

    @Test (description = "Scrolling to a element")
    public void scrolling() throws IOException {
        initialize();
        ScrollBarPage scrollBarPage = new ScrollBarPage(driver);
        scrollBarPage.scrollingToElement();
        tearDown();
    }
}
