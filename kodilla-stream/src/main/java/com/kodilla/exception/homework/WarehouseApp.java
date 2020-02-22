package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Order order = new Order("13123");
        Order order1 = new Order("131");
        Order order3 = new Order("1311");
        Order order4 = new Order("131232");


        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(order);
        warehouse.addOrder(order1);
        warehouse.addOrder(order3);
        warehouse.addOrder(order4);

        try {
            warehouse.getOrder("131222");
        } catch (OrderDoesntExistException e) {
            System.out.println("Nie ma takiego zamówienia.");
        }


    }
}
