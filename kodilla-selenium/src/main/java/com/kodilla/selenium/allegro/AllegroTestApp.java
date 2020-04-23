package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;




public class AllegroTestApp {
    public static void main(String[] args) throws InterruptedException, AWTException {
        String driverPath = "/Users/krzesim/IdeaProjects/kodilla-course/kodilla-selenium/src/main/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.allegro.pl");
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        WebElement inputField = driver.findElement(By.xpath("//*[@class=\"_d25db_3K7x6 _14uqc\"]"));
        inputField.sendKeys("Mavic mini");

        WebElement category = driver.findElement(By.xpath("//*[@class=\"_d25db_2P-5I _1h7wt _k70df _7qjq4\"]"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(2);

        driver.quit();
    }
}
