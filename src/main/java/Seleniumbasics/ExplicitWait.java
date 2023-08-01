package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ExplicitWait {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        WebElement element =driver.findElement(By.xpath("//a[@id=\"nav-link-amazonprime\"]"));
        Actions action =new Actions(driver);
        action.moveToElement(element).perform();


        WebElement mobile= wait.until(ExpectedConditions.presenceOfElementLocated( By.xpath("//a[text()='Mobiles']")));
        mobile.click();


    }
}
