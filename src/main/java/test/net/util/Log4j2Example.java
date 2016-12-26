package test.net.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Stargator
 */
public class Log4j2Example {
    static final Logger logger = LogManager.getLogger(Log4j2Example.class.getName());

    private Log4j2Example() {}

    public static void main(String[] args) {

        logger.trace("Entering Log4j Example.");
        Hello hello = new Hello();
        if (!hello.callMe()) {
            logger.error("Failing Now!");
        }
        logger.trace("Exiting Log4j Example.");
    }
}
