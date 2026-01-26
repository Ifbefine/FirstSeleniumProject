package de.webshop.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase{
    @BeforeMethod
    public void addItemToCartTest() throws InterruptedException {
        click(By.className("ico-login"));
        type(By.id("Email"),"vovadinu5@gmail.com");
        type(By.id("Password"),"Test1234567");
        By loginButton = By.cssSelector(".button-1.login-button");
click(loginButton);
        Thread.sleep(2000);




    }
    @Test

    public void tryToAddInBasket() throws InterruptedException {
        click(By.cssSelector("a[href='/141-inch-laptop']"));
Thread.sleep(2000);
        click(By.cssSelector(".add-to-cart-panel [data-productid='31']"));

        click(By.cssSelector(".ico-cart .cart-label"));
        Thread.sleep(3000);
        int link = driver.findElements(By.cssSelector("a.product-name[href='/141-inch-laptop']")).size();
        Assert.assertEquals(link,1);






    }

}
