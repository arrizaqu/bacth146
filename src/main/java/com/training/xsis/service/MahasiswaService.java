package com.training.xsis.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.xsis.dao.MahasiswaDao;
import com.training.xsis.model.Mahasiswa;

@Transactional
@Service
public class MahasiswaService {
	
	@Autowired
	MahasiswaDao mahasiswaDao;
	
	//save
	public void save(Mahasiswa mahasiswa) {
		//do script
		mahasiswaDao.save(mahasiswa);
	}
	
	public List<Mahasiswa> getAllMahasiswa(){
		return mahasiswaDao.getAllMahasiswa();
	}

	public void delete(Mahasiswa mhs) {
		// TODO Auto-generated method stub
		mahasiswaDao.delete(mhs);
	}

	public Mahasiswa getMahasiswaById(int id) {
		// TODO Auto-generated method stub
		return mahasiswaDao.getMahasiswaById(id);
	}

	public void update(Mahasiswa mhs) {
		// TODO Auto-generated method stub
		mahasiswaDao.update(mhs);
	}

}
