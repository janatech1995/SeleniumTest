package Testclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.utility.readExceldateFile;

import Testclass.BaseClass;


public class runner extends BaseClass{
	
	static WebDriver driver;
	 
		@SuppressWarnings("deprecation")
		public static void main (String[] args) throws IOException, InterruptedException, InvalidFormatException
		{
//			browserLaunch("chrome");
//       		url(driver,"https://www.facebook.com/login/");
			ChromeOptions options= new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://adactinhotelapp.com/");
			String username=readExceldateFile.getParticularCell(0,1);
			WebElement element = driver.findElement(By.id("username"));
			String password = readExceldateFile.getParticularCell(1, 1);
			WebElement pass = driver.findElement(By.id("password"));
			element.sendKeys(username);
			pass.sendKeys(password);
			driver.findElement(By.id("login")).click();			
			
		}
		 

}
