package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchText {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://omayo.blogspot.com/");
        driver.manage().window().maximize();
//        String text=driver.findElement(By.id("pah")).getText();
//        System.out.println(text);
        driver.findElement(By.xpath("//input[@name=\"userid\"]")).sendKeys("Hello");
        System.out.println(driver.findElement(By.xpath("//input[@name=\"userid\"]")).getAttribute("value"));
    }
}
