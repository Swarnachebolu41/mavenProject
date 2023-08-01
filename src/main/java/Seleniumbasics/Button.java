package Seleniumbasics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


import static org.openqa.selenium.By.*;

public class Button {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.id("alert1")).click();
        WebElement button=driver.findElement(By.id("alert1"));
       // Actions actions=new Actions(driver);
        //actions.click(button).perform();
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()",button);

    }
}
