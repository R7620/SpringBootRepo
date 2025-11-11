package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raj.service.PayrollService;

@SpringBootApplication
public class ProjBulkinjectionApplication 
{

    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext ctx = SpringApplication.run(ProjBulkinjectionApplication.class, args);
            PayrollService service = ctx.getBean(PayrollService.class);
            service.displayPayroll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
