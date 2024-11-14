package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import base.Baseclass;

public class Addpropertytest extends Baseclass {
	
	
	@Test
	public void setvaluesproperty() throws InterruptedException
	{
		
		propertypage.addpropertyclick();
		Reporter.log("inside property page");
		propertypage.setvalues("abc", "trinity", "good");
		Reporter.log("all values are inserted");
		
		
		
	}
}
