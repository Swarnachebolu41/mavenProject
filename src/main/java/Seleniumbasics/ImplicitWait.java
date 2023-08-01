package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class ImplicitWait {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement element =driver.findElement(By.xpath("//a[@id=\"nav-link-amazonprime\"]"));
        Actions action =new Actions(driver);
        action.moveToElement(element).perform();
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();


    }
}
