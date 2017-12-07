package com.game.spring.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Date;

public class App {

    public App(Client client, FileEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public Client client;
    public FileEventLogger eventLogger;        
    
    public static void main(String[] args) throws IOException {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");               
        App app = (App) context.getBean("app");        
        
        app.logEvent(new Event(new Date()));
        
        context.close();
        
    }

    private void logEvent(Event event) throws IOException {
        this.eventLogger.logEvent(event);
    }

}
