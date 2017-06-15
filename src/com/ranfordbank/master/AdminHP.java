package com.ranfordbank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP 
{
	//Hello
@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
WebElement Role;

@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
WebElement Employee;

@FindBy (xpath=".//*[@id='Table_02']/tbody/tr/td[3]/a/img")
WebElement Lout;

public void Rol()
{
	Role.click();
}

public void Emp()
{
	Employee.click();
	
}
public void Lout()
{
	Lout.click();
}
}
