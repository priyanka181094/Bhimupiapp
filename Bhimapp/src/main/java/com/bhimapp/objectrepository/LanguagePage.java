package com.bhimapp.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bhimapp.genericutility.ExcelUtility;

import io.appium.java_client.android.AndroidDriver;

public class LanguagePage {
	
	AndroidDriver driver;
	ExcelUtility eutil=new ExcelUtility();
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Go back\"]/android.widget.ImageView")
	private WebElement backbutton;
	@FindBy(xpath="//android.view.View[@text='Change Language']")
	private WebElement languagetitle;
	
	public LanguagePage (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickonbackbuttonApp()
	{
		backbutton.click();
	}
//	public void chooselanguageApp(ExcelUtility eutil) throws Throwable
//	{
//		WebElement wb=driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+eutil.getDataFromExcel("Testdata","ChangelanguageTest", "Language")+"')]"));
//		String language=wb.getText();
//		if(language.contains(eutil.getDataFromExcel("Testdata","ChangelanguageTest", "Language")))
//		{
//		//select the language
//		wb.click();
//		}
//		
//	}
	public String changelanguageApp()
	{
		String title=languagetitle.getText();
		return title;
	}
}
