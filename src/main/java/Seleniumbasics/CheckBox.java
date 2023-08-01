package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        driver.manage().window().maximize();
        WebElement text=driver.findElement(By.id("email"));
        Actions actions=new Actions(driver);
        actions.moveToElement(text);
        actions.perform();
        driver.findElement(By.id("englishchbx")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("englishchbx")).click();
    }
}
