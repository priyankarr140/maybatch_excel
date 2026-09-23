package testcases;
import org.testng.Assert;
import org.testng.*;
import org.testng.asserts.*;

import org.testng.annotations.*;
public class MobileTest {
	
	@Test
	void switchOn()
	{
		boolean result=false;
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(result);
		// assert and verify
		//hard assertion and soft assertion
		//Assert.assertTrue(result);//HARD ASSERTION
		System.out.println("SWITCH ON");
		soft.assertAll();
	}
	
	@Test
	void switchOff()
	{
		try{
			int num=10/0;
			System.out.println("SWITCH OFF");
		}
		catch(Exception ex)
		{
			
		}
		
	}
	

}
