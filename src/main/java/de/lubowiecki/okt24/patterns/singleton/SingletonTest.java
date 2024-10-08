package de.lubowiecki.okt24.patterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Main....");

        machWas();

        OtherClass oc = new OtherClass();
        oc.doSomething();

        logger.showLog();
    }

    private static void machWas() {
        // Logger logger = Logger.getInstance();
        // logger.log("machWas...");
        Logger.getInstance().log("machWas...");
    }
}
