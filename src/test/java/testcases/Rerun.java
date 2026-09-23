package testcases;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class Rerun implements IRetryAnalyzer{

	 int num=2;
	@Override
	public boolean retry(ITestResult result) {
		if(num>0)
		{
			System.out.println("Retrying...");
			num--;
			return true;
			
		}
		else
			return false;
	}

}
