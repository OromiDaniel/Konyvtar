package com.example.konyvtar.controller;

import com.example.konyvtar.model.Loan;
import com.example.konyvtar.service.LoanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService service;

    public LoanController(LoanService service) {
        this.service = service;
    }

    @PostMapping
    public Loan addLoan(@RequestBody Loan loan) {
        return service.addLoan(loan);
    }

    @GetMapping
    public List<Loan> getAllLoans() {
        return service.getAllLoans();
    }

    @GetMapping("/{id}")
    public Optional<Loan> getLoan(@PathVariable Long id) {
        return service.getLoan(id);
    }

    @PutMapping("/{id}")
    public Loan updateLoan(@PathVariable Long id, @RequestBody Loan loan) {
        loan.setId(id);
        return service.addLoan(loan);
    }

    @DeleteMapping("/{id}")
    public void deleteLoan(@PathVariable Long id) {
        service.deleteLoan(id);
    }
}
