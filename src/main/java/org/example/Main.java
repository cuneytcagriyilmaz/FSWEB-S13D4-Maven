package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan healthplan = new Healthplan(1, "Cagri HealthPlan ", Plan.BASIC);
        System.out.println(healthplan);

        String[] healthPlans = new String[3];
        Employee employee = new Employee(1, "cagri", "cagri@example.com", "123456", healthPlans);
        employee.addHealthPlan(0, "Plan1");
        employee.addHealthPlan(1, "Plan2");
        employee.addHealthPlan(2, "Plan3");
        System.out.println(employee);

        String[] developerNames = new String[5];
        Company company = new Company(1, "Cagri Company", 10000.0, developerNames);
        company.addEmployee(0, "cuneyt");
        company.addEmployee(1, "yilmaz");
        System.out.println(company);
    }
}