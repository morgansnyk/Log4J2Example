package test.net.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for a utility class
 */
public class HelloTest {

    /**
     * Tests results of a method
     */
    @Test
    public void testCallMe() {
        Hello helloClass = new Hello();

        assertEquals(false, helloClass.callMe());
        // TODO: Read generated log file for the trace log messages
    }
}