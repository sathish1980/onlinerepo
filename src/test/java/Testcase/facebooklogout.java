package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commonclass.Browser;
import commonclass.generalmethods;

public class facebooklogout extends Browser
{
	generalmethods cs = new generalmethods();
	
	
	public void logoutdropdown()
	{
		try
		{
	cs.elementclickable(dr,By.xpath("//div[@aria-label='Account']"));
	WebElement logoutdpdown=dr.findElement(By.xpath("//div[@aria-label='Account']"));
	cs.clickaction(logoutdpdown);
	et.log(LogStatus.PASS,"Signout dropdown");
		}
		catch(Exception e)
		{
			et.log(LogStatus.FAIL,e);
		}
	
	}
	
	
	public void signout() 
	{
		try
		{
	cs.elementclickable(dr,By.xpath("//span[text()='Log Out']//ancestor::div[2]"));
	WebElement sigoutbutton=dr.findElement(By.xpath("//span[text()='Log Out']//ancestor::div[2]"));
	cs.clickaction(sigoutbutton);
	et.log(LogStatus.PASS,"sign out scucessfull");
	}
	catch(Exception e)
	{
		et.log(LogStatus.FAIL,e);
	}

	}	
}
