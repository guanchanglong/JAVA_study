package com.gcl.demo2.service;

import com.gcl.demo2.entity.Member;

import java.util.List;

public interface MemberService {

    List<Member> find(String number);

    void save(Member member);

    List<Member> findAll();
}
