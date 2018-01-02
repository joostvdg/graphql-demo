package com.github.joostvdg.demo.graphql.repository;

import com.github.joostvdg.demo.graphql.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
