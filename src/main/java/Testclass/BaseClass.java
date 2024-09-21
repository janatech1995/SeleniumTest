package Testclass;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class BaseClass
	        {
		protected static WebDriver driver;
		
		
		/// BrowserLaunch///
		
		protected static void browserLaunch(String browserName) {
			try {
				if(browserName.equalsIgnoreCase("chrome")) {
					driver = new ChromeDriver();}
				else if(browserName.equalsIgnoreCase("edge"))
					driver = new EdgeDriver();
				driver.manage().window().maximize();
			} catch (Exception e) {
				System.out.println("invalid browswerName"); 
				e.printStackTrace();
				}
		}
		
		

		protected static void url(WebDriver driver,String urlName) 
		{ 
			try {
				driver.get(urlName);
		} catch (Exception e) {
			System.out.println("invalid Url"); 
			e.printStackTrace();
		}}
		
		///UrlLaunch///
		
			protected static void urlLaunch(String urlName) 
			{ 
				try {
					driver.get(urlName);
			} catch (Exception e) {
				System.out.println("invalid Url"); 
				e.printStackTrace();
			}}
			
			
			//inputvalueWebDriver//
			
			protected static void inputvalue(WebDriver driver,WebElement element,String value,String value1) {
				element.sendKeys(value);
			}
			
			
			/// Drivermethods///
			protected static void driverMethods(String methods)
			{ 
				try{
					if (methods.equalsIgnoreCase("title"))
					{
						String title=driver.getTitle();
						System.out.println(title);
				}
					if (methods.equalsIgnoreCase("url")) 
					{ 
					String url= driver.getCurrentUrl(); 
					System.out.println(url);
					}
					}
					catch(Exception e) {
					System.out.println("Required title not obtained");
					}}
			
			
			/// Buttons///
			
			protected static void Buttons (String xpath) 
			{ 
			try {
			WebElement buttonName=driver.findElement(By.xpath("xp"));
			boolean displayButton=buttonName.isDisplayed();
		}
			catch(Exception e) {
				System.out.println("Required button is displayed");
			}
			}
			
			protected static void isEnabled(String xpath) {
				
			try {
			WebElement buttonName=driver.findElement(By.xpath("xp"));
			boolean displayButton=buttonName.isEnabled();
		}
			catch(Exception e) {
				System.out.println("Required button is enabled");
			}
			}
			
			////isDisplayed ///
			
			protected static boolean elementIsDisplayed(WebElement element) {
				boolean displayed = false;
				try {
					displayed = element.isDisplayed();
					return displayed;
				} catch (Exception e) {

					e.printStackTrace();
				}

				return displayed;
			}
		
			
			/// getTitle///
			
			protected static void getTitle(WebDriver driver) {
				String title=driver.getTitle();
				System.out.println(title);
				WebElement element=driver.findElement(By.xpath(""));
				String text=element.getText();
				System.out.println(text);
			}
			
			
			
			///NavigateMethods///
	      
	      protected static void navigateMethods(String navigateUrl, String navigateMethod,String getMessage) {
	    	  try {
	    		  if(navigateMethod.equals("To")) {
	    			  driver.navigate().to(navigateUrl);
	    		  }
	    	  else if(navigateMethod.equals("forward")){
	    			  driver.navigate().forward();
	    		  } else if(navigateMethod.equalsIgnoreCase("Back")) {
	    			  driver.navigate().back();
	    		  } else if (navigateMethod.equalsIgnoreCase("Refresh")) {
	    			  driver.navigate().refresh();
	    		  } }catch(Exception e) {
	    			  System.out.println("Error in" +e.getMessage());
	    		  }}
	      
	      
	      /// Wait Methods ///

	      protected static void implicitWait(WebDriver driver,int time) {
	    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	      }
	      
	      protected static void ExplicitWait(WebDriver driver,Duration time,String element,String buttonlocator) {
	   	     WebDriverWait wait =new WebDriverWait(driver, time);
	   	  try {
				WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id(buttonlocator)));
	          button.click();
	      } catch (Exception e) {
	          System.out.println("Button was not clickable: " + e.getMessage());
	      }} 
	      
	      
           //Search input///
	      
	   protected static void Searchinput(WebDriver driver, WebElement getdatepickin, String string, String getdatepickin2) {
	  		// TODO Auto-generated method stub
	  		
	  	}
	      
	      
	      /// Dropdown Method////
	      
	  	protected static void dropdown(WebDriver driver,WebElement element, String selectiontype, String value) {

			Select s = new Select(element);

			if (selectiontype.equalsIgnoreCase("value")) {

				s.selectByValue(value);
			} else if (selectiontype.equalsIgnoreCase("visibletext")) {

				s.selectByVisibleText(value);

			}

			else if (selectiontype.equalsIgnoreCase("index")) {

				int a = Integer.parseInt(value);
				s.selectByIndex(a);
			}
		}
	  	
	  	/// Action Method///
			
	  	protected static void action(WebElement element, String type, String value) {

			Actions ac = new Actions(driver);

			if (type.equalsIgnoreCase("contextclick")) {

				ac.contextClick(element).build().perform();

			} else if (type.equalsIgnoreCase("doubleclick")) {

				ac.doubleClick(element).build().perform();

			} else if (type.equalsIgnoreCase("draganddrop")) {

				ac.dragAndDrop(element, element).build().perform();

			} else if (type.equalsIgnoreCase("draganddropxy")) {
				int int1 = Integer.parseInt(value);
				ac.dragAndDropBy(element, int1, int1).build().perform();

			} else if (type.equalsIgnoreCase("clickandhold")) {

				ac.clickAndHold(element).build().perform();
			}

		}
	
			
			
	  	
			
		/// Robot Class ///
	  	
	  	
	  	protected static void keboard(String type) {
			Robot r = (Robot) driver;

			if (type.equalsIgnoreCase("pressenterkey")) {

				r.keyPress(KeyEvent.VK_ENTER);
			} else if (type.equalsIgnoreCase("pressupkey")) {
				r.keyPress(KeyEvent.VK_UP);

			} else if (type.equalsIgnoreCase("pressdownkey")) {
				r.keyPress(KeyEvent.VK_DOWN);

			} else if (type.equalsIgnoreCase("releseenterkey")) {
				r.keyRelease(KeyEvent.VK_ENTER);
			} else if (type.equalsIgnoreCase("releaseupkey")) {
				r.keyRelease(KeyEvent.VK_UP);

			} else if (type.equalsIgnoreCase("releasedownkey")) {
				r.keyRelease(KeyEvent.VK_DOWN);
			}
		}
	  	
	  	
	  	/// sendkeys ///
	  	
		protected static void sendkeys(WebElement element, String value) {

			element.sendKeys(value);

		}
	  	
		/// Click method///
		
		protected static void clickElement(WebDriver driver,WebElement element) {
			element.click();
		}
		 
		/// Close method ///
		
		protected static void clock(WebDriver driver) {
                 driver.close();
		}
		
		/// quite Method///
		
		protected static void quiteMethod(WebDriver driver) {
            driver.quit();
	}
		
	  	
	  	
	  /// Screenshot ///
	  	
