package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class SeleniumTest {
	ChromeDriver driver;
	@BeforeMethod
	void setup() throws Exception
	{
		 driver=new ChromeDriver();
		driver.manage().window().maximize();

	}
	@AfterMethod
	void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.close();
	}	
	@Test
	void methodA() throws Exception
	{
		driver.get("https://www.geeksforgeeks.org/");	
	}
	@Test
	void methodB() throws Exception
	{		
		driver.get("https://www.amazon.in/");		
	}
	@Test
	void methodC() throws Exception
	{
		
		driver.get("https://www.engineerdiaries.com/");
	
	}

}
