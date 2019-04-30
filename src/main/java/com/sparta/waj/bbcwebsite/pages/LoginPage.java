package com.sparta.waj.bbcwebsite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.print.DocFlavor;

public class LoginPage
{
    WebDriver driver;

    private final String pageUrl = "https://account.bbc.com/signin";
    private final By emailField = By.id("user-identifier-input");



    private final By pwdField = By.id("password-input");

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goToSignInPage()
    {
        driver.navigate().to(pageUrl);
    }

    public LoginPage inputUserName(String input)
    {
        driver.findElement(emailField).sendKeys(input);
        return this;
    }

    public LoginPage inputPassword(String password)
    {
        driver.findElement(pwdField).sendKeys(password);
        return this;
    }
}
