package com.ranfordbank.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ng 
{

	public static WebDriver driver;
	public static String Expval,Actval;
	public static Properties PR = new Properties();
	public static FileInputStream Fis;
	
	@Test(priority=1)
	public void openapp()
	{
		
	  Expval="Ranford Bank";
	 driver = new FirefoxDriver();// firefox will launch
		driver.manage().window().maximize(); // firefox screen maximize
		driver.get("http://192.168.1.200/ranford2/home.aspx");
		
		//System.out.println("Title--"+ driver.getTitle());
		String Actval=driver.findElement(By.xpath(".//*[@id='Form1']/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if (Expval.equalsIgnoreCase(Actval))
		{
		System.out.println("RFHP is displayed");	
		//return "Pass";
		}
		else
		{
			System.out.println("RFHP Not displayed");
			//return "Fail";
		}	
		
	}
	@Test(priority=2)
	public void login() throws IOException
	{
		
		//PR=new Properties();
		Fis=new FileInputStream("E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\properties\\Rep.properties");
		PR.load(Fis);
		Expval = "Welcome to Admin";
		driver.findElement(By.id(PR.getProperty("Uname"))).sendKeys("Admin");
		driver.findElement(By.id(PR.getProperty("Pwd"))).sendKeys("Admin");
		driver.findElement(By.id(PR.getProperty("Lgn"))).click();
		
		String Actval1 = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		if(Expval.equalsIgnoreCase(Actval1))
		{
			System.out.println("Admin welcome page loaded");
			//return "Admin Pass";
		}
		else
		{
			System.out.println("Admin welcome page is not loaded");
			//return "Admin Fail";
		}
			
		
	}
	@Test(priority=3)
	public void roleCreation() throws IOException{
		Fis=new FileInputStream("E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\properties\\Rep.properties");
		PR.load(Fis);
		Expval="Sucessfully";
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.xpath(PR.getProperty("RoleBtn"))).click();//role click
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.id(PR.getProperty("NewRoleBtn"))).click(); // new role button click
		driver.findElement(By.id(PR.getProperty("NewRoleName"))).sendKeys("cashierciti25");
		driver.findElement(By.id(PR.getProperty("NewRoleDesc"))).sendKeys("cashier");
		Select Rtype=new Select(driver.findElement(By.xpath(PR.getProperty("RoleTypeDdown"))));
		Rtype.selectByVisibleText("E");
		driver.findElement(By.id(PR.getProperty("NewRoleSubmitBtn"))).click();
		Sleeper.sleepTightInSeconds(4);
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Sleeper.sleepTightInSeconds(4);
		driver.findElement(By.xpath(PR.getProperty("HomeBtn"))).click();
		if (Actval.contains(Expval))
		{
		System.out.println("Role Created");	
		//return "Role Created";
		}
		else
		{
			System.out.println("Role Already exist");
			//return "Role Already exist";
		}
		
	}
	@Test(priority=4)
	public void employeeCreation() throws IOException{
		Fis=new FileInputStream("E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\properties\\Rep.properties");
		PR.load(Fis);
		Sleeper.sleepTightInSeconds(4);
		
		driver.findElement(By.xpath(PR.getProperty("EmployeeBtn"))).click();
		driver.findElement(By.id(PR.getProperty("NewEmpBtn"))).click();
		driver.findElement(By.id(PR.getProperty("NewEmpUname"))).sendKeys("swapna");
		driver.findElement(By.id(PR.getProperty("NewEmpPwd"))).sendKeys("swapna");
		Select EmpRole = new Select(driver.findElement(By.xpath(PR.getProperty("RoleLstDdown"))));
		EmpRole.selectByVisibleText("cashierciti25");
		
		Select EmpBranch = new Select(driver.findElement(By.xpath(PR.getProperty("BranchLstDdown"))));
		EmpBranch.selectByVisibleText("1112");
		driver.findElement(By.id(PR.getProperty("EmpSubmitBtn"))).click();
		Sleeper.sleepTightInSeconds(4);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(PR.getProperty("HomeBtn"))).click();
		//return "Employee Created";
		
		//driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click(); // home button click
	}
	
	
	@Test(priority=5)
	public void logOut() throws IOException{
		Fis=new FileInputStream("E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\properties\\Rep.properties");
		PR.load(Fis);
		driver.findElement(By.xpath(PR.getProperty("LogOutBtn"))).click();
		//driver.close();
	}
	@Test(priority=6)
	public void closeDriver(){
		driver.close();
	}
}
