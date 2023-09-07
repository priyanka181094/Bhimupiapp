package com.bhimapp.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhimapp.genericutility.ExcelUtility;

import io.appium.java_client.android.AndroidDriver;

public class SendMoneyPage {
	AndroidDriver driver;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Amount, Double tap to enter\"]/android.view.ViewGroup/android.widget.EditText")
	private WebElement amounttextfield;
	
	@FindBy(xpath="//android.widget.Button[@content-desc='Send']")
	private WebElement  sendbutton;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Go back\"]/android.widget.ImageView")
	private WebElement backbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Maximum per transaction limit is ₹100000']")
	 private  WebElement transaction;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Contacts, tab\"]/android.widget.TextView")
	 private  WebElement clickoncontactoption;
	
	@FindBy(xpath="//android.widget.EditText[@text='Search or Enter UPI ID/Number']")
	private WebElement textfielndname;
	
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Amount, Double tap to enter\"]/android.view.ViewGroup/android.widget.EditText")
	private WebElement enteramount;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Remarks (Optional), Double tab to enter the Remarks\"]/android.view.ViewGroup/android.widget.EditText")
	private WebElement enteremarks;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Send\"]")
	private WebElement sendoption;

	@FindBy(xpath="//android.widget.TextView[@text='Could not send money!']")
	private WebElement failedmessage;
	
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Home\"]")
	private WebElement homeoption;
	
	@FindBy(xpath="//android.widget.ImageView[@index='0']")
	private WebElement checkbox;
	

	@FindBy(xpath="//android.widget.Button[@content-desc=\"Later\"]")
	private WebElement laterbutton;
	
	
	
	public SendMoneyPage (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enteramountApp(String amount)
	{
		amounttextfield.sendKeys(amount);
	}
	public void clicksendbutton()
	{
		sendbutton.click();
	}
	public void clickonbackbuttonApp()
	{
		backbutton.click();
	}
	public void clickoncontactoptionApp()
	{
		clickoncontactoption.click();
	}
	public void entecontactextfield(String name)
	{
		textfielndname.sendKeys(name);
	}
//	public void filltextfieldApp(ExcelUtility eutil)throws Throwable
//	{
//		enteramount.sendKeys(eutil.fetchDatafromExcel("Testdata", 5, 8));
//		enteremarks.sendKeys(eutil.fetchDatafromExcel("Testdata", 5, 9));
//		
//	}
	public void sendbuttonApp()
	{
		sendoption.click();
	}
	public void HomeApp()
	{
		 homeoption.click();
	}
	public String getmessageApp()
	{
		String message=failedmessage.getText();
		return message;
	}
	public void clickcheckboxApp()
	{
		
		 laterbutton.click();
	}

	public String fetchtransactionmessage()
	{
		String message=transaction.getText();
		return message;
	}
//	public void selectnamefromdropdown(ExcelUtility eutil)throws Throwable
//	{
//		driver.findElement(By.xpath("//android.widget.TextView[@text='"+eutil.fetchDatafromExcel("Testdata", 5, 5)+"']")).click();
//	}

}
