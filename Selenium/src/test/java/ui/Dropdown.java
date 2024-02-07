package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
public static String browser = "chrome";
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://trellix-uat.trellix.com/contact-us/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='desktopSearchButton']")).click();
		WebElement search = driver.findElement(By.xpath("//*[@id='msearch']"));
		search.sendKeys("vir");
		Thread.sleep(3000);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
		
		
			WebElement search1 = driver.findElement( By.xpath("//*[@id='msearch']"));
			search.sendKeys("virus")
			search.sendKeys(Keys.ARROW_DOWN);
			
			
		

	}


}
