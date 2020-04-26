package com.kodilla.selenium.allegro;


import org.apache.tools.ant.types.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AllegroTestApp {
    public static void main(String[] args) {
        String driverPath = "/Users/krzesim/IdeaProjects/kodilla-course/kodilla-selenium/src/main/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        while (!driver.findElement(By.xpath("//*[@data-box-name=\"allegro.rodoConsentModal\"]")).isDisplayed()) ;
        WebElement alert = driver.findElement(By.xpath("//button[@class=\"_13q9y _8hkto _11eg6 _7qjq4 _ey68j\"]"));
        alert.click();

        WebElement inputField = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/input"));
        inputField.sendKeys("Mavic mini");

        WebElement category = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/div[2]/div/select"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);
        WebElement button = driver.findElement(By.xpath("//*[@class=\"_1h7wt _d25db_UtYE1\"]/button"));
        button.click();
        String url = driver.getCurrentUrl();
        if (!url.equals("https://allegro.pl/kategoria/elektronika?string=Mavic%20mini&bmatch=baseline-product-cl-eyesa2-engag-dict43-ele-1-1-0318")) {
            throw new RuntimeException();

        }
        driver.quit();


    }
}
