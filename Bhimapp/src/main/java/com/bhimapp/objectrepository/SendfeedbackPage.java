package com.bhimapp.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SendfeedbackPage {
	AndroidDriver driver;
	
	@FindBy(xpath="//android.widget.EditText[@index='0']")
	private WebElement textfield;
	
	
	@FindBy(id="in.org.npci.upiapp:id/splash_animating_image")
	private WebElement sendbuttton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Your Feedback has been submitted.']")
	private WebElement toastmessage ;
	
	
	
	
	
	

	public SendfeedbackPage (AndroidDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void enterfeedback(String feedback)
	{
		textfield.sendKeys(feedback);
	}
	public void clickonsendApp()
	{
		sendbuttton.click();
	}
	public String  fetchtoastmessage()
	{
		String message=toastmessage.getText();
		return message;
	}

}
