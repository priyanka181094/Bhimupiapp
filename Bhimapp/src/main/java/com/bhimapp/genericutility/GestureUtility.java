 package com.bhimapp.genericutility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
	
	AndroidDriver driver;//for use of the gesture methods inside this class
	//to access outside the class
	public GestureUtility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void scrollingGesture(String textfield)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +".scrollIntoView(text(\""+textfield+"\"));"));

		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+textfield+"\"));"));
	}
	
	
	public void longpressgesture(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",2000));

}
	
	
	public void swipegesture(int leftx,int topy,int widhx,int heighty,String directinput)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("mobile:swipeGesture",ImmutableMap.of("left",leftx,"top",topy,"width",widhx,"height",heighty,"direction", directinput,"percent",0.75));
		
		
	}
	
	public void draganddrop(WebElement element,int xaxis,int yaxis)
	{
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
		    "endX", xaxis,
		    "endY",yaxis
		));
	}
	public void clickaction(WebElement element)
	{
		 driver .executeScript("mobile: clickGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId()
		));
	}
	
}
