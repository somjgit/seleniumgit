package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicElements {
public static String browser = "edge";
public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if
				
			(browser.equals("edge")) {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
								
		}else if 
			
		(browser.equals("Firefox")) {
		 WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
					
		}
		driver.get("https://trellix-uat.trellix.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		
	    driver.close();
	   
		

	}


}
