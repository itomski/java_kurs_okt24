package de.lubowiecki.okt24.patterns.singleton;

public class OtherClass {

    public void doSomething() {
        Logger logger = Logger.getInstance();
        logger.log("OtherClass: doSomething...");
    }
}
