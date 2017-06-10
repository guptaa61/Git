package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {

	@Test
	public void test()
	
	{
		System.out.println("test successful");
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("Before test run successfully");
	}
	
	@AfterTest
	
	public void logout()
	
	{
		System.out.println("After test run successfulyy");
	}
}
