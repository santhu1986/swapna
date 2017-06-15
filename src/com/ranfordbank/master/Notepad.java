package com.ranfordbank.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad 

{
	public static void main(String[] args) throws IOException 
	{
	
		Library LB=new Library();
		
		String Res=LB.openapp("http://192.168.1.200/ranford2/home.aspx");
		System.out.println(Res);
		Res=LB.login("Admin","Admin");
		System.out.println(Res);
		
		String Fread="E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\testdata\\New Text Document.txt";
		
		String Rfile="E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\results\\Roleres.txt";
		String SD;
		//read
		
		FileReader Fr=new FileReader(Fread);
        BufferedReader Br=new BufferedReader(Fr);
        String Sread=Br.readLine();
        System.out.println(Sread);
        
        //Write
        
        FileWriter Fw=new FileWriter(Rfile);
        BufferedWriter Bw=new BufferedWriter(Fw);
        Bw.write(Sread);
        Bw.newLine();
        
        //loop
        
        while ((SD=Br.readLine())!=null)
        {
		System.out.println(SD);
		//Split
		String RD[]=SD.split("###");
		
		String Rname=RD[0];
		String Rdes=RD[1];
		String Rtyp=RD[2];
		
		Res=LB.roleCreation(Rname,Rdes,Rtyp);
		System.out.println(Res);
        
		//results
		
		Bw.write(Rname+"@@@"+Rdes+"%%%"+Rtyp+"###"+Res);
		Bw.newLine();
        
        
        }
        //read emlpyee details
        
        String FreadEmp="E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\testdata\\EmpNotePad.txt";
		String EmpRfile="E:\\swapna\\SeleniumLive\\src\\com\\ranfordbank\\results\\EmpRes.txt";
		String ds;
		FileReader EmpFRead= new FileReader(FreadEmp);
		BufferedReader Br1= new BufferedReader(EmpFRead);
		String EmpRead = Br1.readLine();
		System.out.println(EmpRead);
		//write to
		FileWriter EmpFwrite=new FileWriter(EmpRfile);
		BufferedWriter Bw1= new BufferedWriter(EmpFwrite);
		Bw1.write(EmpRead);
		Bw1.newLine();
		
		while ((ds=Br1.readLine())!=null) {
			System.out.println(ds);
			String Emp[]=ds.split("###");
			
			String EmployeeName = Emp[0];
			String EmployeeLoginPwd = Emp[1];
			String EmpRole = Emp[2];
			String EmpBranch = Emp[3];
			Res=LB.employeeCreation(EmployeeName, EmployeeLoginPwd, EmpRole, EmpBranch);
			System.out.println(Res);
			
			Bw1.write(EmployeeName+"@@@"+EmployeeLoginPwd+"%%%"+EmpRole+"###"+EmpBranch+"###"+Res);
			Bw1.newLine();
		}
	
	Bw.close();
	Br.close();
	Bw1.close();
	Br1.close();
	
	}

}
