package com.example.konyvtar.service;

import com.example.konyvtar.model.Loan;
import com.example.konyvtar.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanService {
    private final LoanRepository repository;

    public LoanService(LoanRepository repository) {
        this.repository = repository;
    }

    public Loan addLoan(Loan loan) {
        return repository.save(loan);
    }

    public Optional<Loan> getLoan(Long id) {
        return repository.findById(id);
    }

    public List<Loan> getAllLoans() {
        return repository.findAll();
    }

    public void deleteLoan(Long id) {
        repository.deleteById(id);
    }
}
