package com.sparta.waj.bbcwebsite.bbcpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    WebDriver driver;

    private final String pageUrl = "https://account.bbc.com/signin";
    private final By emailField = By.id("user-identifier-input");
    private final By pwdField = By.id("password-input");
    private final By nameError = By.id("form-message-username");
    private final By pwdError = By.id("form-message-password");


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

    public String readNameError()
    {
        return driver.findElement(nameError).getText();
    }

    public String readPwdError()
    {
        return driver.findElement(pwdError).getText();
    }


}
