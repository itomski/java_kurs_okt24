package de.lubowiecki.okt24.patterns.singleton;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// EagerSingleton
public class Logger {

    private List<String> messages = new ArrayList<>();

    private static Logger instance = new Logger();

    public static Logger getInstance() {
        return instance;
    }

    private Logger() {
    }

    public void log(String message) {
        messages.add(LocalDateTime.now() + ": " + message);
    }

    public void showLog() {
        for(String message : messages) {
            System.out.println(message);
        }
    }
}
