package MAvenproject.mvnproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampletestng 
{
	
	
	@AfterSuite(alwaysRun=true)
	public void aftersuite()
	{
		System.out.println("this is after Suite");
	}
	
	@BeforeTest(alwaysRun=true)
	public void beforetest()
	{
		System.out.println("this is before test");
	}
	
	
	
	
	@BeforeClass(alwaysRun=true)
	public void beforeclass()
	{
		System.out.println("this is before class");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterclass()
	{
		System.out.println("this is after class");
	}
	
	@BeforeSuite(alwaysRun=true)
	public void beforesuite()
	{
		System.out.println("this is before Suite");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void beforemethod()
	{
		System.out.println("this is before method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("this is after method");
	}
	
	@Test(groups= {"sanity","SIT"},priority=1,alwaysRun=false,dependsOnMethods="testcase2",description="NAme",enabled=true,invocationCount=3,invocationTimeOut=60,successPercentage=70,timeOut=10)
	public void testcase1()
	{
		System.out.println("this is testcase1");
	}
	
	@Test(priority=0,groups= {"sanity","SIT"})
	public void testcase2()
	{
		System.out.println("this is testcase2");
	}
	
	@Test(priority=2,groups="SIT")
	public void testcase3()
	{
		System.out.println("this is testcase3");
	}
	
}
