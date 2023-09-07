package com.bhimapp.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhimapp.genericutility.ExcelUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class HomePage {
	AndroidDriver driver;
	@FindBy(xpath="//android.widget.TextView[@text='Profile']")
	private WebElement pofileoption; 
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Default bank is Axis Bank Ltd. ending with 5,0, Double tap to change\"]")
	private WebElement accountname;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='More Options, Double tap to Explore']")
	private WebElement moreoption;
	@FindBy(xpath="//android.widget.TextView[@text='Logout']")
	private WebElement logoutoption;
	@FindBy(xpath="//android.widget.TextView[@text='Manage']")
	private WebElement managebutton;
	@FindBy(xpath="//android.widget.TextView[@text='Change Language']")
	private WebElement changelaguage;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Send Money, Double tap to send money\"]")
	private WebElement sendbutton;
	@FindBy(xpath="//android.widget.TextView[@text='Send Feedback']")
	private WebElement sendfeedbackoption;
	@FindBy(xpath="//android.view.View[@text='My Profile']")
	private WebElement pagetitle;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Scan a QR code, Double tap to scan a QR code\"]")
	private WebElement scanneroption;
	
	@FindBy(xpath="//android.widget.TextView[@text='Axis Bank Ltd.']")
	private WebElement fetchbankname;
	
	
	
	
	
	
	
	
	
	public HomePage (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickonprofileApp()
	{
		pofileoption.click();
	}
	public void clickonaccountnoApp()
	{
		accountname.click();
	}
	public void clickmoreoptionApp()
	{
		moreoption.click();
	}
	public void logoutApp()
	{
		moreoption.click();
		logoutoption.click();
		
	}
	public void manageApp()
	{
		managebutton.click();
	}
	public void changelangApp()
	{
		 changelaguage.click();
	}
	public void sendmoneyApp()
	{
		sendbutton.click();
	}
	public void sendfeedbackApp()
	{
		sendfeedbackoption.click();
	}
//	public void choosefromfav(ExcelUtility eutil)throws Throwable
//	{
//		driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+eutil.fetchDatafromExcel("Sheet1",1,0) +"')]")).click();
//	}
	public String verifypagetitleAppp()
	{
	String title=	pagetitle.getText();
	return title;
	}
	public void clickOnScanner()
	{
		scanneroption.click();
	}
	public String fettitleApp()
	{
		String title=fetchbankname.getText();
		return title;
	}
	
}
