package com.actitime.testScript1.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Dmo.BaseClass;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Dmo.ListenerImplentation.class)
public class CustomerModule extends BaseClass{

	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
		int a=10/0;
		System.out.println(a);
	}
	@Test//(priority = 1,invocationCount = 2)
	public void modifyCustomer() throws InterruptedException
	{
		Reporter.log("modifyCustomer",true);
		Thread.sleep(3000);
		Assert.fail();
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}
}
