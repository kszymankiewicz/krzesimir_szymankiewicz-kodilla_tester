package com.kodilla.spring.basic.spring_dependency_injection.home_work;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShippingCenterTest {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

  @Test
    public void shouldReturnCorrectMessageWhenPackageToHeavy() {
        //given
        DHLDeliveryService bean = context.getBean(DHLDeliveryService.class);
        //when
        boolean delivery = bean.deliverPackage("Testing address", 36);
        //then
        Assertions.assertEquals("Package too heavy", delivery);
    }

   @Test
    public void shouldReturnCorrectMessageWhenPackageGetGoodWeight() {
        //given
        DHLDeliveryService bean = context.getBean(DHLDeliveryService.class);
        //when
        boolean delivery = bean.deliverPackage("Testing address", 35);
        //then
        Assertions.assertEquals("Delivering in progress...", delivery);
    }

   @Test
    public void shouldReturnCorrectMessageWhenPackageDelivered(){
        //given
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        //when
         Object success = bean.sendPackage("Test address",35);
         //then
        Assertions.assertEquals("Package delivered to: Test address",success);
    }
    @Test
    public void shouldReturnCorrectMessageWhenPackageNotDelivered(){
        //given
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        //when
        Object fail = bean.sendPackage("Test address",36);
        //then
        Assertions.assertEquals("Package not delivered to: Test address",fail);
    }
}