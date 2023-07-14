package com.bhimapp.genericutility;

import java.time.Duration;

import java.util.Set;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
/**
 * This class have all the androiddriver methods
 * @author Priyanka Ghosh
 *
 */

public class  Driverutility  {
	
	AndroidDriver driver;
	
	public  Driverutility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	/**
	 * This method is used to install the application
	 */
	public void installapp()
	{
		
	
	driver.installApp("C:\\Users\\Priyanka Ghosh\\Downloads\\General-Store (1).apk");
	}
	/**
	 * this method is used to check whether the app installed 
	 * @return
	 */
	public boolean isappinstallcheck ()
	{
		boolean result=driver.isAppInstalled("");
		return result;
	}
	public void runappbackground()
	{
		driver.runAppInBackground(Duration.ofSeconds(30));
	}
	public void orientationlanscape(AndroidDriver driver)
	{
		ScreenOrientation s=driver.getOrientation();
		driver.rotate(s.LANDSCAPE);
	}
	public void orientationportrait()
	{
		ScreenOrientation s=driver.getOrientation();
		driver.rotate(s.PORTRAIT);
	}
	
	public void getviews()
	{
		Set<String>allpages=driver.getContextHandles();
		for(String page:allpages)
		{
			System.out.println(page);
		}
	}
	
	public void switchcontext()
	{
		driver.context("WEBVIEW_com.androidsample.generalstore");
	}
		
		

}
