package com.ranfordbank.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Expval="Ranford Bank";
		WebDriver driver = new FirefoxDriver();// firefox will launch
		driver.manage().window().maximize(); // firefox screen maximize
		driver.get("http://192.168.1.200/ranford2/home.aspx");
		
		//System.out.println("Title--"+ driver.getTitle());
		String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if (Expval.equalsIgnoreCase(Actval))
		{
		System.out.println("RFHP is displayed");	
		}
		else
		{
			System.out.println("RFHP Not displayed");
		}
		//Admin login
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		Expval = "Welcome to Admin";
		String Actval1 = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		if(Expval.equalsIgnoreCase(Actval1)){
			System.out.println("Admin welcome page loaded");
		}else{
			System.out.println("Admin welcome page is not loaded");
		}
		
		
		Expval="Sucessfully";
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();//role click
		
		driver.findElement(By.id("btnRoles")).click(); // new role button click
		driver.findElement(By.id("txtRname")).sendKeys("NewRoleName");
		driver.findElement(By.id("txtRDesc")).sendKeys("MyNewRole");
		Select Rtype=new Select(driver.findElement(By.xpath(".//*[@id='lstRtypeN']")));
		Rtype.selectByVisibleText("E");
		driver.findElement(By.id("btninsert")).click();
		Sleeper.sleepTightInSeconds(4);
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if (Actval.contains(Expval))
		{
		System.out.println("Role Created");	
		}
		else
		{
			System.out.println("Role Already exist");
		}
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		driver.findElement(By.id("BtnNew")).click();
		driver.findElement(By.id("txtUname")).sendKeys("MyEmpUserName");
		driver.findElement(By.id("txtLpwd")).sendKeys("Employee");
		Select EmpRole = new Select(driver.findElement(By.xpath(".//*[@id='lst_Roles']")));
		EmpRole.selectByVisibleText("NewRoleName");
		
		Select EmpBranch = new Select(driver.findElement(By.xpath(".//*[@id='lst_Branch']")));
		EmpBranch.selectByVisibleText("1112");
		driver.findElement(By.id("BtnSubmit")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
	}

}
//roles
//employee