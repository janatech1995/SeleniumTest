package Testclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.AdactinProjectPom.BookaHotelPage;
import com.AdactinProjectPom.LogoutPage;
import com.AdactinProjectPom.SearchHotelPage;
import com.AdactinProjectPom.SelectedHotelPage;
import com.POM_Manager.pageObjectmanager;

import ConfigProperities.configReader;
import Testclass.BaseClass;



public class RunnerClass extends BaseClass
{
	public static void main (String[] args) throws IOException, InterruptedException, InvalidFormatException
	{
	 
	 pageObjectmanager pom=new pageObjectmanager();
	 browserLaunch(pom.getPropertiesFile().getbrowsername());
	 urlLaunch(pom.getPropertiesFile().getUrl());
	 
	 
	 
	 pom.getAdactinLoginPagemanager().getParticularCells();
//	 pom.getSearchHotelPage().getSearchHotelPage();
//	 pom.getSelectHotelPage().getSelectedHotelPage();
//	 pom.getBookaHotelPage().getBookaHotelPage();
//	 pom.getLogoutPage().getLogoutPage();
	 
	}}






















//	
//	AdactinLoginPagePOM Ip=new AdactinLoginPagePOM(driver);
//	inputvalue(driver, Ip.getUsernme(),cf.getUserName());
//	inputvalue(driver, Ip.getPassword(),cf.getPassword());
//	clickElement(driver, Ip.getsubmit());
//	
//	
//	SearchHotelPage sh= new SearchHotelPage (driver);
//
//	dropdown(driver, sh.getlocation(), "value",cf.getlocation());
//    dropdown(driver, sh.gethotel(),"value", cf.gethotels()); 
//    dropdown(driver, sh.getroomtype(), "value", cf.getroomtype()); 
//    dropdown(driver, sh.getroom(), "value", cf.getroom());
//    Searchinput(driver, sh.getdatepickin(), "value", cf.getdatepickin());
//    Searchinput(driver, sh.getdatepickout(), "value", cf.getdatepickout());
//    dropdown(driver, sh.getadultroom(), "value", cf.getadultroom());
//    dropdown(driver, sh.getchildroom(), "value", cf.getchildroom());
//    clickElement(driver,sh.getsubmitbutton());
//    
//    
//    SelectedHotelPage shp=new SelectedHotelPage(driver);
//    clickElement(driver,shp.getradiobutton());
//    clickElement(driver,shp.getcontinuebutton());
//    
//    BookaHotelPage bhp=new BookaHotelPage(driver);
//    inputvalue(driver, bhp.getfirstname(),cf.getfirstname());
//    inputvalue(driver, bhp.getlastname(),cf.getlastname());
//    inputvalue(driver, bhp.getaddress(),cf.getaddress());
//    inputvalue(driver, bhp.getcardnum(),cf.getcardnum());
//    dropdown(driver, bhp.getcardtype(), "value", cf.getcardtype());
//    dropdown(driver, bhp.getexpirydate(), "value", cf.getexpirydate());
//    dropdown(driver, bhp.getexpiryyear(), "value", cf.getexpiryyear());
//    inputvalue(driver, bhp.getcvvnumber(),cf.getcvvnumber());
//    clickElement(driver,bhp.getbooknow());
//    
//    Thread.sleep(5000);
//    
//    LogoutPage li=new  LogoutPage(driver);
//    clickElement(driver,li.getlogoutmethod());
    
    




	
	
	

   