package ftm.mailclienttest.reporting;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import ftm.mailclienttest.reporting.MyLogger;

public class LogLevel {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(MyLogger.class);
		
		logger.setLevel(Level.TRACE);
		
		logger.debug("some trash info");
		logger.debug("some trash info");
		logger.debug("some trash info");
		logger.debug("some trash info");
		logger.debug("some trash info");

		logger.error("very important info");
	}
}