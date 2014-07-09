package test.net.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Stargator
 */
public class Hello {
  static final Logger logger = LogManager.getLogger(Hello.class.getName());

  public boolean callMe() {
    logger.entry();
    logger.error("Inside The Logger!");
    return logger.exit(false);
  }
}
