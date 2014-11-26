package com.events.example;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zielinp2 on 2014-11-26.
 */
public class SomeImportantEvent extends ApplicationEvent{

    private String title = "Aloha";


    public SomeImportantEvent(String title) {
        super(SomeImportantEvent.class.getName());
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
