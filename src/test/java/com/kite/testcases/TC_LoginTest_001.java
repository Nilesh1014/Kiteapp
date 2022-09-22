package com.kite.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kite.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test 
	public void LoginTest () throws InterruptedException
	{
				
		logger.info("URL is opned");
		LoginPage lp = new LoginPage (driver);
		lp.sendusername(username);
		logger.info("username send");
		lp.sendpassword(password);
		logger.info("password send");
		lp.clickonloginBTN();
		logger.info("logingBTN click");
		
		Thread.sleep(2000);
		
		lp.sendpin(pin);
		logger.info("pin send");
		lp.clickoncontinueBTN();
		logger.info("continueBTN click");
		
		if (driver.getCurrentUrl().contains("kite.zerodha.com"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test Passed");
		}
		else 
		{
			Assert.assertTrue(false);
			logger.info("Login Test Failed");

		}
	}
	
	
}
