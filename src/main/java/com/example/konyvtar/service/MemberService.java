package com.example.konyvtar.service;

import com.example.konyvtar.model.Member;
import com.example.konyvtar.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Member addMember(Member member) {
        return repository.save(member);
    }

    public Optional<Member> getMember(Long id) {
        return repository.findById(id);
    }

    public List<Member> getAllMembers() {
        return repository.findAll();
    }

    public void deleteMember(Long id) {
        repository.deleteById(id);
    }
}
