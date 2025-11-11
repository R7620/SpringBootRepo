package com.raj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.raj.sbeans.EmployeePay;

@Component
public class PayrollService {

    private final EmployeePay pay;

    @Autowired
    public PayrollService(EmployeePay pay) {
        this.pay = pay;
    }

    public void displayPayroll() {
        System.out.println("=== Payroll Configuration ===");
        System.out.println("Company: " + pay.getCompanyName());
        System.out.println("Currency: " + pay.getCurrency());
        System.out.println("Tax Rate: " + pay.getTaxRate());
        
        // Update Overtime
        pay.setOvertimeEnabled(false);
        System.out.println("Overtime Enabled: " + pay.isOvertimeEnabled());

        System.out.println("-----------------------------");
        System.out.println("Departments: " + pay.getDepartments());
        System.out.println("Salary Bands: " + pay.getSalaryBands());
        System.out.println("Benefits: " + pay.getBenefits());
        System.out.println("Holiday Policy: " + pay.getPolicy());
    }
}
