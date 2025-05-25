package com.example.konyvtar.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class LoanDTO {
    private Long bookId;
    private Long memberId;
    private LocalDate loanDate;
    private LocalDate dueDate;
}
