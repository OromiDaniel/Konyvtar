package com.example.konyvtar.repository;

import com.example.konyvtar.model.Author;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AuthorRepository {
    private final Map<Long, Author> authors = new HashMap<>();

    public Author save(Author author) {
        authors.put(author.getId(), author);
        return author;
    }

    public Optional<Author> findById(Long id) {
        return Optional.ofNullable(authors.get(id));
    }

    public void deleteById(Long id) {
        authors.remove(id);
    }

    public List<Author> findAll() {
        return new ArrayList<>(authors.values());
    }
}
