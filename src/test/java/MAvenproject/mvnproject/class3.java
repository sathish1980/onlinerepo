package MAvenproject.mvnproject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class3 
{
	@Test
	public void testcase1()
	{
		System.out.println("this is testcase1 in class 3");

	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("this is after test");
	}
}
