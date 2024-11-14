package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page.Addpropertypage;
import page.KeralaPropertyHomepage;

public class Baseclass {
public static	WebDriver driver;
public Logindetails lo;
public KeralaPropertyHomepage home;
public Addpropertypage propertypage;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		
	}
	
	@BeforeMethod
	public void beforemthd()
	{
		lo=new Logindetails(driver);
		home=new KeralaPropertyHomepage(driver);
		propertypage=new Addpropertypage(driver);
	}
	

}
