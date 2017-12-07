package com.game.spring.core;

import java.io.IOException;

public interface EventLogger {
    void logEvent(Event e) throws IOException;
}
