# Log4J2Example
==============

Test Application to run Log4J2 in a Maven and Gradle project

**Note**: this has only been tested on Ubuntu 16.04, not on a Mac or Windows Machine)

## Maven Project

Build the project's jar file:
`mvn package -U`

Then run the application:
`mvn exec:java`

## Gradle Project

Build the project's jar file:
`gradle build`

Then run the application:
`gradle run`

## Results

You should see the creation of a logs directory in the root of the project.

Inside the logs directory should exist test.log (which will be appended each time the application is executed).

The contents of test.log should resemble the following:
```bash
2014-07-08 20:09:31,022 TRACE [main] test.net.util.Log4j2Example (Log4j2Example.java:18) - Entering Log4j Example.
2014-07-08 20:09:31,026 TRACE [main] test.net.util.Hello (Hello.java:16) - Enter
2014-07-08 20:09:31,026 ERROR [main] test.net.util.Hello (Hello.java:17) - Inside The Logger!
2014-07-08 20:09:31,027 TRACE [main] test.net.util.Hello (Hello.java:18) - Exit with(false)
2014-07-08 20:09:31,027 ERROR [main] test.net.util.Log4j2Example (Log4j2Example.java:22) - Failing Now!
2014-07-08 20:09:31,027 TRACE [main] test.net.util.Log4j2Example (Log4j2Example.java:25) - Exiting Log4j Example.
```

## Contributors
Checkout the [Issues](https://github.com/Stargator/Log4J2Example/issues)