package com.ranfordbank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP 
{

	@FindBy (id="txtuId")
	WebElement Uname;
	
	@FindBy (id="txtPword")
	WebElement Pwd;
	
	@FindBy (id="login")
	WebElement Lgn;
	
	public void login()
	{
		Uname.sendKeys("Admin");
		Pwd.sendKeys("Admin");
		Lgn.click();
		
	}
}
