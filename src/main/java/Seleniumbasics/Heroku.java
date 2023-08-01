package Seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class Heroku {
    WebDriver driver;

    public void connection() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }
    public void dropdown() throws InterruptedException{
        driver.findElement(By.xpath("//a[text()='Dropdown']")).click();
        driver.findElement(By.xpath("//select[@id=\"dropdown\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//option[text()='Option 1']")).click();
        //driver.navigate().back();
    }

    public void basicAuth(){
        driver=new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
    public void digestBasicAuth() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        Thread.sleep(4000);
    }
    public void text(){
        driver.findElement(By.xpath("//a[text()='A/B Testing']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id=\"content\"]")).getText());
    }
    public void addRemove() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[text()='Delete']")).click();

    }
    public void checkBoxes(){
        driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
        WebElement e1=driver.findElement(By.xpath("//div[@class=\"example\"]//child::input[2]"));
        driver.findElement(By.xpath("//div[@class=\"example\"]//child::input[1]")).click();
        System.out.println(e1.isSelected());

    }
    public void contextMenu() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Context Menu']")).click();
        Thread.sleep(4000);
        WebElement alert=driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
        Actions action=new Actions(driver);
        action.contextClick(alert).perform();

    }
    public void dragDrop(){
        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
        WebElement d1=driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement d2=driver.findElement(By.xpath("//div[@id=\"column-b\"]"));
        Actions action=new Actions(driver);
        //action.dragAndDrop(d1,d2).build().perform();
        //action.dragAndDropBy(d1,500,300).perform();
        action.clickAndHold(d1).moveToElement(d2).release().build().perform();


    }
    public void scroll() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Infinite Scroll']")).click();
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
        jse.executeScript("window.scrollBy(0,-1000)");

    }
    public void multipleWindows() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        Set<String> windowhandles=driver.getWindowHandles();
        System.out.println(windowhandles.size());

        Iterator<String> iterator=windowhandles.iterator();
         String parentwindow=iterator.next();
         System.out.println(parentwindow);
         String childwindow=iterator.next();
         System.out.println(childwindow);
        driver.switchTo().window(parentwindow);



    }
}