package com.kite.testcases;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.kite.utilitis.ReadConfig;


public class BaseClass {

	
	ReadConfig readconfig = new ReadConfig ();
	
	public String baseURl = readconfig.getApllicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
	public String pin = readconfig.getpin();
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc-pc\\eclipse-workspace\\KiteAutomation\\Driver\\chromedriver.exe");		
		driver = new ChromeDriver ();
		driver.get(baseURl);
		logger = LogManager.getLogger(BaseClass.class);
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
}
