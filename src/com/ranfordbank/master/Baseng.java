package com.ranfordbank.master;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Baseng {
 
	Library Lb=new Library();
	
  @BeforeTest
  public void beforeTest() throws IOException
  {
  Lb.login("Admin","Admin");
  }

  @AfterTest
  public void afterTest() throws IOException 
  {
  Lb.logOut();
  }

  @BeforeSuite
  public void beforeSuite()
  {
  Lb.openapp("http://192.168.1.200/ranford2/home.aspx");
  }

  @AfterSuite
  public void afterSuite() 
  {
  Lb.closeDriver();
  }

}
