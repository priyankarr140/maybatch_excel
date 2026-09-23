package testcases;
import org.testng.annotations.*;
public class PriorityTest {
	
	@Test(priority=2)
	void methodA()
	{
		System.out.println("method A");
	}
	@Test(priority=0)
	void methodC()
	{
		System.out.println("method C");
	}
	@Test(priority=1)
	void methodB()
	{
		System.out.println("method B");
	}

}
