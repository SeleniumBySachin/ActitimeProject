package com.zohocrm.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zohocrm.generic.BaseClass;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaignBtn;
	//@FindBy(xpath="//a[text()='Logout [rashmi@dell.com]'and@class='topLink']")
	private WebElement logoutLink;
    
	public HomePage(WebDriver driver) {
		logoutLink=driver.findElement(By.xpath("//a[text()='Logout [rashmi@dell.com]'and@class='topLink']"));
	}
	
	public WebElement getLogout() {
		return logoutLink;
	}
	public void setCampaign() {
		campaignBtn.click();
	}
}
