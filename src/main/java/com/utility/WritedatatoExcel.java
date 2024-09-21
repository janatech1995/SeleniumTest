package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WritedatatoExcel {
	
	public static void main(String []args) throws IOException {
		
		File file = new File("D:\\Jana\\IPT\\Mini Project\\Names.xlsx");
		FileInputStream fileinput= new FileInputStream(file);
		Workbook book= new XSSFWorkbook(fileinput);
		
		book.createSheet("jana").createRow(0).createCell(0).setCellValue("JANARTHANAN");
		book.getSheet("jana").getRow(0).getCell(0).setCellValue("Coimbatore");
		
		FileOutputStream fileoutput = new FileOutputStream(file);
		book.write(fileoutput);
		book.close();	
		System.out.println("---Success-----");
		
	}

}
