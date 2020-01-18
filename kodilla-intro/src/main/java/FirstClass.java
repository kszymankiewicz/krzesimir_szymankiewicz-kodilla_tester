

public class FirstClass {

    public static void main(String[] args) {


        Notebook notebook = new Notebook(600, 1000, 2018);
        System.out.println(notebook.weight + "g" + " " + notebook.price + "zł");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2016);
        System.out.println(heavyNotebook.weight + "g" + " " + heavyNotebook.price + "zł");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1050, 500, 2013);
        System.out.println(oldNotebook.weight + "g" + " " + oldNotebook.price + "zł");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();


        Notebook ultrabook = new Notebook(200, 1300, 2019);
        System.out.println(ultrabook.weight + "g" + " " + ultrabook.price + "zł");
        ultrabook.checkPrice();
        ultrabook.checkWeight();
        ultrabook.checkYearPrice();

        Notebook gamingLaptop = new Notebook(2500, 1600, 2018);
        System.out.println(gamingLaptop.weight + "g" + " " + gamingLaptop.price + "zł");
        gamingLaptop.checkPrice();
        gamingLaptop.checkWeight();
        gamingLaptop.checkYearPrice();

        Notebook businessLaptop = new Notebook(500, 900, 2017);
        System.out.println(businessLaptop.weight + "g" + " " + businessLaptop.price + "zł");
        businessLaptop.checkPrice();
        businessLaptop.checkWeight();
        businessLaptop.checkYearPrice();


    }
}
