package com.ranfordbank.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRoleHP {
	
	@FindBy(id="btnRoles")
	WebElement NewRbtn;
	
	@FindBy(xpath=".//*[@id='Table_01']/tbody/tr/td[1]/a/img")
	WebElement HmBtn;
	
	public void NewBtnClick(){
		NewRbtn.click();
	}
	public void HmBtnClick(){
		HmBtn.click();
	}
}
