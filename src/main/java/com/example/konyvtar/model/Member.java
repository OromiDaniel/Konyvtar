package com.example.konyvtar.model;

import lombok.Data;
import java.util.List;

@Data
public class Member {
    private Long id;
    private String name;
    private int age;
    private String email;
    private List<Loan> loans;
}
