package com.training.xsis.dao;

import java.util.List;

import com.training.xsis.model.Member;

public interface MemberDao {

	void save(Member member);

	List<Member> getAllMember();

	void delete(int id);

	Member getMemberById(int id);

	void update(Member member);

}
