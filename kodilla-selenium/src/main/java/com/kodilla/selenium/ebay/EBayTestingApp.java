package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        String driverPath="/Users/krzesim/IdeaProjects/kodilla-course/kodilla-selenium/build/resources/main/chromedriver";
        System.setProperty("webdriver.chrome.driver",driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ebay.com");

        WebElement inputField = driver.findElement(By.id("gh-ac"));
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}
