package com.habeebcycle.graphqlapiserver.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.habeebcycle.graphqlapiserver.model.Author;
import com.habeebcycle.graphqlapiserver.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        Book book = new Book();
        book.setId(1L);
        book.setName("Bill of the Moment");
        book.setAuthor(new Author());
        book.setGenre("Fantasy");

        books.add(book);

        return books;
    }
}
