package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		
        co.addArguments("--remote-allow-origins=*");
        
        driver=new ChromeDriver(co);
        
        driver.get("https://www.google.com/");
        
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("a")).click();
		
		System.out.println("123");
	}

}
