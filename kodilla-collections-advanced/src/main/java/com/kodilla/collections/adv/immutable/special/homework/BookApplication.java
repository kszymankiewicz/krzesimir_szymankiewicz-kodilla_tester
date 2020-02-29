package com.kodilla.collections.adv.immutable.special.homework;



public class BookApplication {
    public static void main(String[] args) {

        BookManager bookManager = new BookManager();


       Book book1 = bookManager.createBook("Wither", "Andrzej Sapkowwski");
       Book book2 = bookManager.createBook("Mamba mentality","Kobe Bryant");
       Book book3 =  bookManager.createBook("Eleven Rings : The Soul of Success","Hugh Delehanty");
       Book book4 =  bookManager.createBook("Eleven Rings : The Soul of Success","Hugh Delehanty");



        System.out.println("Book1: " + book1.hashCode());
        System.out.println("Book2: " + book2.hashCode());
        System.out.println("Book3: " + book3.hashCode());
        System.out.println("Book4: " + book4.hashCode());

        System.out.println(book3==book4);
        System.out.println(book3.equals(book4));

    }
}
