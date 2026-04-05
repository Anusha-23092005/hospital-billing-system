package com.hospital;

import java.util.List;

public class BillingService {

    public double calculateTotal(List<Service> services) {
        double total = 0;

        for (Service s : services) {
            if (s.getCost() < 0) {
                throw new IllegalArgumentException("Invalid service cost");
            }
            total += s.getCost();
        }

        return total;
    }
}