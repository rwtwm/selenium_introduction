package com.sparta.waj;

import com.sparta.waj.bbcwebsite.BbcWebsite;
import com.sparta.waj.bbcwebsite.bbcpageobjects.HomePage;
import com.sparta.waj.bbcwebsite.bbcpageobjects.LoginPage;
import com.sparta.waj.bbcwebsite.seleniumconfig.SeleniumConfig;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTests
{
    private static WebDriver driver;
    private static LoginPage loginPage;


    @BeforeClass
    public static void setUp()
    {
        driver = new SeleniumConfig("").getDriver();
        loginPage = new LoginPage(driver);
        loginPage.goToSignInPage();
    }

    @Test
    public void testUsrFalseChars()
    {
        String errorString = loginPage.inputUserName("00000000!!\t").readNameError();
        Assert.assertTrue(errorString.contains("can only include"));
    }

    @Test
    public void testEmailNotValid()
    {
        String errorString = loginPage.inputUserName(".@@hg\t").readNameError();
        Assert.assertTrue(errorString.contains("email doesn't look"));
    }

    @Test
    public void testPwdNotValid()
    {
        String errorString = loginPage.inputPassword("aaa\t").readNameError();
        Assert.assertTrue(errorString.contains("too short"));
    }

    @AfterClass
    public static void teardown()
    {
        driver.quit();
    }
}
