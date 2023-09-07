package com.Bhim.Npci;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.bhimapp.genericutility.BaseClass;

public class TransactionTest extends BaseClass {
	
	//testcase5
	//@Test
	public  void sendmoneyTest()throws Throwable
	{
	}
}
	
//			//entering passcode
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//				pass.passcodeApp();
//				
//				//homepage
//				homo.choosefromfav(eutil);
//				
//				//sendmoneypage
//				sed.enteramountApp(eutil.fetchDatafromExcel("Sheet3",1,0));
//				
//				
//				sed.clicksendbutton();
//				
//				String toastmessage=sed.fetchtransactionmessage();
//				System.out.println(toastmessage);
//				Assert.assertEquals(toastmessage, eutil.fetchDatafromExcel("Sheet5", 1, 0));
//				
//				//backbutton
//				sed.clickonbackbuttonApp();
//				
//				
//				//logout from the appplication
//				homo.logoutApp();
//		
//	}
//	
//	//testcase7
//	
//	 //@Test
//	
//
//	public void sendMoneyWithoutAddingfavTest()throws Throwable
//	{
//		//entering passcode
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		pass.passcodeApp();
//		
//		//click on send button in homepage
//		homo.sendmoneyApp();
//		
//		//sendmoneypage click on contactoption
//		sed.clickoncontactoptionApp();
//		
//		
//		
//		//entername in textfield
//		sed.entecontactextfield(eutil.fetchDatafromExcel("Sheet1", 1, 0));
//		
//		//select the name from dropdownon 
//		sed.selectnamefromdropdown(eutil);
//		//enter amount and remarks textfield
//		sed.filltextfieldApp(eutil);
//		//Assert.fail();
//		//click on send
//		sed.sendbuttonApp();
//		
//		
//		
//		//click on I agree checkbox and later button
//		
//		sed.clickcheckboxApp();
//		
//		//to enter  manually wrongpin for testing purpose 
//		Thread.sleep(4000);
//		
//		
//		//fetch faild message
//		String text=sed.getmessageApp();
//		//validate the text message
//		Assert.assertEquals(text,"Could not send money!");
//		//click on home button
//		sed.HomeApp();
//		
//		//logout
//		homo.logoutApp();
//	}
//	
//	
//	 @Test
//	 public void sendMoneyThroughScanner() throws Throwable
//	 {
//		
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			//verify passcodepage
//			String passtitle=pass.fetchtitlepasscode();
//			Assert.assertEquals( passtitle,eutil.getDataFromExcel("Testdata","sendMoneyThroughScanner","PasscodePageTitle"));
//			System.out.println("passcodepage is verified");
//			//enter passcode
//			pass.passcodeApp();
//			//verify the homepage
//			String bankname=homo.fettitleApp();
//			String title=bankname.replace(".","");
//			System.out.println(bankname);
//			Assert.assertEquals( title,eutil.getDataFromExcel("Testdata","sendMoneyThroughScanner","HomePageTitle"));
//			System.out.println("homepagepage is verified");
//			//click on scanner option
//			homo.clickOnScanner();
//			//verify the scannerpage
//			String scantitle=scan.fetchpagetitle();
//			Assert.assertEquals( scantitle,eutil.getDataFromExcel("Testdata","sendMoneyThroughScanner","Scan &PaypageTitle"));
//			System.out.println("scannerpage is verified");
//			//click on gallary option and choose scanner
//			scan.scanningOpearationApp();
//			//enter amount and remarks
//			scan.enteramountdetailsApp(eutil);
//			//select the chheckbox
//			sed.clickcheckboxApp();
//			
//			//to enter  upi pin for testing purpose 
//			upi.enteupipin();
//		
//			//click on home button
//			
//			sed.HomeApp();
//			
//			
//			//logout
//			
//			homo.logoutApp();
//			//verify passcodepage
//			Assert.assertEquals( passtitle,eutil.getDataFromExcel("Testdata","sendMoneyThroughScanner","PasscodePageTitle"));
//			System.out.println("passcodepage is verified");
//			
//			
//			
//			
//			
//			
//		 
//	 }
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	
//
//}
//
