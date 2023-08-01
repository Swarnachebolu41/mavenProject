package Seleniumbasics;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Connections {
    public static void main(String[] args) throws InterruptedException {
       ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("user-name")).sendKeys("standard-users");
        driver.findElement(By.id("password")).sendKeys("secret-sauce");
        driver.close();
    }
}
