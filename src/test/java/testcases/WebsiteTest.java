package testcases;
import org.testng.annotations.*;
public class WebsiteTest {
	
	@BeforeSuite
	void beforeSuite()
	{
		System.out.println("BEFORE SUITE:");
	}
	@AfterSuite
	void afterSuite()
	{
		System.out.println("AFTER SUITE:");
	}
	@BeforeTest
	void beforeTest()
	{
		System.out.println("BEFORE TEST:");
	}
	@AfterTest
	void afterTest()
	{
		System.out.println("AFTER Test:");
	}
	@BeforeClass
	void beforeClass()
	{
		System.out.println("BEFORE CLASS:");
	}
	@AfterClass
	void afterClass()
	{
		System.out.println("AFTER CLASS:");
	}
	@BeforeMethod
	void beforeMethod()
	{
		System.out.println("BEFORE Method:");
	}
	@AfterMethod
	void afterMethod()
	{
		System.out.println("AFTER Method:");
	}
	
	
	@Test
	void homepage()
	{
		System.out.println("Home Page");
	}
	
	@Test
	void contactUs()
	{
		System.out.println("Contact Us");
	}

}
