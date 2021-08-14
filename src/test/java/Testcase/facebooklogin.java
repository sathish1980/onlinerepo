package Testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;

import MAvenproject.mvnproject.excelread;
import commonclass.Browser;
import commonclass.generalmethods;
import pages.facebooklogourpage;
import pages.facebooklonpage;

public class facebooklogin extends Browser 
{
	
	excelread ex= new excelread();
	String filepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\02082021mvnproject\\inputfiles\\";
	String fileName="fblogin.xls";
	String sheetName="Sheet1";
@BeforeSuite
	public void launch()
	{
	launchbrowser("firefox");
	}

@BeforeTest
public void URL()
{
dr.get("https://www.facebook.com/");
}
@Test(dataProvider="datareadfromexcel")
public void firsttestcase(String usname,String pasword)
{
	generalmethods cs = new generalmethods();
	facebooklonpage fc= new facebooklonpage(dr);
	try
	{
		fc.uname(usname);
		fc.pwrd(pasword);
		fc.lgn();
	String reportpath =cs.capture(dr);
	facebooklogourpage fb = new facebooklogourpage(dr);
	fb.logoutdropdown();
	fb.signout();
	
	//et.log(LogStatus.PASS,"This is a sucess message");
	//et.log(LogStatus.PASS,);
	et.log(LogStatus.PASS,et.addScreenCapture(reportpath));
	}
	catch(Exception e)
	{
	et.log(LogStatus.FAIL,"Login not sucess: "+ e);
	}
	
}

@DataProvider
public String[][] datareadfromexcel() throws IOException
{
	
		return ex.excelreaddata(filepath,fileName,sheetName);
	
}

@AfterSuite
public void teardown()
{
	dr.quit();
	er.endTest(et);
	er.flush();
}
}
