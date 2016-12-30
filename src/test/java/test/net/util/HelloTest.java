package test.net.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

    @Test
    public void testCallMe() throws Exception {
        Hello helloClass = new Hello();

        assertEquals(false, helloClass.callMe());
        // TODO: Read generated log file for the trace log messages
    }
}