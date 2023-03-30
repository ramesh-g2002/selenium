package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@BeforeClass
	public static WebDriver driver;
	//@BeforeTest
	public void openBrower()
	{
		Reporter.log("openBrower",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
	
	}
	@AfterClass
	//@AfterTest
	public void closeBrower()
	{
		Reporter.log("closeBrower",true);
		driver.close();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
		
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
