package com.mytests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;


public class excelexplore {
	public static WindowsDriver session= null;
	public  String WindowsApplicationDriverUrl = "http://127.0.0.1:4723";
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		
		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("app", "Excel");
		appCapabilities.setCapability("appArguments", "C:\\Users\\LENOVO\\eclipse-workspace\\WinAppDriverSample\\testdata\\VBALogin.xlsm");
	//	appCapabilities.setCapability("app", "C:\\Users\\LENOVO\\eclipse-workspace\\WinAppDriverSample\\testdata\\VBALogin.xlsm");
		appCapabilities.setCapability("platformName", "Windows");
		appCapabilities.setCapability("deviceName", "WindowsPC");
		
		//appCapabilities.setCapability(capabilityName, value);
		try {
			session = new WindowsDriver(new URL(WindowsApplicationDriverUrl), appCapabilities);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertNotNull(session);
		var currentWindowHandle = session.getWindowHandle();
		Thread.sleep(5000);
		var allWindowHandles = session.getWindowHandle();
		session.switchTo().window(allWindowHandles);
		
		

		//session.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}
	
	
	@AfterMethod
	public void cleanup()
	{
		session.quit();
		
	}
	
	
	
	@Test
	public void checkHelp() throws Exception {
		
//		Thread.sleep(3000);
//	    session.findElementByName("Blank workbook").click();
	    Thread.sleep(4000);	
		WindowsElement content = (WindowsElement)session.findElementByName("Message Bars").findElement(By.name("Security Warning")).findElement(By.name("Enable Content"));
	    Thread.sleep(4000); 
		
//		Thread.sleep(3000);	
//		session.findElementByName("Insert").click();
//	    Thread.sleep(3000);
		
//		WebElement element =session.findElementByName("Formulas");
				content.click();
		//session.find
		

	}
	
	

	

}