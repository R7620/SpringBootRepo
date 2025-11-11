package com.raj.sbeans;

import java.util.List;
import java.util.Map;
import java.time.Duration;   // ✅ Correct import

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@ConfigurationProperties(prefix = "org.raj.courseplatform")
@Data
public class CoursePlatform {

    private String platformName;
    private String defaultLanguage;
    private boolean active;
    private double subscriptionFee;

    private List<String> supportedLanguages;
    private Map<String, String> storageLimits;

    private DefaultCourse defaultCourse;
    private List<Course> courses;
    private Map<String, Instructor> instructorDirectory;

    @Data
    public static class DefaultCourse {
        private String title;
        private Duration duration;   
        private String instructor;
        private double price;
    }

    @Data
    public static class Course {
        private String title;
        private Duration duration;   
        private String instructor;
        private double price;
        private List<String> tags;
    }

    @Data
    public static class Instructor {
        private String name;
        private String expertise;
        private double rating;
        private String bio;
    }
}
