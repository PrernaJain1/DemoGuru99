package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.DeleteCustomerFormPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class DeleteCustomerFormTestCase extends BaseClass {

    @Test
    public void deletingCustomerForm() throws IOException {
        initialize();
        DeleteCustomerFormPage deleteCustomerFormPage = new DeleteCustomerFormPage(driver);
        deleteCustomerFormPage.deletingForm();
        tearDown();
    }

}
