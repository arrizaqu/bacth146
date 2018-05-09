package com.training.xsis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.xsis.dao.MemberDao;
import com.training.xsis.model.Member;

@Transactional
@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;
	
	public void save(Member member) {
		// TODO Auto-generated method stub
		memberDao.save(member);
	}

	public List<Member> getAllMember() {
		// TODO Auto-generated method stub
		return memberDao.getAllMember();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		memberDao.delete(id);
	}

	public Member getMemberById(int id) {
		// TODO Auto-generated method stub
		return memberDao.getMemberById(id);
	}

	public void update(Member member) {
		// TODO Auto-generated method stub
		memberDao.update(member);
	}

}
