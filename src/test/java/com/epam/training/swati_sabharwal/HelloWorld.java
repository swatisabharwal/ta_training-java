package com.epam.training.swati_sabharwal;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
    WebDriver driver = new ChromeDriver();

    @BeforeAll
    public void startUp() {
        driver.get("https://www.google.com");
    }

    @Test
    public void helloWorld() {
        WebElement textBox = driver.findElement(By.name("q"));
        textBox.sendKeys("Hello World");
        textBox.sendKeys(Keys.ENTER);
        Assertions.assertTrue(driver.getTitle().contains("Hello World"));
    }

    @AfterEach
    public void close() {
        driver.close();
    }
}
