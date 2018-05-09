package com.training.xsis.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.xsis.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Member member) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(member);
	}

	@Override
	public List<Member> getAllMember() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		String hql = "from Member";
		List<Member> listMember = session.createQuery(hql).list();
		
		if(listMember.isEmpty()) {
				return new ArrayList<>();
		}
		
		return listMember;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Member member = new Member();
		member.setId(id);
		session.delete(member);
	}

	@Override
	public Member getMemberById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql = "from Member m where m.id = :id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List<Member> listMember = query.list();
		
		if(listMember.isEmpty()) {
			return new Member();
		}
		
		return listMember.get(0);
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(member);
	}

}
