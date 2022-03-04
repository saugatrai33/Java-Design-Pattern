package com.company.behavioural.chainofresponsibility;

import com.company.behavioural.chainofresponsibility.logger.AbstractLogger;
import com.company.behavioural.chainofresponsibility.logger.ConsoleLogger;
import com.company.behavioural.chainofresponsibility.logger.ErrorLogger;
import com.company.behavioural.chainofresponsibility.logger.FileLogger;

public class ChainPatternDemo {
    public static void main(String[] args) {
        var consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        var errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        var fileLogger = new FileLogger(AbstractLogger.DEBUG);
        errorLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(fileLogger);

        errorLogger.logMessage(AbstractLogger.ERROR, "error.");
        errorLogger.logMessage(AbstractLogger.DEBUG, "debug.");
        errorLogger.logMessage(AbstractLogger.INFO, "info");
    }
}
