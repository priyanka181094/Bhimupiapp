package com.Bhim.Npci;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bhimapp.genericutility.BaseClass;

import io.appium.java_client.AppiumBy;
public class FavouritesTest extends BaseClass {
	
	//testcase2
	@Test
	public void addtoFavouriteTest()throws Throwable
	{ 
	}
}
	
//		AndroidDriver driver=null;
//
//	
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		pass.passcodeApp();
//		Reporter.log("enterpasscode is successful");
//		//click on manage option
//		homo.manageApp();
//		Reporter.log("click on iamage option");
//		//click on add favrite
//		fav.clickonfavApp();
//		
//		
//		fav.EnterupiApp(eutil.getDataFromExcel("Testdata","addtoFavouriteTest","Payeename"));
//		
//		//favourites page
//
//		fav.taptocontact();
//		//Assert.fail();
//		
//		
//		fav.addbuttonApp();
//				
//		
//		
//		
//		//logout
//		bc.clickonbackbuttonApp();
//			homo.logoutApp();
//	}
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
//	//testcase6
//	//@Test
//	public void deleteFavouriteTest() throws EncryptedDocumentException, IOException
//	{  
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		pass.passcodeApp();
//		
//		//click on manage
//		homo.manageApp();
//		
//		//click on the contact to delete	 
//		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[contains(@content-desc,'"+eutil.fetchDatafromExcel("Sheet1",1,0)+"')]")).click();
//		//favouriytespage
//		fav.deleteApp();
//		
//		//fetch the toast message and validate
//		String toastMessage =fav.fetchtoastmessageApp();
//		
//	
//		System.out.println(toastMessage);
//		AssertJUnit.assertEquals(toastMessage,eutil.fetchDatafromExcel("Sheet4", 1, 0));
//		
//		
//		//logut
//		//back from favourites page
//		fav.clickbackbuttonApp();
//		homo.logoutApp();
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
//}
//
//
//
