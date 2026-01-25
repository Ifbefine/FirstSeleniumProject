package de.webshop.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccountTests extends TestBase{
@Test
    public void newRegisterPositiveTest() throws InterruptedException {
    click(By.className("ico-register"));
    type(By.id("FirstName"),"Vladimir");
    Thread.sleep(1200);
    type(By.id("LastName"),"Dinu");
    Thread.sleep(1200);
    type(By.id("Email"),"Test20031@gmail.com");
    Thread.sleep(1200);
    type(By.id("Password"),"Abcd@12345678");
    Thread.sleep(1200);
    type(By.name("ConfirmPassword"),"Abcd@12345678");
    Thread.sleep(1200);
    click(By.id("register-button"));
    Thread.sleep(10000);

}
}
