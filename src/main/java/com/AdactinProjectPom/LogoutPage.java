package com.AdactinProjectPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ConfigProperities.configReader;
import InterfaceValues.LogoutInterface;
import Testclass.BaseClass;

public class LogoutPage extends BaseClass implements LogoutInterface{
	
private static WebDriver searchdriver;
	 

	public LogoutPage(WebDriver driver) {
		 searchdriver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath =  logout_xpath)
	private WebElement logout;            //a[text()='Logout']

     public void getLogoutPage() throws IOException {
		
		configReader cf = new configReader();
		
		clickElement(driver, logout);
}
     
     
     
     
     
     
     
     
     
     
     
     
     
		
//	public WebElement getlogoutmethod() {
//		return logout;
//	}

}
