package com.kodilla.bank.homework;

import java.util.Arrays;
import java.util.List;

public class Bank {
    private CashMachine wallStreet;
    private CashMachine greenStreet;
    private CashMachine yellowStreet;
    private CashMachine blackStreet;
    private CashMachine payoutWallStreet;
    private CashMachine payoutGreenStreet;
    private CashMachine payoutYellowStreet;
    private CashMachine payoutBlackStreet;
    private List<Integer> x = Arrays.asList(20, 50, 100, 200, 500);

    public Bank(String name) {

        this.wallStreet = new CashMachine();
        this.greenStreet = new CashMachine();
        this.yellowStreet = new CashMachine();
        this.blackStreet = new CashMachine();
        this.payoutWallStreet = new CashMachine();
        this.payoutGreenStreet = new CashMachine();
        this.payoutYellowStreet = new CashMachine();
        this.payoutBlackStreet = new CashMachine();
    }

    public void addWallStreet(int cash) {

        if (cash > 20 || x.contains(cash)) {
            this.wallStreet.add(cash);
        } else {
            System.out.println("za małe środki do wpłaty");
        }
    }

    public void payoutWallStreet(int cash) {
        if (cash < -20 || x.contains(cash)) {
            this.payoutWallStreet.add(cash);
        } else {
            System.out.println("za małe środki do wpłaty");
        }
    }

    public void addGreenStreet(int cash) {
        if (cash > 20 || x.contains(cash)) {
            this.greenStreet.add(cash);
        } else {
            System.out.println("za małe środki do wpłaty");
        }
    }

    public void payoutGreenStreet(int cash) {
        if (cash > -20 || x.contains(cash)) {
            this.payoutGreenStreet.add(cash);
        } else {
            System.out.println("za małe środki do wpłaty");
        }
    }

    public void addYellowStreet(int cash) {
        if (cash > 20 || x.contains(cash)) {
            this.yellowStreet.add(cash);
        } else {
            System.out.println("za małe środki do wpłaty");
        }
    }

    public void payoutYellowStreet(int cash) {
        if (cash > -20 || x.contains(cash)) {
            this.payoutYellowStreet.add(cash);
        } else {
            System.out.println("za małe środki do wpłaty");
        }
    }

    public void addBlackStreet(int cash) {
        if (cash > 20 || x.contains(cash)) {
            this.blackStreet.add(cash);
        } else {
            System.out.println("za małe środki do wpłaty");
        }
    }

    public void payoutBlackStreet(int cash) {
        if (cash > -20 || x.contains(cash)) {
            this.payoutBlackStreet.add(cash);
        } else {
            System.out.println("za małe środki do wpłaty");
        }
    }

    public int getWallStreetSum() {
        return this.wallStreet.getSum();
    }

    public int getGreenStreetSum() {
        return this.greenStreet.getSum();
    }

    public int getYellowStreetSum() {
        return this.yellowStreet.getSum();
    }

    public int getBlackStreetSum() {
        return this.blackStreet.getSum();
    }

    public int getPayoutWallStreetSum() {
        return this.payoutWallStreet.getSum();
    }

    public int getPayoutGreenStreetSum() {
        return this.payoutGreenStreet.getSum();
    }

    public int getPayOutYellowStreetSum() {
        return this.payoutYellowStreet.getSum();
    }

    public int getPayoutBlackStreetSum() {
        return this.payoutBlackStreet.getSum();
    }


    public int getAddSumCashMachine() {
        return (this.wallStreet.getSum() + this.greenStreet.getSum() + this.yellowStreet.getSum() + this.blackStreet.getSum() + this.payoutWallStreet.getSum() +
                this.payoutGreenStreet.getSum() + this.payoutYellowStreet.getSum() + this.payoutBlackStreet.getSum());
    }

    public double getWallStreetAverage() { return this.wallStreet.getAverage(); }

    public double getPayoutWallStreetAverage() {
        return this.payoutWallStreet.getAverage();
    }

    public double getGreenStreetAverage() {
        return this.greenStreet.getAverage();
    }

    public double getPayoutGreenStreetAverage() {
        return this.payoutGreenStreet.getAverage();
    }

    public double getYellowStreetAverage() {
        return this.yellowStreet.getAverage();
    }

    public double getPayoutYellowStreetAverage() {
        return this.payoutYellowStreet.getAverage();
    }

    public double getBlackStreetAverage() {
        return this.blackStreet.getAverage();
    }

    public double getPayoutBlackStreetAverage() {
        return this.payoutBlackStreet.getAverage();
    }


    public double getPaymentAverage() {
        double sum = this.wallStreet.getAverage() + this.greenStreet.getAverage() + this.yellowStreet.getAverage() + this.blackStreet.getAverage();
        return sum / 4;
    }

    public double getPayOutAverage() {
        double sum = this.payoutWallStreet.getAverage() + this.payoutGreenStreet.getAverage() + this.payoutYellowStreet.getAverage() + this.payoutBlackStreet.getAverage();
        return sum / 4;

    }

    public int getWallStreetSize() {
        return this.wallStreet.sizeTab();
    }

    public int getPayoutWallStreetSize() {
        return this.payoutWallStreet.sizeTab();
    }

    public int getGreenStreetSize() {
        return this.greenStreet.sizeTab();
    }

    public int getPayoutGreenStreetSize() {
        return this.payoutGreenStreet.sizeTab();
    }

    public int getYellowStreetSize() {
        return this.yellowStreet.sizeTab();
    }

    public int getPayoutYellowStreetSize() {
        return this.payoutYellowStreet.sizeTab();
    }

    public int getBlackStreetSize() {
        return this.blackStreet.sizeTab();
    }

    public int getPayoutBlackStreetSize() {
        return this.payoutBlackStreet.sizeTab();
    }


    public int getPaymentSize() {
        int size = this.getWallStreetSize() + this.getGreenStreetSize() + this.getYellowStreetSize() + this.getBlackStreetSize();
        return size;
    }

    public int getPayoutSize() {
        int size = this.getPayoutWallStreetSize() + this.getPayoutGreenStreetSize() + this.getPayoutYellowStreetSize() + this.getPayoutBlackStreetSize();
        return size;
    }

}


