package com.events.example;

import org.springframework.context.ApplicationListener;

/**
 * Created by zielinp2 on 2014-11-26.
 */

public class SomeImportantEventListener implements ApplicationListener<SomeImportantEvent> {
    @Override
    public void onApplicationEvent(SomeImportantEvent someImportantEvent) {
        System.out.print("I just got a event "+someImportantEvent.getTitle());
    }
}
