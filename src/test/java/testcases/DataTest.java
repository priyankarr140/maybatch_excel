package testcases;
import org.testng.annotations.*;
public class DataTest {
	
	@Test(dataProvider="getData")
	void login(String username,String password,String city)
	{
		System.out.println(username+":"+password+":"+city);
	}
	@DataProvider
	Object[][] getData()
	{
		Object[][]data= {{"user1","pass1","Delhi"},{"user2","pass2","Pune"},
				{"user3","pass3","Chennai"}};
		/*data[0][0][0]="user1";
		data[0][1][]="pass1";
		data[1][0]="user2";
		data[1][1]="pass2";
		data[2][0]="user3";
		data[2][1]="pass3";*/
		return data;
	}
	
	

}
