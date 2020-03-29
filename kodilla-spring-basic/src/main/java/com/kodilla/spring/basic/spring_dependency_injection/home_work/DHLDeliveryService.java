package com.kodilla.spring.basic.spring_dependency_injection.home_work;

import org.springframework.stereotype.Component;

@Component
public class DHLDeliveryService implements DeliveryService {
    @Override
    public boolean deliverPackage(String address, double weight) {
        if (weight > 35) {
            System.out.println("Package too heavy");
            return false;
        }

        System.out.println("Delivering in progress...");
        return true;
    }
}
