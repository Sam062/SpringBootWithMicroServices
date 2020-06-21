package base;

import org.apache.log4j.Logger;

public class TestClass {

	private static Logger logger=Logger.getLogger(TestClass.class);
	public static void main(String[] args) {
		logger.info("INFO");
		logger.debug("DEBUG");
		logger.warn("WARN");
		logger.error("ERROR");
	}

}
