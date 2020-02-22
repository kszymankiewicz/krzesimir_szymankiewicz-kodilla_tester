package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTest {

    @Test(expected = OrderDoesntExistException.class)
    public void whenOrderDoesNotExist() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.getOrder("12");


    }
}