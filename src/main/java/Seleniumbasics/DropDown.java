package Seleniumbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basics.select-dropdown-demo.html");
        driver.manage().window().maximize();
    }
}
