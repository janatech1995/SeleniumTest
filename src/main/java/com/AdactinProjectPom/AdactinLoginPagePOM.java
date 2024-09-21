package com.AdactinProjectPom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ConfigProperities.configReader;
import InterfaceValues.PomPageElements;
import Testclass.BaseClass;

public class AdactinLoginPagePOM extends BaseClass implements PomPageElements{

	static WebDriver driver;
	

	public  AdactinLoginPagePOM(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	@FindBy(name=username_name)
	private WebElement username;
	
	@FindBy(name=password_name)
	private WebElement password;
	
	@FindBy(id=login_id)
	private WebElement loginbtn;
	
	public static String getParticularCells() throws InvalidFormatException, IOException {
	File file1=new File("D:\\Jana\\IPT\\Mini Project\\Names.xlsx");
	FileInputStream file=new FileInputStream(file1);
	Workbook book=new XSSFWorkbook(file);
	Sheet sheet = book.getSheetAt(1);
	 Row row= sheet.getRow(0);
	 Cell cell=row.getCell(0);		 
	 String data =cell.getStringCellValue();
	return data;
	
}}
//	public void getAdtinLoginPage() throws IOException {
		
//		configReader cf = new configReader();
//		inputvalue(driver,username,cf.getUserName(),cf.getUserName());
//		inputvalue(driver,password, cf.getPassword(),cf.getPassword());
//		clickElement(driver, loginbtn);
	
	
	
	
	
	
//	public WebElement getUsernme() {
//		return username;	
//	}
//
//	public WebElement getPassword() {
//		return password;
//	}	
//
//	public WebElement getsubmit() {
//		return loginbtn;
//	}

