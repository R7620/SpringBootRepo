package com.raj.sbeans;

import lombok.Data;

@Data
public class HolidayPolicy {
    private int maxLeaves;      // maps to org.raj.policy.maxLeaves
    private boolean carryForward; 
    private int paidLeaves;     // maps to org.raj.policy.paidLeaves
}
