package com.comcast.crm.generic.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
public String getDataFromJSONFile(String key) {
	FileReader filR = null;
	try {
		filR = new FileReader("./testdata/appCommonData.json");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	JSONParser parser = new JSONParser();
	Object obj = null;
	try {
		obj = parser.parse(filR);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  JSONObject map = (JSONObject)obj;
	  String data = (String) map.get(key);
	  return data;
}
}
