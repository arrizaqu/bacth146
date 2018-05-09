package com.training.xsis.dao;

import java.util.List;

import com.training.xsis.model.Mahasiswa;

public interface MahasiswaDao {
	
	//insert / save
	public void save(Mahasiswa mahasiswa);
	
	//update
	public void update(Mahasiswa mahasiswa);
	
	//delete
	public void delete(Mahasiswa mahasiswa);
	
	//read
	public List<Mahasiswa> getAllMahasiswa();
	
	public Mahasiswa getMahasiswaById(int id);
}
