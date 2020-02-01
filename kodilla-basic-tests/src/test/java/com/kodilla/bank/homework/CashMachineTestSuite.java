package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] values = cashMachine.getValues();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(4);
        cashMachine.add(2);

        int[] values = cashMachine.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }
    @Test
    public void shouldCalculateSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(500);
        cashMachine.add(500);

        assertEquals(1400,cashMachine.getSum());
        assertEquals(400,cashMachine.getAverage(),0.001);
    }

}
