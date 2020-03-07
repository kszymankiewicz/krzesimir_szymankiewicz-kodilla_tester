package com.kodilla.spring.basic.spring_dependency_injection.home_work;

import com.kodilla.spring.basic.dependency_injection.homework.DeliveryService;
import com.kodilla.spring.basic.dependency_injection.homework.NotificationService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ShippingCenter {
    @Resource(name = "DHLNotificationService")

    private DeliveryService deliveryService;
    private NotificationService notificationService;


    public Object sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
