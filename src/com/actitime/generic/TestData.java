package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class TestData {
	
public static void main(String[] args) throws IOException {
	FileInputStream f=new FileInputStream("./data/common.property");
	Properties p=new Properties();
	p.load(f);
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	
}
}
