package com.sparta.waj.bbcwebsite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
{
    private WebDriver driver;
    private final String homepageUrl = "https://www.bbc.co.uk/";
    private final By SIGN_ID = By.id("idcta-username");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void goToHomePage()
    {
        driver.navigate().to(homepageUrl);
    }

    public void clickSignInLink()
    {
        driver.findElement(SIGN_ID).click();
    }
}
