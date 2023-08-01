package Seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class CognitiveMode {
    public static void main(String[] args){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
