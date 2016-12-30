package test.net.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Stargator
 * Based on the following article: http://javabeat.net/log4j-2-example/
 */
public class Log4j2Example {
    private static final Logger logger = LogManager.getLogger(Log4j2Example.class.getName());

    Log4j2Example() {}

    /**
     * This is the main function running all the steps of the example
     * @param args - contains all the arguments passed
     */
    public static void main(String[] args) {
        logger.trace("Entering Log4j Example.");
        Hello hello = new Hello();

        if (!hello.callMe()) {
            logger.error("Failing Now!");
        }

        logger.trace("Exiting Log4j Example.");
    }
}
