package com.github.joostvdg.demo.graphql.repository;

import com.github.joostvdg.demo.graphql.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
