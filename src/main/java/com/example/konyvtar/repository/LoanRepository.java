package com.example.konyvtar.repository;

import com.example.konyvtar.model.Loan;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LoanRepository {
    private final Map<Long, Loan> loans = new HashMap<>();

    public Loan save(Loan loan) {
        loans.put(loan.getId(), loan);
        return loan;
    }

    public Optional<Loan> findById(Long id) {
        return Optional.ofNullable(loans.get(id));
    }

    public void deleteById(Long id) {
        loans.remove(id);
    }

    public List<Loan> findAll() {
        return new ArrayList<>(loans.values());
    }
}
