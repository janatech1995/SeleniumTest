package com.AdactinProjectPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ConfigProperities.configReader;
import InterfaceValues.SearchHotelInterface;
import InterfaceValues.SelectHotelinterface;
import Testclass.BaseClass;

public class SelectedHotelPage extends BaseClass implements SelectHotelinterface
{	 
	    private WebDriver searchdriver;

	    public SelectedHotelPage(WebDriver driver) {
	    	 searchdriver = driver;
	    	 PageFactory.initElements(driver, this);
	    }
	    
   @FindBy(xpath=radio_xpath)
    private WebElement radiobutton;
   
   @FindBy(id=continue_id)
   private WebElement continuebtn;

   public WebElement getradiobutton()
   { 
	return radiobutton;
   }
	 public WebElement getcontinuebutton()
	   { 
		return continuebtn;
}
	 
	 public void getSelectedHotelPage() {
		 
		 configReader cf = new configReader();
		 
		clickElement(driver, radiobutton);
		clickElement(driver, continuebtn);
	 }
	 }




    
	


