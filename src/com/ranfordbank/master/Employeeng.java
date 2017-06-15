package com.ranfordbank.master;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Employeeng extends Baseng{
  @Test(dataProvider="Edata")
  public void Emp(String en, String ep, String r, String b) throws IOException 
  {
	Lb.employeeCreation(en,ep,r,b);

  }
  
  @DataProvider
  
  public Object[][] Edata(){
	  Object[][] obj = new Object[3][4];
	  
	  obj[0][0]="mindqsys30";
	  obj[0][1]="mqsys";
	  obj[0][2]="clerkhdfc";
	  obj[0][3]="abcd11";
	  
	  obj[1][0]="mindqsys31";
	  obj[1][1]="mqsys1";
	  obj[1][2]="clerkhdfc";
	  obj[1][3]="abcd11";
	  
	  obj[2][0]="mindqsys32";
	  obj[2][1]="mqsys2";
	  obj[2][2]="clerkhdfc";
	  obj[2][3]="abcd11";
	  
	  
	  return obj;
	  
  }
  
}
