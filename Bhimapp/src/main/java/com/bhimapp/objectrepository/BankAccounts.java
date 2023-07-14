package com.bhimapp.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BankAccounts {
	AndroidDriver driver;
	@FindBy(xpath="//android.widget.TextView[@text='Check Balance']")
	private WebElement checkbalance; 
	
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Check balance. Double tap to check the balance\"]/android.widget.TextView")
	private WebElement balanceamount; 
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Go back\"]/android.widget.ImageView")
	private WebElement backbutton;
	@FindBy(xpath="//android.view.View[@text='Bank Accounts']")
	private WebElement bankaccountitle;
	
	public BankAccounts (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void checkbalanceclickApp()
	{
		checkbalance.click();
	}
	public String  balanceamountApp()
	{
		String amountavaiable=balanceamount.getText();
		return amountavaiable;
	}
	public void clickonbackbuttonApp()
	{
		backbutton.click();
	}
	public String bankaccountpageApp()
	{
		String title=bankaccountitle.getText();
		return title;
	}

}
