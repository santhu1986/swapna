package com.ranfordbank.master;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Roleng extends Baseng
{
	@Test(dataProvider="Rdata")
public void Role(String Rn,String Rd,String Rt) throws IOException
{
	Lb.roleCreation(Rn,Rd,Rt);
}
	
	
	@DataProvider
	
	public Object[][] Rdata()
	{
		Object[][] Obj=new Object[2][3];
		
		Obj[0][0]="clerkhdfc30";
		Obj[0][1]="clerk";
		Obj[0][2]="E";
		
		Obj[1][0]="clerkhdfc31";
		Obj[1][1]="clerk";
		Obj[1][2]="E";
	
		return Obj;
		
	}
}
