package org.example;

import org.slf4j.*;

public class Calculator {
    private static final Logger log= LoggerFactory.getLogger(Calculator.class);
    public static int add(int a,int b)
    {
        log.info("On Adding {} and {} we got {}",a,b,a+b);
        log.warn("This is log Warning");
        log.debug("This is log Debugging");
        log.error("This is log Error");
        return a+b;
    }
}
