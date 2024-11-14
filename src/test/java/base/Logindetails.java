package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Logindetails {
 WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"ulogin\"]")
	WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]")
	WebElement loginbutton;
	
	public Logindetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void login() {
		
		username.sendKeys("rugma@gmail.com");
		password.sendKeys("123456");
		loginbutton.click();
		
	}

}
