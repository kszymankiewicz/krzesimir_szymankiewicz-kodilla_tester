package com.kodilla.spring.basic.spring_dependency_injection.home_work;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DHLNotificationService implements NotificationService{

    @Override
    public String success(String address) {

        return "Package delivered to: " + address;
    }

    @Override
    public String fail(String address) {
        return "Package not delivered to: " + address;
    }
}
