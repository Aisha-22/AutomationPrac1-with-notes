package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

    public void veggieKart() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Creating an instance of a class/or a new object/instantiating a class (className object = new className();)
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

//        Search Button
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Beetroot");
        driver.findElement(By.xpath("//*[@type='submit']")).click();

//        Increase button
        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[4]/div[2]/a[2]")).click();

//        Add to counter button
        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div[4]/div[3]/button")).click();




    }
}
