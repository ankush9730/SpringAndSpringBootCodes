package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorManagmentService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private IDoctorManagmentService docService;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			//prepare
			Doctor doc=new Doctor(null,"raja","MD",89666L,99999L,"cardio");
			String msg=docService.registrDoctor(doc);
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//run(-)

}//class
