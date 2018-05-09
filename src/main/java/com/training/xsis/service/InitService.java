package com.training.xsis.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.training.xsis.model.Mahasiswa;

@Component
public class InitService {

	@Autowired
	MahasiswaService mahasiswaService;
	
	//@PostConstruct
	public void init() {
		Mahasiswa mhs = new Mahasiswa();
		mhs.setName("rudi hartono");
		mhs.setEmail("rudi@gmail.com");
		mhs.setAddress("jakarta barat");
		mahasiswaService.save(mhs);
	}
}
