package com.events.example;


import org.fest.assertions.Assertions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class SomeImpotantEventTest extends BaseIntegrationTest{

    public static final String HELLO_WORLD = "Hello World";
    @Autowired
    SomeImportantEventPublisher eventPublisher;

    @Autowired
    ApplicationContext context;


    @Test
    public void shouldRecivedImportandEvent(){
        //given
        final List<String> result = new ArrayList<String>();
        ((AbstractApplicationContext)context).addApplicationListener(new SomeImportantEventListener(){
            public void onApplicationEvent(SomeImportantEvent someImportantEvent){
                result.add(someImportantEvent.getTitle());
            }
        });

        //when
        eventPublisher.publishEntityAttributeChangedEvent(HELLO_WORLD);

        //then
        Assertions.assertThat(result).containsExactly(HELLO_WORLD);
    }
}
