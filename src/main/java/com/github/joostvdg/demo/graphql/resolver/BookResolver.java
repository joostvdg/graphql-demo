package com.github.joostvdg.demo.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.github.joostvdg.demo.graphql.model.Author;
import com.github.joostvdg.demo.graphql.model.Book;
import com.github.joostvdg.demo.graphql.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findOne(book.getAuthor().getId());
    }

}
