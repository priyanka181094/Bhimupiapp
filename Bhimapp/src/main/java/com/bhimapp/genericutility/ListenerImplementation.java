package com.bhimapp.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	
public void onTestStart(ITestResult result) {
	String methodname=result.getMethod().getMethodName();
	//System.out.println(methodname+"...........START");
	
	test=report.createTest(methodname);
	
		
	}

	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		//System.out.println(methodname+"...........PASS");
		test.log(Status.PASS, methodname+"...........PASS");
		
		
	}

	public void onTestFailure(ITestResult result) 
	{
		
		String screenshotname=result.getMethod().getMethodName();
		System.out.println(screenshotname+"............the method got failed");
		test.log(Status.FAIL, screenshotname+"...........Failed");
		test.log(Status.INFO,result.getThrowable());
		//TakesScreenshot ts=(TakesScreenshot)BaseClass.ssdriver;
	//File src=ts.getScreenshotAs(OutputType.FILE);
	String localdatetime=LocalDateTime.now().toString().replace(" ", "_").replace(":", "_");

	
	File trg=new File(".\\Screenshottake\\"+" "+localdatetime+screenshotname+".png");
	String path=trg.getAbsolutePath();
	
//	try {
//		
//		
//		//FileUtils.copyFile(src, trg);
//		test.addScreenCaptureFromPath(path);
//	} 
	}
	
	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		//System.out.println(methodname+"...........skipp");
		test.log(Status.SKIP, methodname+"...........skipp");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("suite execution started");
		ExtentSparkReporter htmlreport=new ExtentSparkReporter(".\\Extent Report\\Report-"+new JavaUtility().Systemdateinmyformat()+".html");
		htmlreport.config().setDocumentTitle("BHIMAPPEXECUTION EXECUTION");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("BHIMAPP EXECUTION REPORT");
		
		
		
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("platform","Android");
		report.setSystemInfo("UDID","10BCA116FY000EE");
		report.setSystemInfo("appPackage","in.org.npci.upiapp");
		report.setSystemInfo("appactivity",".HomeActivity");
		report.setSystemInfo("Basebrowser","Chrome");
		report.setSystemInfo("Reportername","Priyanka");
	}

	public void onFinish(ITestContext context) {
		System.out.println("suit executionfinished");
		report.flush();

		
	}
	

}




