package com.hospital;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BillingService billingService = new BillingService();

        List<Service> services = Arrays.asList(
                new Service("Consultation", 500),
                new Service("Lab Test", 1000),
                new Service("X-Ray", 800)
        );

        double total = billingService.calculateTotal(services);

        System.out.println("Hospital Billing System Started");
        System.out.println("Total Bill: " + total);
    }
}