package com.example.konyvtar.service;

import com.example.konyvtar.exception.EntityNotFoundException;
import com.example.konyvtar.exception.InvalidDataException;
import com.example.konyvtar.model.Book;
import com.example.konyvtar.repository.BookRepository;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Book addBook(Book book) {
        if (book.getTitle() == null || book.getTitle().isBlank()) {
            throw new InvalidDataException("Book title cannot be empty");
        }
        return repository.save(book);
    }


    public Book getBook(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Book not found with id: " + id));
    }


    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
}
