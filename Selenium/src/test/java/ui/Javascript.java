package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
private static final String JaveScriptExcutor = null;
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
		
		
		JavaScriptExecutor jsexec = (JaveScriptExcutor).driver;
		String script = "retuin.document.title;";
		String title1 = (String) jsexec.executeScript(script);
		driver.switchTo().frame("iframeresult");
	    jsexec.executeScript("myfuction()");
	    driver.switchTo().alert().accept();
	    WebElement button = driver.fineElement(By.xpath(title1));
	    jsexec.executeScript(script);
	    
	    
	    
		
		
	   
		

	}

	private String executeScript(String script) {
		// TODO Auto-generated method stub
		return null;
	}


}
