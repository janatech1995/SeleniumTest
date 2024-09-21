package com.AdactinProjectPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ConfigProperities.configReader;
import InterfaceValues.SearchHotelInterface;
import Testclass.BaseClass;

public class SearchHotelPage extends BaseClass implements SearchHotelInterface {
	
    private WebDriver driver;

public SearchHotelPage(WebDriver driver) {
	 this.driver= driver;
	 PageFactory.initElements(driver, this);
}
	@FindBy(id=location_id)
	private WebElement locations;
	
	@FindBy(id=hotels_id)
	private WebElement hotel;
	
	@FindBy(id=room_type_id)
	private WebElement roomtype;
	
    @FindBy (name=room_nos_name)
    private WebElement numberofroom;
	
	@FindBy(id=datepick_in_id)
	private WebElement datepickin;
	
	@FindBy(id=datepick_out_id)
	private WebElement datepickout;
	
	@FindBy(id=adult_room_id)
	private WebElement adultroom;
	
	@FindBy(id=child_room_id)
	private WebElement childroom;
	
	@FindBy(id=submit_id)
	private WebElement submitbutton;
	
	 public void getSearchHotelPage() throws IOException {
		 
    	 configReader cf=new configReader();
    	 
		 inputvalue(driver, locations,cf.getlocation(), cf.getlocation());
		 inputvalue(driver, hotel,cf.gethotels(),cf.gethotels());
		 inputvalue(driver,roomtype,cf.getroomtype(),cf.getroomtype());
		 inputvalue(driver,numberofroom,cf.getroom(),cf.getroom());
		 inputvalue(driver, datepickin, cf.getdatepickin(),cf.getdatepickin());
		 inputvalue(driver, datepickout, cf.getdatepickout(),cf.getdatepickout());
		 inputvalue(driver,adultroom, cf.getadultroom(),cf.getadultroom());
		 inputvalue(driver,childroom,cf.getchildroom(),cf.getchildroom());
		 clickElement(driver,submitbutton);
	

		 
		 
		 
		 
		 
		 
		 
	
//	public WebElement getlocation() {
//		return locations;
//	}
//
//	public WebElement gethotel() {
//		return hotel;
//	}	

//	public WebElement getroomtype() {
//		return roomtype;
//	}
//	public WebElement getroom() {
//		return numberofroom;
//	}
//	public WebElement getdatepickin() {
//		return datepickin;
//	}
//	public WebElement getdatepickout() {
//		return datepickout;
//	}
//	public WebElement getadultroom() {
//		return adultroom;
//	}
//	public WebElement getchildroom() {
//		return childroom;
//	}
//	public WebElement getsubmitbutton() {
//		return submitbutton;
//	}}
	
		 
	 }}
	 



