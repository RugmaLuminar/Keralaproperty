package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import base.Logindetails;
import page.KeralaPropertyHomepage;

public class KeralaPropertyHometest extends Baseclass {
	
	
	@Test
	public void titleverificationtest()
	{
		
		lo.login();
		Reporter.log("login successfull");
		
		String title=home.titleverification();
		Assert.assertEquals(title, "Keralaproperty");
		Reporter.log("title verified");
	}
	@Test
	public void linkcounttest() {
		int linkcount=home.linkcount();
		System.out.println("linkcount="+linkcount);
		Reporter.log("linkcount="+linkcount);
	}

}
