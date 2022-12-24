package Logging_Project_23_12_22;

import java.util.logging.Logger;

public class TestA {
    public static void main(String[] args) {
        //Logger logger = Logger.getLogger(TestA.class.getName());
        //Logger logger1= Logger.getLogger("com.api.jar");
        Logger logger = Logger.getLogger(TestA.class.getName());
        //logger.setLevel(Level.FINE);

        logger.info("This is message 1");
        logger.info("this is message 2");
    }
}
