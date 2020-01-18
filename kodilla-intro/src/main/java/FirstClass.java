

public class FirstClass {

    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2018);
        check(notebook);

        Notebook heavyNotebook = new Notebook(2000, 1500, 2016);
        check(heavyNotebook);

        Notebook oldNotebook = new Notebook(1050, 500, 2013);
        check(oldNotebook);

        Notebook ultrabook = new Notebook(200, 1300, 2019);
        check(ultrabook);

        Notebook gamingLaptop = new Notebook(2500, 1600, 2018);
        check(gamingLaptop);

        Notebook businessLaptop = new Notebook(500, 900, 2017);
        check(businessLaptop);


    }
    private static void check (Notebook notebook) {
        System.out.println(notebook.getWeight() + "g" + " " + notebook.getPrice() + "zł");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();

    }
}
