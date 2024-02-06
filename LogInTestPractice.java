package com.solvd.laba;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogInTestPractice {
    @Test(description = "Verifies login with valid credentials")
    public void verifyLoginWithValidCredentialsTest(){
        boolean emailInputExist = true;
        boolean passwordInputExist = false;
        String actualEmail = "qwerty@solvd.com";

        Assert.assertTrue(actualEmail.matches("^.*\\..*$")); // if this fails the rest assertions done run
        Assert.assertTrue(emailInputExist, "if test fails shows this message");
        Assert.assertTrue(passwordInputExist, "password no exist");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals("asdsad","qwerty", "fail messager here");
        sa.assertAll();


    }

    @Test(description = "Verifies login with Invalid credentials", enabled = false)
    public void verifyLoginWithInvalidCredentialsTest(){
        System.out.println("looo");
    }
}
