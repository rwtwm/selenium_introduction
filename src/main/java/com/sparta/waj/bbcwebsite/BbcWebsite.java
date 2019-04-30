package com.sparta.waj.bbcwebsite;

import com.sparta.waj.bbcwebsite.pages.HomePage;
import com.sparta.waj.bbcwebsite.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class BbcWebsite
{
    private WebDriver driver;

    public BbcWebsite(WebDriver driver)
    {
        this.driver = driver;
    }

    public HomePage getHomepage()
    {
        return new HomePage(driver);
    }

    public LoginPage getLoginPage()
    {
        return new LoginPage(driver);
    }
}
