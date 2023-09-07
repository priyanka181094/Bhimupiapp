package com.bhimapp.Worklibrary;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;

import com.bhimapp.genericutility.ExcelUtility;
import com.bhimapp.objectrepository.BankAccounts;

import io.appium.java_client.android.AndroidDriver;

public class WorkLibraryClass {
	AndroidDriver driver;
	

	public WorkLibraryClass(AndroidDriver driver) {
		this.driver = driver;
	}
	public void verifybalance(BankAccounts bc,ExcelUtility eutil, String actualbalance, String lastbalance) throws NumberFormatException, EncryptedDocumentException, IOException
	{
		 
		String beforetransactionbalance=actualbalance.replace("₹", "").replace(",", "");
		String aftertransactionbalance=lastbalance.replace("₹", "").replace(",", "");
		
//		double expectedBalanceAfterTransactionModified = Double.parseDouble(beforetransactionbalance)
//				-Double.parseDouble(eutil.getDataFromExcel("Testdata","sendMoneyandVerifybalanceTest","Amount"));

//		String expectedBalanceAfterTransaction = String.valueOf(expectedBalanceAfterTransactionModified);
//		System.out.println(expectedBalanceAfterTransaction);
		//Assert.assertEquals(aftertransactionbalance.trim(),expectedBalanceAfterTransaction.trim());
	}
	public void backtomainpage()
	{
		driver.navigate().back();
		driver.navigate().back();
	}
	
		
		
	}
	
	
	
	
	
	
	
	
	
	

	


