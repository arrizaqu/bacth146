package com.training.xsis.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.training.xsis.model.Mahasiswa;

@Repository
public class MahasiswaDaoImpl implements MahasiswaDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(mahasiswa);
	}

	@Override
	public void update(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(mahasiswa);
	}

	@Override
	public void delete(Mahasiswa mahasiswa) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(mahasiswa);
	}

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Mahasiswa.class).list();
	}

	@Override
	public Mahasiswa getMahasiswaById(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.get(Mahasiswa.class,id);
	}

}
