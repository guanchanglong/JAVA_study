package com.gcl.demo2.dao;

import com.gcl.demo2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberDao extends JpaRepository<Member,Integer> {
    List<Member> findMemberByNumber(String number);
}
