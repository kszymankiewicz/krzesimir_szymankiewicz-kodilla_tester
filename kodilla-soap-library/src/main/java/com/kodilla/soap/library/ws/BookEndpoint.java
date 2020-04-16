package com.kodilla.soap.library.ws;


import com.kodilla.courses.soap.library.GetBookRequest;
import com.kodilla.courses.soap.library.GetBookResponse;
import com.kodilla.soap.library.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class BookEndpoint {
    private static final String NAMESPACE_URI = "http://kodilla.com/books/soap";

    private BooksRepository booksRepository;

    @Autowired
    public BookEndpoint(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getBookRequest")
    @ResponsePayload
    public GetBookResponse getBook(@RequestPayload GetBookRequest request) {
        GetBookResponse response = new GetBookResponse();
        response.setBook(booksRepository.findBook(request.getSignature()));
        return response;
    }
}
