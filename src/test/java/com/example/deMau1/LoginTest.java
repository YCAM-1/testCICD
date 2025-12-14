package com.example.deMau1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver; // bien nay chay tren chrome
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver(); // tao 1 chrome moi
        driver.manage().window().maximize(); // max screen
    }
    @Test
    public void testRegister() throws InterruptedException{
        driver.get("https://vitimex.com.vn/account/register"); // lay domain dan vao web
        Thread.sleep(5000); // thoi gian doi thuc hien thao tac tiep theo
        driver.findElement(By.id("last_name")).sendKeys("Bao");
        driver.findElement(By.id("first_name")).sendKeys("Quoc");
        driver.findElement(By.id("radio1")).click();
        driver.findElement(By.id("birthday")).sendKeys("01/01/2008");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123123");
        driver.findElement(By.cssSelector("input[type = 'submit'][value='Đăng ký']")).click();
        Thread.sleep(3000);
    }
    @Test
    public void testLogin() throws InterruptedException{
        driver.get("https://vitimex.com.vn/account/login");
        Thread.sleep(5000);
        driver.findElement(By.id("customer_email")).sendKeys("giangthth005801@gmail.com");
        driver.findElement(By.id("customer_password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[type='submit'][value='Đăng nhập']")).click();
        Thread.sleep(5000);
    }
    @Test
    public void testTimKiem() throws InterruptedException{
        driver.get("https://vitimex.com.vn");
        Thread.sleep(5000);
        driver.findElement(By.className("h-search")).click();
        driver.findElement(By.id("inputSearchAuto")).sendKeys("Quần");
        driver.findElement(By.id("search-header-btn")).click();
        Thread.sleep(5000);
    }
    @Test
    public void testDatBanh() throws InterruptedException{
        driver.get("https://www.savor.vn/?viewId=banh-giang-sinh");
        Thread.sleep(3000);
        driver.findElement(By.className("items-center flex flex-row gap-2 p-2")).click();
        Thread.sleep(3000);
    }
}

