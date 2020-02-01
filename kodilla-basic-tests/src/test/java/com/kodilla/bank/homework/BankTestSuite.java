package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldCalculateCorrectSumIfValuesAreInRange() {

        Bank bank = new Bank("Millenium");

        bank.addBlackStreet(500);
        bank.addGreenStreet(400);
        bank.addYellowStreet(150);
        bank.addWallStreet(100);

        bank.payoutBlackStreet(-400);
        bank.payoutGreenStreet(-400);
        bank.payoutWallStreet(-50);
        bank.payoutYellowStreet(-50);

        bank.getAddSumCashMachine();


        int wallStreetSum = bank.getWallStreetSum();
        int greenStreetSum = bank.getGreenStreetSum();
        int yellowStreetSum = bank.getYellowStreetSum();
        int blackStreetSum = bank.getBlackStreetSum();

        int payoutWallStreetSum = bank.getPayoutWallStreetSum();
        int payoutGreenStreetSum = bank.getPayoutGreenStreetSum();
        int payoutYellowStreetSum = bank.getPayOutYellowStreetSum();
        int payoutBlackStreetSum = bank.getPayoutBlackStreetSum();


        int cashMachineSum = (wallStreetSum + greenStreetSum + yellowStreetSum + blackStreetSum
                + payoutWallStreetSum + payoutGreenStreetSum + payoutYellowStreetSum + payoutBlackStreetSum);


        assertEquals(100, blackStreetSum);
        assertEquals(0, greenStreetSum);
        assertEquals(100, yellowStreetSum);
        assertEquals(50, wallStreetSum);

        assertEquals(100, payoutBlackStreetSum);
        assertEquals(0, payoutGreenStreetSum);
        assertEquals(100, payoutWallStreetSum);
        assertEquals(50, payoutYellowStreetSum);

        assertEquals(250, cashMachineSum);

    }
    @Test
    public void shouldCalculateCorrectAverageIfValuesAreInRange(){

    }
    @Test
    public void shouldCalculateAveragesIfValuesAreOutsideRange(){

    }
    @Test
    public void shouldCalculateSumIfValuesAreOutsideRange(){

    }
    @Test
    public void averageShouldBeZeroIfBankDontHaveCash(){}

    @Test
    public void shouldCalculateCashMachineAverage(){}

    @Test
    public void shouldCalculatePayoutCashMachineAverage(){}
}
