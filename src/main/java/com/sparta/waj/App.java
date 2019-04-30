package com.sparta.waj;

import com.sparta.waj.bbcwebsite.BbcWebsite;
import com.sparta.waj.bbcwebsite.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();

        BbcWebsite bbcWebsite = new BbcWebsite(chromeDriver);

        HomePage homePage = bbcWebsite.getHomepage();
        homePage.goToHomePage();
        homePage.clickSignInLink();

        bbcWebsite.getLoginPage().inputUserName("somenonsense").inputPassword("morenonsense");

        Thread.sleep(5000);


        chromeDriver.quit();




//        chromeDriver.navigate().to("https://www.bbc.co.uk/");
//
//        chromeDriver.findElement(By.id("idcta-username")).click();
//
//        if (chromeDriver.getCurrentUrl().equals("https://account.bbc.com/signin") && chromeDriver.findElement(By.id("user-identifier-input")).isDisplayed())
//        {
//            chromeDriver.findElement(By.id("user-identifier-input")).sendKeys("notan.@email.com");
//            chromeDriver.findElement(By.id("password-input")).sendKeys("IsAP4ssw0rd");
//        }
//
//        if(chromeDriver.findElement(By.className("form-message__text")).getText().contains("Please check"))
//        {
//            System.out.println("error message found");
//        }


        chromeDriver.quit();
    }
}
