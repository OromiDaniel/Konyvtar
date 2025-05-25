package com.example.konyvtar.model;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Loan {
    private Long id;
    private Book book;
    private Member member;
    private LocalDate loanDate;
    private LocalDate dueDate;
}
