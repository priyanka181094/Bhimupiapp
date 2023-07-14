package com.bhimapp.genericutility;



import java.io.File;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.bhimapp.Worklibrary.WorkLibraryClass;
import com.bhimapp.objectrepository.BankAccounts;
import com.bhimapp.objectrepository.FavouritePage;
import com.bhimapp.objectrepository.HomePage;
import com.bhimapp.objectrepository.LanguagePage;
import com.bhimapp.objectrepository.MyprofilePage;
import com.bhimapp.objectrepository.PasscodePage;
import com.bhimapp.objectrepository.ScanandPayPage;
import com.bhimapp.objectrepository.SendMoneyPage;
import com.bhimapp.objectrepository.SendfeedbackPage;
import com.bhimapp.objectrepository.UpiPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;



@Listeners(com.bhimapp.genericutility.ListenerImplementation.class)
/**
 * This class is used to trigger the appium server and launch the application
 * @author Priyanka Ghosh
 *
 */
public class BaseClass {
	 Jsonutility jutil=new  Jsonutility();
		AppiumDriverLocalService service;//to access it before suite and after suite
		
		public AndroidDriver driver;
		public GestureUtility gg;
		public ExcelUtility eutil;
		//public static AndroidDriver sdriver;
		public Driverutility  dutil;
		public BankAccounts bc;
		public HomePage homo;
		public MyprofilePage mp;
		public PasscodePage pass;
		public  FavouritePage fav;
		public  LanguagePage lang;
		public SendMoneyPage sed;
		public  SendfeedbackPage fed;
		public  static AndroidDriver ssdriver;
		public WorkLibraryClass work;
		public ScanandPayPage scan;
		public UpiPage upi;
		
		

		@BeforeSuite
		public void startserver()
		{
			File f=new File("C:\\Users\\Priyanka Ghosh\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
			service=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("0.0.0.0").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			service.start();
		}
		@BeforeMethod
		public void  openApp()throws Throwable
		{
		
			DesiredCapabilities dc=new 	DesiredCapabilities();
			
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,jutil.readdata("PLATFORMNAME"));
			dc.setCapability(MobileCapabilityType.DEVICE_NAME,jutil.readdata("DEVICENAME"));
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,jutil.readdata("AUTOMATIONNAME"));
			dc.setCapability(MobileCapabilityType.UDID,jutil.readdata("UDID"));
			
			dc.setCapability("appPackage",jutil.readdata("appPackage"));
			
			dc.setCapability("appActivity",jutil.readdata("appActivity"));
			dc.setCapability("noReset",jutil.readdata("noReset"));
			URL u=new URL("http://localhost:4723");
			
			
			//locationg the phone when automating
			driver=new AndroidDriver(u,dc);
			//for listener implimentation
			//sdriver=driver;
			
			gg=new GestureUtility(driver);
			
			dutil=new Driverutility(driver);
			 bc=new BankAccounts(driver);
			 homo=new HomePage(driver);
			 mp=new MyprofilePage(driver);
			 pass=new PasscodePage(driver);
			 fav=new  FavouritePage(driver);
			 eutil= new ExcelUtility();
			 sed=new SendMoneyPage(driver);
			
			 lang=new LanguagePage(driver);
			 fed=new SendfeedbackPage(driver);
			 upi=new  UpiPage (driver);
			 work=new WorkLibraryClass(driver);
			 scan=new  ScanandPayPage(driver);
			 ssdriver=driver;
			
			
			
			
			
			
		}
		
		@AfterMethod
		public void  closeApp()
		{
			driver.quit();
			
		}
		@AfterSuite
		public void stopserver()
		{
			
			service.stop();
		}
		
		

	}

