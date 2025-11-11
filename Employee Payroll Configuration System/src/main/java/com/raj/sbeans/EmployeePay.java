package com.raj.sbeans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@ConfigurationProperties(prefix = "org.raj")
@Data
public class EmployeePay {

    // Simple values
    private String companyName;
    private String currency;
    private double taxRate;
    private boolean overtimeEnabled;

    // Collections
    private List<String> departments;
    private Map<String, Double> salaryBands;

    // Nested object
    private HolidayPolicy policy;

    // List of objects
    private List<Benefits> benefits;

//    // -------- Nested Classes --------
//    @Data
//    public static class HolidayPolicy {
//        private int maxLeaves;
//        private boolean carryForward;
//        private int paidLeaves;
//    }

//    @Data
//    public static class Benefit {
//        private String name;
//        private String description;
//        private double amount;
//    }
}
