package com.training.xsis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.xsis.model.Pembelian;

@Repository
public class PembelianDaoImpl implements PembelianDao{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(Pembelian pem) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(pem);
	}

}
