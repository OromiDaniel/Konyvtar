package com.example.konyvtar.repository;

import com.example.konyvtar.model.Book;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookRepository {
    private final Map<Long, Book> books = new HashMap<>();

    public Book save(Book book) {
        books.put(book.getId(), book);
        return book;
    }

    public Optional<Book> findById(Long id) {
        return Optional.ofNullable(books.get(id));
    }

    public void deleteById(Long id) {
        books.remove(id);
    }

    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }
}
