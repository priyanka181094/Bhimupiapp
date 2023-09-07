package com.bhimapp.genericutility;

import java.io.FileInputStream;
import java.util.Properties;



public class PropertyFile {
	

	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IPathConstant.commonDataFilePath);
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
	}

}
