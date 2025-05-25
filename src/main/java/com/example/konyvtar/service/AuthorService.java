package com.example.konyvtar.service;

import com.example.konyvtar.model.Author;
import com.example.konyvtar.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public Author addAuthor(Author author) {
        return repository.save(author);
    }

    public Optional<Author> getAuthor(Long id) {
        return repository.findById(id);
    }

    public List<Author> getAllAuthors() {
        return repository.findAll();
    }

    public void deleteAuthor(Long id) {
        repository.deleteById(id);
    }
}
