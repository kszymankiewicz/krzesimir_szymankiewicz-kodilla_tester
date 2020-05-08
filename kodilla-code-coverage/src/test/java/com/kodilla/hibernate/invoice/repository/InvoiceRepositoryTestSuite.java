package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;


@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    private static final String NUMBER = "1/1/2020";

    @Test
    void testInvoiceRepositorySaveAfterAddingAllTheItemsWithProducts() {
        //Given
        Invoice invoice = new Invoice(NUMBER);

        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");

        Item item1 = new Item(new BigDecimal(1),1,new BigDecimal(1));
        Item item2 = new Item(new BigDecimal(2),2,new BigDecimal(2));
        Item item3 = new Item(new BigDecimal(3),3,new BigDecimal(3));
        Item item4 = new Item(new BigDecimal(4),4,new BigDecimal(4));

        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product1);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        //When
        invoiceRepository.save(invoice);
        String productName1 = item1.getProduct().getName();
        String productName2 = item2.getProduct().getName();
        String productName3 = item3.getProduct().getName();

        //Then
        Assert.assertEquals(productName2,invoice.getItems().get(1).getProduct().getName());
        Assert.assertEquals(productName1,invoice.getItems().get(3).getProduct().getName());

        //CleanUp
        invoiceRepository.deleteAll();
    }
}