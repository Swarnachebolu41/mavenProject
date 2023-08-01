package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Jio {
    public void hamburger()throws InterruptedException {
       ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.jiomart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ham_close")).click();
        Thread.sleep(4000);
        WebElement e = driver.findElement(By.xpath("//div[text()='Download the App']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(e);
        actions.perform();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='About Us']")).click();
        Thread.sleep(4000);

        driver.findElement(By.xpath("//div[@class=\"header-main-logo jm-mr-m\"]")).click();
        driver.findElement(By.xpath("//button[@class=\"jm-btn primary small jm-border-none\"]")).click();
        driver.findElement(By.xpath("//button[@id=\"btn_enter_pincode\"]")).click();
        driver.findElement(By.id("rel_pincode")).sendKeys("560037");
        driver.findElement(By.id("btn_pincode_submit")).click();
        driver.close();

    }

}
