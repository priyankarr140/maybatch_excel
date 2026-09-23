package gsit_may26_excel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class LogExample {

  private static final Logger log =LogManager.getLogger(LogExample.class);

  	public static void main(String[] args) {
					// TODO Auto-generated method stub
	log.debug("DEBUG");
	log.info("INFO");
    log.error("ERROR");
    log.fatal("FATAL");
  
	}

}
