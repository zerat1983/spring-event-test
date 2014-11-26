package com.events.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SomeImportantEventPublisher {

    @Autowired
    private ApplicationContext context;

    public void publishEntityAttributeChangedEvent(final String title) {
        //If you manage transactions be aware that events should be emit AFTER transaction commit
//        if(TransactionSynchronizationManager.isActualTransactionActive()) {
//            TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {

//                @Override
//                public void afterCommit() {
                    context.publishEvent(new SomeImportantEvent(title));
//                }
//            });
//        }
    }

}
