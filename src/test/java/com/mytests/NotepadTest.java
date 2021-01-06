package com.mytests;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;


public class NotepadTest {
	
	
	public static WindowsDriver<WindowsElement> driver;
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
try {
		
	//	File file = new File("C:\\Users\\LENOVO\\eclipse-workspace\\WinAppDriverSample\\testdata\\VBALogin.xlsm");
				
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("app", "Excel");
		cap.setCapability("appArguments", "C:\\Users\\LENOVO\\eclipse-workspace\\WinAppDriverSample\\testdata\\VBALogin.xlsm");
        
        
		//AppiumOptions appOptions = new AppiumOptions
		cap.setCapability("platformName", "Windows");
		cap.setCapability("deviceName", "WindowsPC");
		
		
		//Thread.sleep(20000);
			driver = new WindowsDriver<WindowsElement> (new URL("http://127.0.0.1:4723"), cap);
			Thread.sleep(20000);
			driver.findElementByName("Home");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//	 driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	
	
	
	
	@Test
	public void checkHelp() throws Exception {
		Thread.sleep(4000);
		
//		WindowsElement enableBtn = (WindowsElement) driver.findElementByName("Message Bars").findElement(By.name("Protected View")).findElement(By.name("Enable Editing"));
//		enableBtn .click();
//		
		WindowsElement content = 
				//(WindowsElement)driver.findElementByName("Message Bars").findElement(By.name("Security Warning")).findElement(By.name("Enable Content"));
//		driver.FindElementByName("Message Bars").FindElementByName("Security Warning")
				driver.findElementByName("Enable Content");
				content.click();
		


	}
	@AfterMethod
	public void cleanup()
	{
		driver.quit();
		
	}
	
	

}
