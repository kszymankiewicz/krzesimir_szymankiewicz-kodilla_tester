package com.kodilla.rest.domain;

import java.util.Objects;

public class BookDto {


    private String title;
    private String author;

    public BookDto() {

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return title.equals(bookDto.title) &&
                author.equals(bookDto.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}