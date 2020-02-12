package com.kodilla.bank.homework;

import java.util.Arrays;
import java.util.List;

public class Bank extends CashMachine {
    private CashMachine[] cashMachines = new CashMachine[]{
            new CashMachine(),
            new CashMachine(),
            new CashMachine(),
            new CashMachine()
    };
    private List<Integer> x = Arrays.asList(20, 50, 100, 200, 500);

    public int sum() {
        int totalSum = 0;
        for (CashMachine c : cashMachines) {
            totalSum += c.getSum();
        }

        return totalSum;
    }


    public int withdrawSum() {
        int withdrawCount = 0;
        for (CashMachine a : cashMachines) {
            withdrawCount += a.withdrawCounts();
        }
        return withdrawCount;
    }



    public int depositCount() {
        int depositCount = 0;

        for (CashMachine a : cashMachines) {
            depositCount += a.depositCount();
        }
        return depositCount;
    }

    public double averageWithdraw() {


        return  sumWithdraw()/ (double) withdrawSum();


    }

    public double averageDeposit() {

        return sumDeposit()/ (double) depositCount();

    }

    public int sumWithdraw(){

       int sumWithdraw= 0;
       for(CashMachine a : cashMachines){
           sumWithdraw+= a.withdrawSum();
       }
       return sumWithdraw;
    }
    public int sumDeposit(){
        int sumDeposit=0;
        for(CashMachine a : cashMachines){
            sumDeposit -= a.depositSum();
        }
        return sumDeposit;
    }



}