//		public void takeScreenshot(WebDriver driver,String filename,String format) throws IOException {
//
//			TakesScreenshot src = (TakesScreenshot) driver;
//
//			File screenshot = src.getScreenshotAs(OutputType.FILE);
//
//			File loc = new File("Path of the file");
//
//			FileHandler.copy(src, loc);
//           
//		}
		
//		public void takeScreenShot(String fileName) throws IOException {
//			try {
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				File src = ts.getScreenshotAs(OutputType.FILE);
//				File des = new File(System.getProperty("user.dir") + "\\ScreenShot\\" + fileName + ".png");
//				FileHandler.copy(src, des);
//			} catch (WebDriverException e) {
//
//				e.printStackTrace();
//			}
//		}
	    
		
		/// JavaScript Executor ///
	     
	    	  protected static void executeScript(WebDriver driver, String actionType, By elementLocator, String... value) {
	    	        try {
	    	            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    	            WebElement element = null;
	    	            if (elementLocator.equals(jsExecutor))
	    	            		{
	    	                element = driver.findElement(elementLocator);
	    	            }
	    	            else if(elementLocator.equals(jsExecutor)) {
	    	            	  element = driver.findElement(elementLocator);
	    	            }
	    	            	
	    	            } catch (Exception e) {
	    	                System.out.println("Error executing JavaScript for action '" + actionType + "': " + e.getMessage());
	    	            }
	      }
	        }
		
			


