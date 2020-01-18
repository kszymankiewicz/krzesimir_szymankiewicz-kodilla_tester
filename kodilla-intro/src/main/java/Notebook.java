public class Notebook {


    int weight;
    int price;
    int year;

    Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {

        if (this.price <= 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {

        if (this.weight <= 400) {
            System.out.println("This device is light.");
        } else if (this.weight > 400 && this.weight <= 1100) {
            System.out.println("This device not very heavy .");
        } else {
            System.out.println("This device is very heavy.");
        }
    }

    public void checkYearPrice() {

        if (this.price <= 900 && this.year >= 2017) {
            System.out.println("a good buy !");
        } else if (this.price > 1000 && this.year <= 2016) {
            System.out.println("a bad buy !");
        } else {
            System.out.println("think again !");

        }
    }
}

