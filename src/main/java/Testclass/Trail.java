package Testclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Trail {
	public static void main(String[]args) throws AWTException {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email"));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_J);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		  
		
		
		
		
		
		
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		Object element = driver.findElement(By.id("day"));
//		Select s=new Select((WebElement) element);
//		List<WebElement> option = s.getOptions();
//		int count = option.size();
//		for(WebElement option1 : option) {
//			String text = option1.getText();
//			System.out.println(text);
//		}
		
		
		
		
//		driver.findElement(By.name("q")).sendKeys("Java");
//		List<WebElement> alloptions = driver.findElements(By.xpath("//span[text()='java']"));
//		int count = alloptions.size();
//		System.out.println(count);
//		for(WebElement alloption :alloptions) {
//			String text = alloption.getText();
//			System.out.println(text);
		}
	  
		
	}


