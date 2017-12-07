package com.game.spring.core;

public class ConsoleEventLogger implements EventLogger {

    public void logEvent(Event e) {
        System.out.println(e.toString());
    }
    
}
