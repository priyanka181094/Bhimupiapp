package com.bhimapp.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhimapp.genericutility.ExcelUtility;

import io.appium.java_client.android.AndroidDriver;

public class ScanandPayPage {
	
	AndroidDriver driver;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"load image from gallery\"]/android.view.ViewGroup")
	private WebElement clickongallary;
	
	@FindBy(xpath="//android.widget.TextView[@text='Photos']")
	private WebElement clickonphoto;
	@FindBy(xpath="//android.widget.TextView[@text='Download']")
	private WebElement clickondownload;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Photo taken on Jul 14, 2023 10:35:08\"]")
	private WebElement choosephoto;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Amount, Double tap to enter\"]/android.view.ViewGroup/android.widget.EditText")
	private WebElement enteramount;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Remarks (Optional), Double tab to enter the Remarks\"]/android.view.ViewGroup/android.widget.EditText")
	private WebElement enterremark;
	@FindBy(xpath="//android.widget.Button[@content-desc='Send']")
	private WebElement clickonsend;
	@FindBy(xpath="//android.view.View[@text='Scan & Pay']")
	private WebElement scanpagetitle;
	
	public ScanandPayPage (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void scanningOpearationApp()
	{
		clickongallary.click();
		clickonphoto.click();
		clickondownload.click();
		choosephoto.click();
		
	}
//	public void enteramountdetailsApp(ExcelUtility eutil)throws Throwable
//	{
//		enteramount.sendKeys(eutil.getDataFromExcel("Testdata","sendMoneyThroughScanner","Amount"));
//		enterremark.sendKeys(eutil.getDataFromExcel("Testdata","sendMoneyThroughScanner","Remarks"));
//		clickonsend.click();
//	}
	public String fetchpagetitle()
	{
		String pagetitle=scanpagetitle.getText();
		return pagetitle;
		
	}

}
