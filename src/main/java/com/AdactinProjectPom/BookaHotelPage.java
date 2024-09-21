package com.AdactinProjectPom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ConfigProperities.configReader;
import InterfaceValues.BookaHotelInterface;
import Testclass.BaseClass;

public class BookaHotelPage extends BaseClass implements BookaHotelInterface
{
	private static WebDriver searchdriver;
	
	public BookaHotelPage(WebDriver driver) {
		 searchdriver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = first_name_id)
	private WebElement firstname;
	
	@FindBy (name= last_name_name)
	private WebElement lastname;
	
	@FindBy (id = address_id)
	private WebElement address;
	
	@FindBy(id= cc_num_id)
	private WebElement creditcard;
	
	@FindBy (id= cc_type_id)
	private WebElement creditcardtype;
	
	@FindBy (xpath= cc_exp_month_xpath)
    private WebElement expirydate;
	
	@FindBy (id= cc_exp_year_id)
	private WebElement expiryyear;
	
	@FindBy (id= cc_cvv_id)
	private WebElement cvvnumber;
	
	@FindBy(id= book_now_id)
	private WebElement booknowbtn;
	
	
	
	public void getBookaHotelPage() throws IOException {
		
		configReader cf = new configReader();
		
		inputvalue(driver,firstname,cf.getfirstname(),cf.getfirstname());
		inputvalue(driver,lastname, cf.getlastname(),cf.getlastname());
		inputvalue(driver,address, cf.getaddress(),cf.getaddress());
		inputvalue(driver,creditcard, cf.getcardnum(),cf.getcardnum());
		 inputvalue(driver, creditcardtype,cf.getcardtype(),cf.getcardtype());
		 inputvalue(driver, expirydate, cf.getexpirydate(),cf.getexpirydate());
		 inputvalue(driver, expiryyear,cf.getexpiryyear(),cf.getexpiryyear());
		inputvalue(driver,lastname, cf.getcvvnumber(),cf.getcvvnumber());
		clickElement(driver, booknowbtn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public WebElement getfirstname() {
//		return firstname;
//	}
//	public WebElement getlastname() {
//		return lastname;
//	}
//	public WebElement getaddress() {
//		return address;
//	}
//	public WebElement getcardnum() {
//		return creditcard;
//	}
//	public WebElement getcardtype() {
//		return creditcardtype;
//	}
//	public WebElement getexpirydate() {
//		return expirydate;
//	}
//	public WebElement getexpiryyear() {
//		return expiryyear;
//	}
//	public WebElement getcvvnumber() {
//		return cvvnumber;
//	}
//	public WebElement getbooknow() {
//		return booknowbtn;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
