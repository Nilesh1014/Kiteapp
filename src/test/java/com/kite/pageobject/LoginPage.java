package com.kite.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);;
	}
	
	
	@FindBy(xpath = "//input[@id='userid']")
	WebElement UserID;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement Password;

	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginBTN;
	
	@FindBy(xpath = "//input[@id='pin']")
	WebElement Pin;
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement continueBTN;

	
	public void sendusername (String username)
	{
		UserID.sendKeys(username);
	}
	
	public void sendpassword (String password )
	{
		Password.sendKeys(password);
	}
	
	public void clickonloginBTN ()
	{
		loginBTN.click();
	}
	
	public void sendpin (String pin)
	{
		Pin.sendKeys(pin);
	}
	
	public void clickoncontinueBTN ()
	{
		continueBTN.click();
	}
	
			
			
	
	
}
