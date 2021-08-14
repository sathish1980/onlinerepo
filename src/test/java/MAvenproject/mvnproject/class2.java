package MAvenproject.mvnproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class2 
{

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this is before class in class 2");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("this is after class in class 2");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("this is testcase1 in class 2");
	}
}
