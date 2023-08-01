package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckboxHandling {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/#");
        driver.manage().window().maximize();
        WebElement d=driver.findElement(By.name("awareness_source_c"));
        Select select=new Select(d);
        select.selectByValue("Event");
        Thread.sleep(2000);
        select.selectByVisibleText("Internet");
        select.selectByIndex(2);



    }
}
