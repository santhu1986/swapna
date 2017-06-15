package com.ranfordbank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewRolePage {

	 @FindBy(id="txtRname")
	 WebElement NewRlNm;
	 
	 @FindBy(id="txtRDesc")
	 WebElement Desc;
	 
	 @FindBy(id="lstRtypeN")
	 WebElement Rtype;
	 
	 @FindBy(id="btninsert")
	 WebElement Sbmt;
	 
	 @FindBy(id="Btn_Reset")
	 WebElement Ret;
	 
	 @FindBy(id="Btn_cancel")
	 WebElement Cncl;
	 
	 public void CreateNewRl(){
		 NewRlNm.sendKeys("clerk3");
		 Desc.sendKeys("clerk3desc");
		 Select Rtyp = new Select(Rtype);
		 Rtyp.selectByVisibleText("E");
	 }
	 
	 public void ClkSbmt(){
		 Sbmt.click();
	 }
	 public void Clkrst(){
		 Ret.click();
	 }
	 public void Clkcncl(){
		 Cncl.click();
	 }
}
