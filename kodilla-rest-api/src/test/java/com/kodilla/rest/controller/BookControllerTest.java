package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTest {

    BookService bookServiceMock = Mockito.mock(BookService.class);
    BookController bookController = new BookController(bookServiceMock);


    @Test
    public void shouldFetchBooks() {

        //given
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author1"));
        bookList.add(new BookDto("Title 2", "Author2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }
    @Test
    public void addBooksTest(){
        //given
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author1"));
        bookList.add(new BookDto("Title 2", "Author2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);

        //when
        List<BookDto> newBook = bookController.addBook(new BookDto("Title 3", "Author 3"));

        //then
        assertThat(newBook).hasSize(3);
    }

}