package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonclass.generalmethods;

public class facebooklonpage 
{
	@FindBy(id="email")
	WebElement username;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name="login")
	WebElement loginbutton;
	generalmethods gm = new generalmethods();
	
	WebDriver dr;
	
	public facebooklonpage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	public void uname(String usname)
	{
	//WebElement username = dr.findElement(By.id("email"));
	
		gm.Textenter(username,usname);
	}
	
	public void pwrd(String usnpwd)
	{
		//WebElement password = dr.findElement(By.id("pass"));
	gm.Textenter(password,usnpwd);
	}
	
	public void lgn()
	{
	//WebElement loginbutton = dr.findElement(By.name("login"));
	gm.clickaction(loginbutton);
	}
	
	
	
}
