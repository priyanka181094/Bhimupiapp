package com.bhimapp.genericutility;

import java.io.FileInputStream;
import java.util.Properties;



public class PropertyFile {
	

	public String propertyfileutility(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Priyanka Ghosh\\OneDrive\\Desktop\\appiumtext.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(key);
		return value;
	}

}
