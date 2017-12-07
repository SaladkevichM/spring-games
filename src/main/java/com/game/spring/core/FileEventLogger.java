package com.game.spring.core;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {

    final String filename = "D:/1.txt";
    
    public void init() throws IOException {
        File file = new File(filename);
        file.canWrite();
    }
    
    public void logEvent(Event e) throws IOException {        
       FileUtils.writeStringToFile(new File(filename), e.toString(), true);       
    }

}
