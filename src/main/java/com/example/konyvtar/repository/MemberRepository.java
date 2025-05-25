package com.example.konyvtar.repository;

import com.example.konyvtar.model.Member;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemberRepository {
    private final Map<Long, Member> members = new HashMap<>();

    public Member save(Member member) {
        members.put(member.getId(), member);
        return member;
    }

    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(members.get(id));
    }

    public void deleteById(Long id) {
        members.remove(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(members.values());
    }
}
