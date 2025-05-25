package com.example.konyvtar.model;

import lombok.Data;
import java.util.List;

@Data
public class Author {
    private Long id;
    private String name;
    private String nationality;
    private int birthYear;
    private List<Book> books;
}
