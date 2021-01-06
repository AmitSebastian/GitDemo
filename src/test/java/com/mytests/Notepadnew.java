package com.mytests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class Notepadnew {
	public static WindowsDriver session;
	public  String WindowsApplicationDriverUrl = "http://127.0.0.1:4723";
	
	@BeforeClass
	public void setUp()
	{
		
		DesiredCapabilities appCapabilities = new DesiredCapabilities();
		appCapabilities.setCapability("app", "C:\\Windows\\System32\\notepad.exe");
		appCapabilities.setCapability("platformName", "Windows");
		appCapabilities.setCapability("deviceName", "WindowsPC");
		
		//appCapabilities.setCapability(capabilityName, value);
		try {
			session = new WindowsDriver(new URL(WindowsApplicationDriverUrl), appCapabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	@AfterMethod
	public void cleanup()
	{
		session.quit();
		
	}
	
	
	
	@Test
	public void checkHelp() throws Exception {
		
		session.findElementByName("Help").click();
		

	}
	
	

	

}