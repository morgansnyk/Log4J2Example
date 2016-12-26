package test.net.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Stargator
 */
class Hello {
    private static final Logger logger = LogManager.getLogger(Hello.class.getName());

    /*
     * callMe demonstrates the logging process
     */
    boolean callMe() {
        logger.traceEntry();
        logger.error("Inside The Logger!");
        return logger.traceExit(false);
    }
}
