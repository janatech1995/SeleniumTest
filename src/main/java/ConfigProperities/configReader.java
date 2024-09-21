package ConfigProperities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class configReader {

        private Properties getCongigFileValue() throws IOException
        
        {
        File f= new File("C:\\Users\\Sridhar\\Delta-workspace\\Automation\\src\\main\\java\\com\\configproperties\\config.properties" );
        FileInputStream fs= new FileInputStream(f);
        Properties p= new Properties(); 
        p.load(fs);
        return p;
        }
        public String getbrowsername() throws IOException
        {
        		String browsername= getCongigFileValue().getProperty("browser"); 
        		return browsername;
}   
        public String getUrl() throws IOException 
        {
        	String url = getCongigFileValue().getProperty("url"); 
        	return url;

        }
        
        public String getUserName() throws IOException 
        {
        	String username=getCongigFileValue().getProperty("username");
        	return username;
        }
        
        
        public String getPassword() throws IOException 
        {
        	String password=getCongigFileValue().getProperty("password");
        	return password;
        }  
        
        public String getlocation() throws IOException 
        {
        	String Location=getCongigFileValue().getProperty("location");
        	return Location;
        } 
        
        public String gethotels() throws IOException 
        {
        	String hotel=getCongigFileValue().getProperty("hotels");
        	return hotel;
        } 
        
        public String getroomtype() throws IOException 
        {
        	String roomtype=getCongigFileValue().getProperty("roomtype");
        	return roomtype;
        } 
        
        
        public String getroom() throws IOException 
        {
        	String numroom=getCongigFileValue().getProperty("numberofroom");
        	return numroom;
        } 
        
        public String getdatepickin() throws IOException 
        {
        	String datepickin =getCongigFileValue().getProperty("datepick_in");
        	return datepickin;
        } 
        
        public String getdatepickout() throws IOException 
        {
        	String datepickout =getCongigFileValue().getProperty("datepick_out");
        	return datepickout;
        } 
        
        public String getadultroom() throws IOException 
        {
        	String adultroom =getCongigFileValue().getProperty("adult_room");
        	return adultroom;
        } 
        
           public String getchildroom() throws IOException 
        {
        	String childroom =getCongigFileValue().getProperty("child_room");
        	return childroom;
        } 
        
           public String getfirstname() throws IOException 
           {
           	String firstname =getCongigFileValue().getProperty("firstname");
           	return firstname;
           } 
           
           public String getlastname() throws IOException 
           {
           	String lastname =getCongigFileValue().getProperty("lastname");
           	return lastname;
           } 
           
           public String getaddress() throws IOException 
           {
           	String address =getCongigFileValue().getProperty("address");
           	return address;
           } 
           public String getcardnum() throws IOException 
           {
           	String cardnumber =getCongigFileValue().getProperty("cardnum");
           	return cardnumber;
           } 
           public String getcardtype() throws IOException 
           {
           	String cardtype =getCongigFileValue().getProperty("cardtype");
           	return cardtype;
           } 
           public String getexpirydate() throws IOException 
           {
           	String expirydate =getCongigFileValue().getProperty("expirydate");
           	return expirydate;
           } 
           public String getexpiryyear() throws IOException 
           {
           	String expiryyear =getCongigFileValue().getProperty("expiryyear");
           	return expiryyear;
           } 
           public String getcvvnumber() throws IOException 
           {
           	String cvvnumber =getCongigFileValue().getProperty("cvvnumber");
           	return cvvnumber;
           }       
           
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
