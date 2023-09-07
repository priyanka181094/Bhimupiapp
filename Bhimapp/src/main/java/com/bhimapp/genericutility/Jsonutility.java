 package com.bhimapp.genericutility;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class Jsonutility {
	
	public String  readdata(String key)throws Throwable
	{
		FileReader reader=new FileReader(IPathConstant.commonDataFilePath );
		JSONParser jp=new JSONParser();
		Object obj=jp.parse(reader);
		HashMap map=(HashMap )obj;
		String valuename=(String)map.get(key);
		return valuename; 
		
		
		
		
	}

}
