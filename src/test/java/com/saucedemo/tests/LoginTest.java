package com.saucedemo.tests;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void invalidLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginInvalid("invalid_user", "invalid_pass");
        String actualError = loginPage.getErrorMessage();
        String expectedError = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualError, expectedError, "Hata mesajı beklenenden farklı!");

        System.out.println("Error message : " + actualError);
    }
}
