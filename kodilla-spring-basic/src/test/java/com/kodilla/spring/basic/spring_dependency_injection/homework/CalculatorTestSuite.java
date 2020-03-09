package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddNumbersAndShouldReturnValue() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        double sum = calculator.add(2.0, 2.0);
        //then
        Assertions.assertEquals(4.0, sum);

    }

    @Test
    public void testSubtractNumbersAndShouldReturnValue() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        double subtract = calculator.subtract(4.0, 3.0);
        //then
        Assertions.assertEquals(1.0, subtract);
    }

    @Test
    public void testMultiplyNumbersAndShouldReturnValue() {

        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        double multiply = calculator.multiply(2.0, 3.0);
        //then
        Assertions.assertEquals(6.0, multiply);
    }

    @Test
    public void testDivideNumbersAndShouldReturnValue() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculator = context.getBean(Calculator.class);
        //when
        double divide = calculator.divide(4.4, 2.2);
        //then
        Assertions.assertEquals(2.0, divide);
    }
}