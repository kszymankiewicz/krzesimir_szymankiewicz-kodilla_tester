package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);

        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator1 = new Calculator();

        int substractResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, substractResult);

        if (correct2) {
            System.out.println("Metoda substrac działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda substrac nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator3 = new Calculator();

        int powerOfAResult = calculator.powerOfA(a);
        boolean correct3 = ResultChecker.assertEquals(25, powerOfAResult);

        if (correct3) {
            System.out.println("Metoda powerOfA działa poprawnie dla liczb " + a );
        } else {
            System.out.println("Metoda powerOfA nie działa poprawnie dla liczb " + a);
        }

        Calculator calculator4 = new Calculator();

        int powerOfBResult = calculator.powerOfB(b);
        boolean correct4 = ResultChecker.assertEquals(64, powerOfBResult);

        if (correct3) {
            System.out.println("Metoda powerOfB działa poprawnie dla liczb " + b );
        } else {
            System.out.println("Metoda powerOfB nie działa poprawnie dla liczb " + b);
        }
    }
}