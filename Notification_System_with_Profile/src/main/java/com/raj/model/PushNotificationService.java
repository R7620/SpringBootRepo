package com.raj.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class PushNotificationService implements NotificationService 
{
    @Override
    public void sendNotification(Notification n) 
    {
        System.out.println("Sending Push Notification to " + n.getRecipient() + ": " + n.getMessage());
    }
}