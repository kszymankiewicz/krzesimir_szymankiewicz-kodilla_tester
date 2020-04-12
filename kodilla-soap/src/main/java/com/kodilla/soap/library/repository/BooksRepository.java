package com.kodilla.soap.library.repository;


import com.kodilla.courses.soap.Book;
import com.kodilla.courses.soap.LiteratureSort;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {

        Book book1 = new Book();
        book1.setSignatureNumber("113213");
        book1.setTitle("SCI-FI");
        book1.setAuthor("Author1");
        book1.setYearEdition(1988);
        book1.setLiteratureSort(LiteratureSort.SCI_FI);

        books.put(book1.getSignatureNumber(), book1);

        Book book2 = new Book();
        book2.setSignatureNumber("213213");
        book2.setTitle("FANTASY");
        book2.setAuthor("Author2");
        book2.setYearEdition(1999);
        book2.setLiteratureSort(LiteratureSort.FANTASY);

        books.put(book2.getSignatureNumber(), book2);

        Book book3 = new Book();
        book3.setSignatureNumber("313213");
        book3.setTitle("TECH");
        book3.setAuthor("Author3");
        book3.setYearEdition(2005);
        book3.setLiteratureSort(LiteratureSort.TECH);

        books.put(book3.getSignatureNumber(), book3);


        Book book4 = new Book();
        book4.setSignatureNumber("413213");
        book4.setTitle("Crime");
        book4.setAuthor("Author4");
        book4.setYearEdition(1988);
        book4.setLiteratureSort(LiteratureSort.CRIME);

        books.put(book4.getSignatureNumber(), book4);
    }

    public Book findBook(String signatureNumber) {
        Assert.notNull(signatureNumber, "Wrong signature");
        return books.get(signatureNumber);
    }
}