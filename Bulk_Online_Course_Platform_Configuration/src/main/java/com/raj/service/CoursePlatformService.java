package com.raj.service;

import org.springframework.stereotype.Service;


import com.raj.sbeans.CoursePlatform;

@Service
public class CoursePlatformService {

    private final CoursePlatform props;

    public CoursePlatformService(CoursePlatform props) {
        this.props = props;
    }

    public void printDefaultCourseDetails() {
    	System.out.println("===   CoursePlatform === ");
    	System.err.println("platformName :-"+props.getPlatformName());
    	System.err.println("defaultLanguage :-"+props.getDefaultLanguage());
    	System.err.println("active :-"+props.isActive());
    	System.err.println(" subscriptionFee :- "+props.getSubscriptionFee());
    	
        System.out.println("=== Default Course Details ===");
        System.out.println("Title: " + props.getDefaultCourse().getTitle());
        System.out.println("Instructor: " + props.getDefaultCourse().getInstructor());
        System.out.println("Duration: " + props.getDefaultCourse().getDuration());
        System.out.println("Price: " + props.getDefaultCourse().getPrice());
        System.out.println();
    }

    public void listSupportedLanguages() {
        System.out.println("=== Supported Languages ===");
        props.getSupportedLanguages().forEach(lang -> System.out.println("- " + lang));
        System.out.println();
    }

    public void listAllCourses() {
        System.out.println("=== Available Courses ===");
        props.getCourses().forEach(course -> {
            System.out.println(course.getTitle() + " | Instructor: " + course.getInstructor()
                    + " | Duration: " + course.getDuration() + " | Price: " + course.getPrice());
        });
        System.out.println();
    }
}

	
	
	
