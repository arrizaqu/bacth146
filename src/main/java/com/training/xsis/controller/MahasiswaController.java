package com.training.xsis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.training.xsis.model.Mahasiswa;
import com.training.xsis.service.MahasiswaService;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaController {

	@Autowired
	MahasiswaService mahasiswaService;
	
	@RequestMapping
	public String index(Model model) {
		List<Mahasiswa> listMahasiswa = mahasiswaService.getAllMahasiswa();
		model.addAttribute("listMahasiswa", listMahasiswa);
		return "form-mahasiswa";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute Mahasiswa mahasiswa) {
		mahasiswaService.save(mahasiswa);
		
		return "redirect:/mahasiswa";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String delete(@PathVariable int id) {
		Mahasiswa mhs = new Mahasiswa();
		mhs.setId(id);
		mhs.setName("-");
		mahasiswaService.delete(mhs);
		return "redirect:/mahasiswa";
	}
	
	@ResponseBody
	@RequestMapping(value="/getmhs/{id}")
	public Mahasiswa getMahasiswaById(@PathVariable int id){
		Mahasiswa mhs = mahasiswaService.getMahasiswaById(id);
		return mhs;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void update(@RequestBody Mahasiswa mhs) {
		mahasiswaService.update(mhs);
	}
}
