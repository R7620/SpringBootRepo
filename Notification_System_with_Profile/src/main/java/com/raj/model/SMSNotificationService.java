package com.raj.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(Notification n) {
        System.out.println("Sending SMS to " + n.getRecipient() + ": " + n.getMessage());
    }
}