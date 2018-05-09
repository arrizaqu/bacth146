package com.training.xsis.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.xsis.model.DetailPembelian;

@Repository
public class DetailPembelianDaoImpl implements DetailPembelianDao {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(DetailPembelian dPem) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(dPem);
	}

}
