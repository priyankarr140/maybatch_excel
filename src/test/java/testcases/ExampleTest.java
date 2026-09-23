package testcases;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;
public class ExampleTest {
	
	@Test
	void methodA()
	{
		System.out.println("method A");
		Assert.assertTrue(false);
	}
	@Test(enabled=false)
	void methodB()
	{
		System.out.println("method B");
	}
	@Test//(retryAnalyzer=Rerun.class)
	void methodC()
	{
		
		System.out.println("method C");
		int num=10/0;
	}
	@Test
	void checkin()
	{
		System.out.println("check in");
		Assert.assertFalse(true);
	}
	@Test(dependsOnMethods="checkin")
	void checkout()
	{
		System.out.println("check out");
	}
	@Test(timeOut=3000)
	void data() throws InterruptedException
	{
		System.out.println("Data");
		Thread.sleep(4000);
	}
	
	@Parameters({"username","password"})
	@Test
	void login(String username,String password)
	{
		System.out.println("Login:"+username+":"+password);
	}
	
	
	

}
