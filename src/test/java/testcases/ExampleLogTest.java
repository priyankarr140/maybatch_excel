package testcases;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.*;


public class ExampleLogTest {
	  private static final Logger log =LogManager.getLogger(ExampleLogTest.class);

	@Test
	void selenium()
	{
		log.debug("browser got launched");
		System.out.println("home page launched");
		log.debug("url has opened");
		System.out.println("login button is clicked");
		log.debug("login button clicked successfully");
		log.error("Exception:Popup has come up unexpectedly");
		
	}

}
