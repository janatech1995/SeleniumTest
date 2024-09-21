package com.delta.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class login2 {
	public static void main(String[]args) throws IOException {
 	   ExtentReports extent=new ExtentReports();
 	   ExtentSparkReporter sparkreporter=new ExtentSparkReporter("report.html");
       extent.attachReporter(sparkreporter); 
      ExtentTest test1= extent.createTest("Test 1");
      test1.pass("This is pass");
      ExtentTest test2= extent.createTest("Test 2");
      test2.log(Status.FAIL, "This is failed");
      extent.createTest("Test 2").skip("This is skiped");
       
      
	
	   extent.flush();
	   Desktop.getDesktop().browse(new File("report.html").toURI());
	
	
	
	
	}
	
	
	
}