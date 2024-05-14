package org.example;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class LoggerExample {
    private static final Logger logger = LogManager.getLogger(LoggerExample.class);

    public static void main(String[] args) {
        PropertyConfigurator.configure("C:\\Users\\shrav\\IdeaProjects\\JavaTrainingMaven\\src\\main\\resources\\log4j.properties");
        logger.debug("Debugging");
        try {
            // Simulating an error
            int result = 1 / 0;
        } catch (Exception e) {
//            logger.error("Exception occurred: " + e.getMessage()); // Log the error message
            logger.error("Stack trace:", e); // Log the error stack trace
        }
    }
}
