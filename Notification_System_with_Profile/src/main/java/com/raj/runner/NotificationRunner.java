package com.raj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raj.model.Notification;
import com.raj.model.NotificationService;
@Component
public class NotificationRunner implements CommandLineRunner 
{
	@Autowired
	private NotificationService service;
	

	@Override
	public void run(String... args) throws Exception 
	{
		
		Notification n=new Notification(1, "Welcome to Spring Profiles!", "Rajesh");
		service.sendNotification(n);
		

	}

}
