package com.raj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.model.CoursePlatformProperties;

@Service
public class CoursePlatformService {

    @Autowired
    private CoursePlatformProperties props;

    public void showDefaultCourse()
    {
        System.out.println("=== Default Course ===");
        var c = props.getDefaultCourse();
        System.out.println("Title: " + c.getTitle());
        System.out.println("Duration: " + c.getDuration());
        System.out.println("Instructor: " + c.getInstructor());
        System.out.println("Price: ₹" + c.getPrice());
        System.out.println();
    }

    public void showSupportedLanguages() {
        System.out.println("=== Supported Languages ===");
        props.getSupportedLanguages().forEach(System.out::println);
        System.out.println();
    }

    public void showCourses() {
        System.out.println("=== Available Courses ===");
        props.getCourses().forEach(c ->
                System.out.println(c.getTitle() + " (" + c.getDuration() + ") - ₹" + c.getPrice() +
                        " [Instructor: " + c.getInstructor() + "]"));
        System.out.println();
    }

    public void showInstructors() {
        System.out.println("=== Instructor Directory ===");
        props.getInstructorDirectory().forEach((key, ins) -> {
            System.out.println(ins.getName() + " (" + ins.getExpertise() + ")");
            System.out.println("Rating: " + ins.getRating());
            System.out.println("Bio: " + ins.getBio());
            System.out.println();
        });
    }
}