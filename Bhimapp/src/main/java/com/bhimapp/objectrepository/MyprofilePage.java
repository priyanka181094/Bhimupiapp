package com.bhimapp.objectrepository;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class MyprofilePage {
	
	AndroidDriver driver;
	@FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Default bank account ending with 2,0,5,8,5,0 in Axis Bank Ltd., Double tap to view all accounts\"]")
			
	private WebElement accountoption; 
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Go back\"]/android.widget.ImageView")
	private WebElement backbutton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Favourites']")
	private WebElement favoption;
	
	public MyprofilePage (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickonaccountnoApp()
	{
		accountoption.click();
	}
	public void clickonbackbuttonApp()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(backbutton));
		backbutton.click();
	}
	
	public void selectfavApp()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(favoption));
		favoption.click();
	}

}
