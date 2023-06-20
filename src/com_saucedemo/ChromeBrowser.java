package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String MyUrl = "https://www.saucedemo.com/";

        //Setup Chrome
        WebDriver MyDriver = new ChromeDriver();

        //Open Url
        MyDriver.get(MyUrl);

        //maximise browser
        MyDriver.manage().window().maximize();

        //implicit
        MyDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print Title
       System.out.println("My Page Title is :" + MyDriver.getTitle());

        //Print Pagesource
        System.out.println("My Page Source is :" + MyDriver.getPageSource());

        //Enter Email in email field

  MyDriver.findElement(By.name("user-name")).sendKeys("Jaydeep@PrimeTesting.com");

        //Enter Password in Password Field

      MyDriver.findElement(By.id("password")).sendKeys("PrimeTesting");


        //Close Driver
        MyDriver.close();

    }

}
