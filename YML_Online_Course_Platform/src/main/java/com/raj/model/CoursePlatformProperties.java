package com.raj.model;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "courseplatform")
@Data
public class CoursePlatformProperties {

    private String platformName;
    private String defaultLanguage;
    private double subscriptionFee;
    private boolean active;

    private List<String> supportedLanguages;
    private Map<String, DataSize> storageLimits;

    private Course defaultCourse;
    private List<Course> courses;

    private Map<String, Instructor> instructorDirectory;

    // Nested Classes
    @Data
    public static class Course {
        private String title;
        private Duration duration;   // ✅ FIXED: java.time.Duration
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
