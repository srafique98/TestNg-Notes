package com.solvd.laba;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LogInTest {

    @BeforeSuite //will run this method b4 anything in auth_suite.xml runs
    public void setup(){
        // beforeSuite prepare connection to database and all test will use connection
        // afterSuite delete created user after test is complete

    }

    @DataProvider(name = "validCredentials")
    public Object[][] validCredentials(){
      return new Object[][]{
              {"email1","password1"},
              {"email2","password2"}
      };
    }

    @Test(description = "Verifies login with valid credentials", dataProvider = "validCredentials")
    public void verifyLoginWithValidCredentialsTest(String accountNumber, String pin){
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("asdsad","qwerty", "fail messager here");
        sa.assertAll();
    }

    @Test(description = "Verifies login with Invalid credentials", enabled = false)
    public void verifyLoginWithInvalidCredentialsTest(){
        boolean emailInputExist = true;
        boolean passwordInputExist = false;
        String actualEmail = "qwerty@solvd.com";

        Assert.assertTrue(actualEmail.matches("^.*\\..*$"));
        Assert.assertTrue(emailInputExist, "if test fails shows this message");
        Assert.assertTrue(passwordInputExist, "password no exist");
    }

    // design pattern -- LISTENER pattern -- modify any part of program about our internal program
}
