package com.example.konyvtar.model;

import lombok.Data;
import java.util.List;

@Data
public class Book {
    private Long id;
    private String title;
    private String isbn;
    private int publicationYear;
    private List<String> genres; 
}
