package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class KeralaPropertyHomepage {
	public WebDriver driver;
	
	public KeralaPropertyHomepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public String titleverification()
	{
	 String title= driver.getTitle();
	 
		return title;
	}
	
	
	public int linkcount()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		return li.size();
		
	}

}
