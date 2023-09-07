package com.Bhim.Npci;

import java.time.Duration;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.bhimapp.Worklibrary.WorkLibraryClass;
import com.bhimapp.genericutility.BaseClass;
@Listeners(com.bhimapp.genericutility.ListenerImplementation.class)
public class ProfileTest extends BaseClass {
	
	//@Test
	public void balanceEnquiryandVerify()throws Throwable
	{
	}
}
	
//		//login to the application
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//			//verify passcodepage title
//				String passtitle=pass.fetchtitlepasscode();
//				Assert.assertEquals( passtitle,eutil.getDataFromExcel("Testdata","balanceEnquiryandVerify","PasscodePageTitle"));
//				
//				pass.passcodeApp();
//				//verifyhomepage
//				String bankname=homo.fettitleApp();
//				String title=bankname.replace(".","");
//				System.out.println(bankname);
//				Assert.assertEquals( title,eutil.getDataFromExcel("Testdata","balanceEnquiryandVerify","HomePageTitle"));
//				//click on profileoption
//		
//		homo.clickonprofileApp();
//		//verify the profilepage
//		String pagetitle=homo.verifypagetitleAppp();
//		System.out.println(pagetitle);
//		
//		Assert.assertEquals(pagetitle,eutil.getDataFromExcel("Testdata","balanceEnquiryandVerify","ProfilePageTitle"));
//		System.out.println("****profilepage is verified****");
//		
//		//click on bankaccount
//		mp.clickonaccountnoApp();
//		//verify banckaccountPage
//		String bankaccounttitle=bc.bankaccountpageApp();
//		Assert.assertEquals(bankaccounttitle,eutil.getDataFromExcel("Testdata","balanceEnquiryandVerify","BankAccountPageTitle"));
//		System.out.println("***bankaccount page is verified***");
//		bc.checkbalanceclickApp();
//		//enter upi pin
//		upi.enteupipin();
//		String actualbalance=bc.balanceamountApp();
//		//to go back to home page
//		work.backtomainpage();
//		//click on accountno in homepage
//		homo.clickonaccountnoApp();
//		//click on checkbalance option
//		bc.checkbalanceclickApp();
//		//enter upipin
//		upi.enteupipin();
//		//fetch the balance
//		String lastbalance=bc.balanceamountApp();
//		//to check the balance
//		Assert.assertEquals(actualbalance, lastbalance);
//		System.out.println("BalanceVerificationinprofile testcase passed");
//		///for logout opeartion
//		
//		bc.clickonbackbuttonApp();
//		//verifyhomepage
//		Assert.assertEquals( title,eutil.getDataFromExcel("Testdata","balanceEnquiryandVerify","HomePageTitle"));
//		
//
//		homo.logoutApp();
//		Assert.assertEquals( passtitle,eutil.getDataFromExcel("Testdata","balanceEnquiryandVerify","PasscodePageTitle"));
//		System.out.println("*****passcodepage is verified******");
//		
//		
//	}	
//	
//		
//		
//		//testcase3
//		@Test
//		public void addtoFavouriteTest()throws Throwable
//		{
//
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			//verify passcodepage
//			String passtitle=pass.fetchtitlepasscode();
//			Assert.assertEquals( passtitle,eutil.getDataFromExcel("Testdata","addtoFavouriteTest","PasscodePageTitle"));
//		System.out.println("****passcodepage is verified***");
//		//enter passcode
//			pass.passcodeApp();
//			//verifyhomepage
//			String bankname=homo.fettitleApp();
//			String title=bankname.replace(".","");
//			Assert.assertEquals( title,eutil.getDataFromExcel("Testdata","addtoFavouriteTest","HomePageTitle"));
//			System.out.println("****homepage will be verified***");
//
//			//click on profileoption
//			
//			homo.clickonprofileApp();
//			//scroll till favourite option
//			
//			gg.scrollingGesture("Favourites")	;	
//			
//		
//			//Myprpfilespage select favourite option
//			mp.selectfavApp();
//			
//			//verify favouritePage
//			String pagetitle=fav.fetchTitleApp();
//			Assert.assertEquals(pagetitle, eutil.getDataFromExcel("Testdata","addtoFavouriteTest","FavouritePageTitle"));
//			System.out.println("***favourite page will be verified***");
//			
//			fav.clickonfavoptionApp();
//			//excelsheet
//			fav.EnterupiApp(eutil.getDataFromExcel("Testdata","addtoFavouriteTest","Payeename"));
//			fav.taptocontact();
//			fav.addbuttonApp();
//			//go backto homepage
//			fav.clickbackbuttonApp();
//			driver.navigate().back();
//			Assert.assertEquals( title,eutil.getDataFromExcel("Testdata","addtoFavouriteTest","HomePageTitle"));
//			System.out.println("****homepage will be verified***");
//			
//			//logout operation
//			homo.logoutApp();
//			Assert.assertEquals( passtitle,eutil.getDataFromExcel("Testdata","addtoFavouriteTest","PasscodePageTitle"));
//			System.out.println("****passcodepage is verified***");
//			
//
//
//		}
//		
//		
//		//@Test
//		public void sendMoneyandVerifybalanceTest()throws Throwable
//		{
//
//			//login to the application
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			pass.passcodeApp();
//			
//			
//			//click on profileoption
//			
//			homo.clickonprofileApp();
//			
//			//click on bankaccount
//			mp.clickonaccountnoApp();
//			
//		
//			
//		
//			bc.checkbalanceclickApp();
//			
//			upi.enteupipin();
//			
//
//			
//			
//			String actualbalance=bc.balanceamountApp();
//			//write the fetched amount in excel
//			
//			eutil. writeDataInExcel("Testdata","sendMoneyandVerifybalanceTest","actualbalance",actualbalance);
//			
//			//back to main page
//			work.backtomainpage();
//			
//
//			
//			//go to the homepage
//			homo.sendmoneyApp();
//			
//			//sendmoneypage click on contactoption
//			sed.clickoncontactoptionApp();
//			
//			
//			
//			//entername in textfield
//			sed.entecontactextfield(eutil.getDataFromExcel("Testdata","sendMoneyandVerifybalanceTest","Payeename"));
//			
//			//select the name from dropdownon 
//			sed.selectnamefromdropdown(eutil);
//			
//			//enter amount and remarks textfield
//			sed.filltextfieldApp(eutil);
//			//click on send
//			sed.sendbuttonApp();
//			//select the chheckbox
//			sed.clickcheckboxApp();
//			
//			//to enter  upi pin for testing purpose 
//			upi.enteupipin();
//			
//			//click on home button
//			sed.HomeApp();
//			
//			//click on accountno in homepage
//			homo.clickonaccountnoApp();
//			//click on checkbalance option
//			bc.checkbalanceclickApp();
//			upi.enteupipin();
//			
//			
//			
//			//fetch the balance
//			String lastbalance=bc.balanceamountApp();
//			System.out.println(lastbalance);
//			
//			
//			// balance verification after transaction
//			
//			
//			work.verifybalance(bc,eutil, actualbalance, lastbalance);
//			
//			
//			
//			
//			
//			//back to homepage
//			bc.clickonbackbuttonApp();
//			//logout operation
//			
//			homo.logoutApp();
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
//		}	
//			
//
//	
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
