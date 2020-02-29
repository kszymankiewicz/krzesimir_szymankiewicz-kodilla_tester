package com.kodilla.collections.adv.immutable.special.homework;


import java.util.HashSet;
import java.util.Set;

public class BookManager {
    Set<Book> books = new HashSet<>();


    public Book createBook(String title, String author) {

      Book newBook =  new Book(title, author);
      if(books.contains(newBook)) {
          return books.stream()
                  .filter(b -> b.equals(newBook)).findAny().orElse(null);
      } else {
        books.add(newBook);
        return newBook;
        }
    }

}


