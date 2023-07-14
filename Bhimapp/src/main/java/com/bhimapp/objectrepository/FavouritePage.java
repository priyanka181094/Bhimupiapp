package com.bhimapp.objectrepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhimapp.genericutility.BaseClass;
import com.bhimapp.genericutility.ExcelUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FavouritePage  {
	
	
	AndroidDriver driver;
	//ExcelUtility eutil = new ExcelUtility();
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Add New Favorite\"]")
	private WebElement addnewfavbutton;
	
	@FindBy(xpath="//android.widget.EditText[@text='Enter UPI ID']")
	private WebElement enterupiid;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Go back\"]/android.widget.ImageView")
	private WebElement backbutton;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Add New Favorite\"]")
	private WebElement addnewfav;
	
	@FindBy(xpath="//android.view.ViewGroup[contains(@content-desc,'double tap to select contact')]")
	private WebElement taptoselectcontact;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"ADD\"]/android.widget.TextView")
	private WebElement addbutton;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Delete\"]")
	private WebElement deletebutton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Selected beneficiary has been deleted']")
	private WebElement toastmessage;
	@FindBy(xpath="//android.view.View[@text='Favourites']")
	private WebElement pagetitle;
		
	
	

	
	public FavouritePage(AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickonfavApp()
	{
		addnewfavbutton.click();
	}
	public void EnterupiApp(String text) throws Throwable
	{
		enterupiid.sendKeys(text);
	}
	
	public void clickbackbuttonApp()
	{
		backbutton.click();
	}
	public void clickonfavoptionApp()
	{
		addnewfav.click();
	}
	public void taptocontact()
	{
		taptoselectcontact.click();
	}
	public void addbuttonApp()
	{
		 addbutton.click();
	}
	public void deleteApp()
	{
		deletebutton.click();
	}
	public String fetchtoastmessageApp()
	{
		String message=toastmessage.getText();
		return message;
	}
	public String fetchTitleApp()
	{
		 String title=pagetitle.getText();
		 return title;
	}



}
