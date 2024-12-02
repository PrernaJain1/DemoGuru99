package com.guru.Testcases;

import com.demo.guru.Base.BaseClass;
import com.demo.guru.Pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTestCase extends BaseClass {

    @Test (description = "Login")
    public void LoginForm() throws IOException {
        initialize();
        LoginPage loginPage= new LoginPage(driver);
        loginPage.Login();
        assertEquals(loginPage.successfulLogin.getText(),"Successfully Logged in...");
        tearDown();
    }
}
