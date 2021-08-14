package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import commonclass.generalmethods;

public class facebooklogourpage 
{
WebDriver dr;
generalmethods cs = new generalmethods();

public facebooklogourpage(WebDriver dr)
{
this.dr=dr;	
}
	public void logoutdropdown()
	{
		
	cs.elementclickable(dr,By.xpath("//div[@aria-label='Account']"));
	WebElement logoutdpdown=dr.findElement(By.xpath("//div[@aria-label='Account']"));
	cs.clickaction(logoutdpdown);
	
		
	}
	
	
	public void signout() 
	{
		
	cs.elementclickable(dr,By.xpath("//span[text()='Log Out']//ancestor::div[2]"));
	WebElement sigoutbutton=dr.findElement(By.xpath("//span[text()='Log Out']//ancestor::div[2]"));
	cs.clickaction(sigoutbutton);
	
	}	
}
