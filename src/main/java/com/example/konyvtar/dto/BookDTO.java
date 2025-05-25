package com.example.konyvtar.dto;

import lombok.Data;

@Data
public class BookDTO {
    private String title;
    private String isbn;
    private int publicationYear;
}
