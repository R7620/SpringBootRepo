package com.raj.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
		@Profile("dev")
		public class EmailNotificationService implements NotificationService 
		{
		    @Override
		    public void sendNotification(Notification n) 
		    {
		        System.out.println("Sending Email to " + n.getRecipient() + ": " + n.getMessage());
		   	}

}
