package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService dhlDeliveryService = new DHLDeliveryService();
        NotificationService dhlNotificationService = new DHLNotificationService();
        ShippingCenter dhlShippingCenter = new ShippingCenter(dhlDeliveryService, dhlNotificationService);
        dhlShippingCenter.sendPackage("Hill Street 11, New York", 18.2);

        DeliveryService glsDeliveryService = new GLSDeliveryService();
        NotificationService glsNotificationService = new GLSNotificationService();
        ShippingCenter glsShippingCenter = new ShippingCenter(glsDeliveryService, glsNotificationService);
        glsShippingCenter.sendPackage("Green Street 11, New York", 14.2);

        DeliveryService upsDeliveryService = new UPSDeliveryService();
        NotificationService upsNotificationService = new UPSNotificationService();
        ShippingCenter upsShippingCenter = new ShippingCenter(upsDeliveryService, upsNotificationService);
        upsShippingCenter.sendPackage("Green Street 11, New York", 14.2);


    }
}
