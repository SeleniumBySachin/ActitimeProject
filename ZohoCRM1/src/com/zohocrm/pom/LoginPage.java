package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.generic.BaseClass;

public class LoginPage  {
	@FindBy(id="userName")
	private WebElement untbx;
	@FindBy(id="passWord")
	private WebElement pwtbx;
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signInBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		signInBtn.click();
	}

}
