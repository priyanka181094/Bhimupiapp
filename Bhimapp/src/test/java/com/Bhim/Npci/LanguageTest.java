package com.Bhim.Npci;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bhimapp.genericutility.BaseClass;

public class LanguageTest extends BaseClass{
	
	@Test
	public void changelanguageTest()throws Throwable
	{
	}
}
	
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//				
//	//verify passcodepage title
//	String passtitle=pass.fetchtitlepasscode();
//	Assert.assertEquals( passtitle,eutil.getDataFromExcel("Testdata","ChangelanguageTest","PasscodePageTitle"));
//	System.out.println("*****passcodepage is verified******");
//						
//						
//	//enter the passcode
//	pass.passcodeApp();
//	//verify the homepage
//	String bankname=homo.fettitleApp();
//	String title=bankname.replace(".","");
//	System.out.println(bankname);
//	Assert.assertEquals( title,eutil.getDataFromExcel("Testdata","ChangelanguageTest","HomePageTitle"));
//	System.out.println("**homepage is verified***");
//	
//	
//	
//		//click on more option
//		homo.clickmoreoptionApp();
//		//click on chhangelanguage
//		homo.changelangApp();
//		String language=lang.changelanguageApp();
//		
//		
//		//to verify the languagepage
//		Assert.assertEquals(language,eutil.getDataFromExcel("Testdata","ChangelanguageTest","LanguagePageTitle"));
//		System.out.println("****languagepage is verified*****");
//		
//		//click on language
//		lang.chooselanguageApp(eutil);
//		
//		
//		//click on nextchange language page
//		lang.clickonbackbuttonApp();
//		
//		//verify homepage
//		Assert.assertEquals( title,eutil.getDataFromExcel("Testdata","ChangelanguageTest","HomePageTitle"));
//		System.out.println("**homepage is verified***");
//		
//		
//		
//		//logout from the app
//		homo.logoutApp();
//		Assert.assertEquals( passtitle,eutil.getDataFromExcel("Testdata","ChangelanguageTest","PasscodePageTitle"));
//		System.out.println("*****passcodepage is verified******");
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
