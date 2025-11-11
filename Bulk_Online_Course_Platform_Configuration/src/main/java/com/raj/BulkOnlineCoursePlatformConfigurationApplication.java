package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.service.CoursePlatformService;

@SpringBootApplication
public class BulkOnlineCoursePlatformConfigurationApplication {

	public static void main(String[] args) {
	  try(ConfigurableApplicationContext ctx =	 SpringApplication.run(BulkOnlineCoursePlatformConfigurationApplication.class, args);)
	  {
		  CoursePlatformService service = ctx.getBean(CoursePlatformService.class);
		  service.printDefaultCourseDetails();
		  service.listSupportedLanguages();
		  service.listAllCourses();
		  
	  }
	  catch(Exception  e) {
		  e.printStackTrace();
		  e.toString();
		  e.getMessage();
		  
		  
	  }
	}

}
