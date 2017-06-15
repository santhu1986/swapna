package com.ranfordbank.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pom 
{
	@Test
public void lgn()
{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.1.200/ranford2/home.aspx");
	
	RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	RHP.login();
	
	AdminHP RAHP = PageFactory.initElements(driver, AdminHP.class);
	RAHP.Rol();
	
	NewRoleHP NR = PageFactory.initElements(driver, NewRoleHP.class);
	NR.NewBtnClick();
	
	NewRolePage NRP =PageFactory.initElements(driver, NewRolePage.class);
	NRP.CreateNewRl();
	
	NewRolePage NRPs =PageFactory.initElements(driver, NewRolePage.class);
	NRPs.ClkSbmt();
	driver.switchTo().alert().accept();
	
	NewRoleHP NRHB = PageFactory.initElements(driver, NewRoleHP.class);
	NRHB.HmBtnClick();
	
	AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	AHP.Lout();
	
}
}
