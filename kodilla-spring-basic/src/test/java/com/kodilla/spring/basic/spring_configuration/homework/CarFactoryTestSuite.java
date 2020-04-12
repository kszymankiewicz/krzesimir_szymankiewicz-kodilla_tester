package com.kodilla.spring.basic.spring_configuration.homework;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CarFactoryTestSuite {

    //Given
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

    @Test
    public void testSedanCreated() {
        //given
        Sedan sedan = context.getBean(Sedan.class);
        //when
        String car = sedan.getCarType();
        //then
        Assertions.assertEquals("Sedan",car);
    }

    @Test
    public void testSuvCreated() {
        //given
        SUV suv = context.getBean(SUV.class);
        //when
        String car = suv.getCarType();
        //then
        Assertions.assertEquals("SUV",car);
    }

    @Test
    public void testCabrioCreated() {
        //given
        Cabrio cabrio = context.getBean(Cabrio.class);
        //when
        String car = cabrio.getCarType();
        //then
        Assertions.assertEquals("Cabrio",car);


    }

}