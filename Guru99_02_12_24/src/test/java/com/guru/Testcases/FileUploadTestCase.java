package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.FileUploadPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class FileUploadTestCase extends BaseClass {

    @Test (description = "Uploading file ")
    public void uploadFile() throws IOException, InterruptedException {
        initialize();
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.chooseFile();
        tearDown();
    }
}
