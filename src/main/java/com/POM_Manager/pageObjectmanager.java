package com.POM_Manager;

import com.AdactinProjectPom.AdactinLoginPagePOM;
import com.AdactinProjectPom.BookaHotelPage;
import com.AdactinProjectPom.LogoutPage;
import com.AdactinProjectPom.SearchHotelPage;
import com.AdactinProjectPom.SelectedHotelPage;

import ConfigProperities.configReader;
import Testclass.BaseClass;

public class pageObjectmanager extends BaseClass
{
	private AdactinLoginPagePOM login;
	private SearchHotelPage search;
	private BookaHotelPage book;
	private SelectedHotelPage select;
	private LogoutPage logout;
	private configReader config;
	
	
	public AdactinLoginPagePOM getAdactinLoginPagemanager() 
	{
	if (login == null) 
	{
	login = new AdactinLoginPagePOM(driver);
	}
	return login;
	
	}
	
	public SearchHotelPage getSearchHotelPage() 
	{
	if (search == null) 
	{
	search = new SearchHotelPage(driver);
	}
	return search;
	}
	
	public BookaHotelPage getBookaHotelPage() 
	{
	if (book == null) 
	{
	book= new BookaHotelPage(driver);
	}
	return book;
	}
	
	public SelectedHotelPage getSelectHotelPage() 
	{
	if (select == null) 
	{
	select = new SelectedHotelPage(driver);
	}
	return select;
	}
	
	public LogoutPage getLogoutPage() 
	{
	if (logout == null) 
	{
	logout = new LogoutPage(driver);
	}
	return logout;
	}
	public configReader getPropertiesFile() {
		if (config ==null) {
			config = new configReader();
		}
		return config;
			
	}
	}


