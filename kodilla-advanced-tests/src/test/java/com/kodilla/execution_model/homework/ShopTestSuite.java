package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop xkom = new Shop();

    @BeforeEach
    public void initializeTest() {
        xkom.addOrder(new Order(200.0, LocalDate.of(2019, 9, 1), "user1"));
        xkom.addOrder(new Order(400.50, LocalDate.of(2019, 11, 3), "user2"));
        xkom.addOrder(new Order(355.56, LocalDate.of(2020, 4, 13), "user3"));
        xkom.addOrder(new Order(123.5, LocalDate.of(2018, 7, 8), "user4"));
        xkom.addOrder(new Order(5500.5, LocalDate.of(2020, 12, 27), "user5"));
        xkom.addOrder(new Order(7999.0, LocalDate.of(2020, 2, 27), "user6"));

    }

    @Test
    public void shouldAddOrderToShop() {
        assertEquals(6, xkom.getSize());
    }

    @Test
    public void shouldReturnOrdersFromTheLastTwoYears() {
        //when
        List<Order> resultList = xkom.getOrdersFromTheLastTwoYears();
        //then
        assertEquals(6, resultList.size());
    }

    @Test
    public void shouldGetOrdersValuesInTheRange() {
        //when
        List<Order> resultList = xkom.getOrdersValueInTheRange(300.0, 3500.0);
        //then
        assertEquals(4, resultList.size());
    }

    @Test
    public void shouldGetNumbersOfOrders() {
        //when
        int result = xkom.getNumberOfOrders();
        //then
        assertEquals(6, result);
    }

    @Test
    public void shouldGetSumOfValues() {
        //when
        double result = xkom.getSumOfValue();
        //then
        assertEquals(13978.56, result);
    }

    @Test
    public void shouldGetAverageOfValues() {
        //when
        double result = xkom.getAverage();
        //then
        assertEquals(2329.76, result);
    }

}