package com.mytests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import io.appium.java_client.windows.WindowsDriver;


public class Excelcheck {
	public static WindowsDriver session= null;
	public  String WindowsApplicationDriverUrl = "http://127.0.0.1:4723";
	
	@BeforeClass
	public void setUp()
	{
		
		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("app", "Excel");
		appCapabilities.setCapability("platformName", "Windows");
		appCapabilities.setCapability("deviceName", "WindowsPC");
		
		//appCapabilities.setCapability(capabilityName, value);
		try {
			session = new WindowsDriver(new URL(WindowsApplicationDriverUrl), appCapabilities);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		session.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}
	
	
	@AfterMethod
	public void cleanup()
	{
	//	session.quit();
		
	}
	
	
	
	@Test
	public void checkHelp() throws Exception {
		
		Thread.sleep(3000);
	    session.findElementByName("Blank workbook").click();
	    Thread.sleep(3000);	
	    session.findElementByName("Insert").click();
	    Thread.sleep(3000); 
		
//		WebElement element =session.findElementByName("Formulas");
//				element.click();
		//session.find
		

	}
	
	

	

}