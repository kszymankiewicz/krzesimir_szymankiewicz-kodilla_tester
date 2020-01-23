public class LeapYear {
    private int xYear;
    private boolean leap;

    public LeapYear(int xYear) {
        this.xYear = xYear;
    }

    public int getXYear() {
        return xYear;
    }

    public void checkLeapYear() {
        if (xYear % 4 == 0 || xYear % 100 == 0 || xYear % 400 == 0) {
            leap = true;
            System.out.println(" Rok jest przystępny! ");
        } else {
            leap = false;
            System.out.println(" Rok nie jest przystępny! ");

        }
    }
}
