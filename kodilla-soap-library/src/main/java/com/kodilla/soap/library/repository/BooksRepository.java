package com.kodilla.soap.library.repository;



import com.kodilla.courses.soap.library.Book;
import com.kodilla.courses.soap.library.LiteraryGenre;
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
            book1.setSignature("65445");
            book1.setTitle("Title1");
            book1.setAuthor("Author1");
            book1.setGenre(LiteraryGenre.CRIME);

            books.put(book1.getSignature(), book1);

            Book book2 = new Book();
            book2.setSignature("3423");
            book2.setTitle("Title2");
            book2.setAuthor("Author2");
            book2.setGenre(LiteraryGenre.TECH);

            books.put(book2.getSignature(), book2);

            Book book3 = new Book();
            book3.setSignature("7864");
            book3.setTitle("Title3");
            book3.setAuthor("Author4");
            book3.setGenre(LiteraryGenre.SCI_FI);

            books.put(book3.getSignature(), book3);

            Book book4 = new Book();
            book4.setSignature("4528");
            book4.setTitle("Title4");
            book4.setAuthor("Author4");
            book4.setGenre(LiteraryGenre.FANTASY);

            books.put(book4.getSignature(), book4);
        }

        public Book findBook(String signature) {
            Assert.notNull(signature, "You have to specify the book's signature");
            return books.get(signature);
        }
}