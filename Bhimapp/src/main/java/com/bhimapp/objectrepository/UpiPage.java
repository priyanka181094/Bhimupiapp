package com.bhimapp.objectrepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class UpiPage {
	AndroidDriver  driver;
	@FindBy(xpath="//android.widget.TableLayout[@resource-id='in.org.npci.upiapp:id/fragmentTelKeyboard']//android.widget.TableRow[1]/android.widget.TextView[1]")
	private WebElement onedigit;
	
	@FindBy(xpath="//android.widget.TableLayout[@resource-id='in.org.npci.upiapp:id/fragmentTelKeyboard']//android.widget.TableRow[3]/android.widget.TextView[2]")
	private WebElement eightdigit;
	
	
	@FindBy(xpath="//android.widget.TableLayout[@resource-id='in.org.npci.upiapp:id/fragmentTelKeyboard']//android.widget.TableRow[4]/android.widget.TextView[@index='1']")
	private WebElement zerodigit;
	
	@FindBy(xpath="//android.widget.TableLayout[@resource-id='in.org.npci.upiapp:id/fragmentTelKeyboard']//android.widget.TableRow[3]/android.widget.TextView[1]")
	private WebElement sevendigit;
	
	@FindBy(xpath="//android.widget.TableLayout[@resource-id='in.org.npci.upiapp:id/fragmentTelKeyboard']//android.widget.TableRow[3]/android.widget.TextView[3]")
	private WebElement ninedigit;
	
	@FindBy(xpath="//android.widget.TableLayout[@resource-id='in.org.npci.upiapp:id/fragmentTelKeyboard']//android.widget.TableRow[4]/android.widget.ImageView[@index='2']")
	private WebElement rightclick;
	 
	public UpiPage (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Press by element
   public void enteupipin()
	{
		onedigit.click();
		 eightdigit.click();
		 zerodigit.click();
		 sevendigit.click();
		 sevendigit.click();
		 ninedigit.click();
		 rightclick.click();
		 
		 
		 
		
	}

	

}
