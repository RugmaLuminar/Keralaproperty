package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addpropertypage {
	WebDriver driver;
	@FindBy (xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")
	WebElement Addproperty;
	
	@FindBy(xpath="//*[@id=\"proplabel\"]")
	WebElement propertylabel;
	
	@FindBy(xpath="//*[@id=\"propcategory\"]")
	WebElement propertcategry;
	
	@FindBy(xpath="//*[@id=\"district\"]")
	WebElement district;
	
	@FindBy(xpath="//*[@id=\"proplocation\"]")
	WebElement proplocation;
	
	@FindBy(xpath="//*[@id=\"propaddress\"]")
	WebElement propaddress ;
	
	@FindBy(xpath="//*[@id=\"introlabel\"]")
	WebElement propintrolabel ;
	
	
	public Addpropertypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addpropertyclick() throws InterruptedException {
		Thread.sleep(3000);
		Addproperty.click();
		
	}
	public void setvalues(String label,String address,String summary) throws InterruptedException
	{
		propertylabel.sendKeys(label);
		
		Select categ=new Select(propertcategry);
		categ.selectByValue("3");
		Select dist=new Select(district);
		dist.selectByValue("3");
		Thread.sleep(2000);
		Select location=new Select(proplocation);
		location.selectByValue("26");
		propaddress.sendKeys(address);
		propintrolabel.sendKeys(summary);
		
	}


}
