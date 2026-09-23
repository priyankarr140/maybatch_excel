package testcases;
import org.testng.annotations.*;
public class GroupTest {
	
	@Test(groups="smoke")
	void login()
	{
		System.out.println("Login");
	}
	@Test(groups="smoke")
	void logout()
	{
		System.out.println("Logout");
	}
	@Test
	void payment()
	{
		System.out.println("Payment");
	}
	

}
