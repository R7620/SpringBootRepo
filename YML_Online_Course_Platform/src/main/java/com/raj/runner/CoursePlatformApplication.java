package com.raj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.raj.service.CoursePlatformService;
@Component
public class CoursePlatformApplication implements CommandLineRunner  
{
	@Autowired
	private CoursePlatformService  service;

	@Override
	public void run(String... args) throws Exception 
	{
		service.showDefaultCourse();
        service.showSupportedLanguages();
        service.showCourses();
        service.showInstructors();
		
	}

}
