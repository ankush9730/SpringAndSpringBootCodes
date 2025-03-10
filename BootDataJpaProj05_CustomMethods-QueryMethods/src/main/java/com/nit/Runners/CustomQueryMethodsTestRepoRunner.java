package com.nit.Runners;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.repository.IDoctorRepository;

@Component
public class CustomQueryMethodsTestRepoRunner implements CommandLineRunner {
	@Autowired
	private IDoctorRepository docRepo;

	@Override
	public void run(String... args) throws Exception {

//		List<Doctor> list=docRepo.showAllDoctors();
//		list.forEach(System.out::println);
		
		docRepo.showAllDoctorsBySpecilizations("cardio", "nuro", "physio").forEach(System.out::println);
	}

}
 