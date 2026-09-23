package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test
	void methodA() throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");	
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	void methodB() throws Exception
	{   
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");	
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	void methodC() throws Exception
	{
		ChromeDriver	 driver=new ChromeDriver();
		driver.get("https://www.engineerdiaries.com/");
		Thread.sleep(3000);
		driver.close();
	
	}

}
