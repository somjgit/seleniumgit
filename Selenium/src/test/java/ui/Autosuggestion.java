package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {
public static String browser = "chrome";
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://trellix-uat.trellix.com/contact-us/");
		driver.manage().window().maximize();
		WebElement ddown= driver.findElement(By.name("Job_Function__c"));
		Select select = new Select (ddown);
		
		select.selectByValue("IT Operations Manager");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Brunei Darussalam");
		//Thread.sleep(2000);
		
		//select.selectByIndex(5);
		//Thread.sleep(2000);
			
		
		

	   
		

	}


}
