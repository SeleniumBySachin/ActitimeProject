package com.zohocrm.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.HomePage;
@Listeners(com.zohocrm.generic.ListenersImplementation.class)
public class CreateCampaign extends BaseClass{
	@Test
	public void testCreateCampaign() {
		Reporter.log("CreateCampaign",true);
		HomePage h=new HomePage(driver);
		//h.setCampaign();
		
	}
}
