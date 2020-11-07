package com.gcl.demo2.service.Impl;

import com.gcl.demo2.dao.MemberDao;
import com.gcl.demo2.entity.Member;
import com.gcl.demo2.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IMemberService implements MemberService {
    @Autowired
    private MemberDao memberDao;

    @Override
    public List<Member> find(String number) {
        return memberDao.findMemberByNumber(number);
    }

    @Override
    public void save(Member member) {
        memberDao.save(member);
    }

    @Override
    public List<Member> findAll() {
        return memberDao.findAll();
    }
}
