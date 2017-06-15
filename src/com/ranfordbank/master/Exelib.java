package com.ranfordbank.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelib {

	public static void main(String[] args) throws IOException
	{
	
		Library LB=new Library();
		
		String Res=LB.openapp("http://192.168.1.200/ranford2/home.aspx");
		System.out.println(Res);
		Res=LB.login("Admin","Admin");
		System.out.println(Res);
		
	/*	Res=LB.roleCreation("NewRoleName", "MyNewRole");
		System.out.println(Res);
		
		Res=LB.employeeCreation("MyEmpUserName", "Employee", "NewRoleName");
		System.out.println(Res);
		
		
		LB.logOut();
		LB.closeDriver();
*/	
		FileInputStream Fis1=new FileInputStream("E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\testdata\\EmployeeExl.xlsx");	
	/*	FileInputStream Fis=new FileInputStream("E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\testdata\\Role.xlsx");
	
	
		//create Workbook
	
	XSSFWorkbook WB=new XSSFWorkbook(Fis);
	
	//Sheet
	
	XSSFSheet WS=WB.getSheet("RoleData");
	
	//Row count
	
	int Rc=WS.getLastRowNum();
	System.out.println(Rc);
	
	//multiple interations ---LOOP
	
	for (int i =1; i<=Rc; i++) 
	{
	
		//Row
		
		XSSFRow WR=WS.getRow(i);
		
		//cell
		
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.getCell(2);
		XSSFCell WC3=WR.createCell(3);
		
		
		String Rn=WC.getStringCellValue();
		String Rd=WC1.getStringCellValue();
		String Rt=WC2.getStringCellValue();
		
		Res=LB.roleCreation(Rn,Rd,Rt);
		System.out.println(Res);
		WC3.setCellValue(Res);
		
	}
	
	FileOutputStream fos=new FileOutputStream("E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\results\\roleres.xlsx");
	WB.write(fos);
	WB.close();
	*/
	//Employee
	
	XSSFWorkbook WB1=new XSSFWorkbook(Fis1);
	XSSFSheet WS1=WB1.getSheet("EmpSheet");
	int Rc1=WS1.getLastRowNum();
	System.out.println("---Rc1--"+Rc1);
	for (int i =1; i<=Rc1; i++) 
	{
	
		//Row
		
		XSSFRow WR1=WS1.getRow(i);
		
		//cell
		
		XSSFCell EWC=WR1.getCell(0);
		XSSFCell EWC1=WR1.getCell(1);
		XSSFCell EWC2=WR1.getCell(2);
		XSSFCell EWC3=WR1.getCell(3);
		XSSFCell EWC4=WR1.createCell(4);
	
		
		String En=EWC.getStringCellValue();
		String Lp=EWC1.getStringCellValue();
		String Rl=EWC2.getStringCellValue();
	
		String Br=EWC3.getStringCellValue();
		
		
		Res=LB.employeeCreation(En,Lp,Rl,Br);
		System.out.println(Res);
		EWC4.setCellValue(Res);
		
	}
	
	//Results
	
			FileOutputStream fos1= new FileOutputStream("E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\results\\EMPres.xlsx");
			WB1.write(fos1);
			WB1.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}

}

//role
//employee
//log out
//close