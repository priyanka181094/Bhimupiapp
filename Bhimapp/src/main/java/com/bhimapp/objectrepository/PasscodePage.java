package com.bhimapp.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PasscodePage {
	AndroidDriver driver;
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='1']/android.view.ViewGroup")
	private WebElement digit1;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='9']/android.view.ViewGroup/android.widget.TextView")
	private WebElement digit9;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc='4']/android.view.ViewGroup")
	private WebElement digit4;
	@FindBy(xpath="//android.widget.TextView[@text='Passcode']")
	private WebElement fetchtitlepasscode;
	
	public PasscodePage (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void passcodeApp()
	{
		digit1.click();
		digit9.click();
		digit9.click();
		digit4.click();
	}
	public String  fetchtitlepasscode()
	{
		String title=fetchtitlepasscode.getText();
		return title;
	}

}
