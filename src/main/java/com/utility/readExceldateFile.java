package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExceldateFile 
{
	public static String getParticularCell(int rows,int column) throws InvalidFormatException, IOException {
		File file=new File("D:\\Jana\\IPT\\Mini Project\\Names.xlsx");
		Workbook book=new XSSFWorkbook(file);
		Sheet sheet = book.getSheetAt(1);
		 Row row= sheet.getRow(rows);
		 Cell cell=row.getCell(column);		 
		 String data =cell.getStringCellValue();
		System.out.println(data);
		
		//Dataformatter
		DataFormatter dataformat=new DataFormatter();
		String testdata = dataformat.formatCellValue(cell);
		System.out.println(testdata);
		return testdata;
	}
	
	
	public static void getParticularRowMultipleCell() throws InvalidFormatException, IOException 
	{
		File file=new File("D:\\Jana\\IPT\\Mini Project\\Names.xlsx");
		Workbook book=new XSSFWorkbook(file);
		Sheet sheet = book.getSheetAt(0);
		 int NoofRows = sheet.getLastRowNum();
		 System.out.println("No of Rows   "  +NoofRows);
		 
		 short NoofCells = sheet.getRow(NoofRows).getLastCellNum();
		 System.out.println("No of Cells   "  +NoofCells);
		 
		  Row row = sheet.getRow(1);
		 for(int i=0;i<NoofCells;i++) {
			Cell value = row.getCell(i);
			DataFormatter data1=new DataFormatter();
			    String newdata = data1.formatCellValue(value);
			    System.out.println(newdata);
		 }
	}
	
	public static void getallData() throws InvalidFormatException, IOException 
	{
		
		File file=new File("D:\\Jana\\IPT\\Mini Project\\Names.xlsx");
		Workbook book=new XSSFWorkbook(file);
		Sheet sheet = book.getSheetAt(0);
		 int NoofRows = sheet.getLastRowNum();
		 System.out.println("No of Rows   "  +NoofRows);
		 
		 short NoofCells = sheet.getRow(NoofRows).getLastCellNum();
		 System.out.println("No of Cells   "  +NoofCells);
		 
		 
		 for (int j=1;j<NoofCells;j++) {
			 Row row= sheet.getRow(j);
		 
		 for (int i=0;i<NoofRows;i++) {
			 
		    Cell cell=row.getCell(i);
			DataFormatter dataformat=new DataFormatter();
     		String testdata1 = dataformat.formatCellValue(cell);
         	System.out.println(testdata1);
		 }
		
	}
}
		public static void main(String[]args) throws InvalidFormatException, IOException {
			getParticularCell(1,2);
			getParticularRowMultipleCell();
			getallData();
			
		}
	
	}

//			DataFormatter dataformat=new DataFormatter();
//			String testdata = dataformat.formatCellValue(cell);
//			return testdata;
		

//	
//	private void getParticularCellMultipleRow() {
//		
//	}
//	
//	private void getAllData() {
//		
//	}

