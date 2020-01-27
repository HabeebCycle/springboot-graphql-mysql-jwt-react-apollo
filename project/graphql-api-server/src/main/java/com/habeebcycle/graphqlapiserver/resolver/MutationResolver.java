package com.habeebcycle.graphqlapiserver.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.habeebcycle.graphqlapiserver.model.Author;
import com.habeebcycle.graphqlapiserver.model.Book;
import com.habeebcycle.graphqlapiserver.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    private DataService dataService;

    @Autowired
    public MutationResolver(DataService dataService){
        this.dataService = dataService;
    }

    public Book addBook(String name, String genre, Long author){
        return dataService.addBook(name, genre, author);
    }

    public Author addAuthor(String name, int age){
        return dataService.addAuthor(name, age);
    }


}
