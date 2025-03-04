package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IDoctorMgmtService;

@Component
public class PaginingAndSortingRepositoryRunner implements CommandLineRunner {

	@Autowired
	private IDoctorMgmtService docService;
	
	@Override	
	public void run(String... args) throws Exception {

		try {
		//use docService
		 docService.showAllDoctorsBySortion(true, "dname","sprcialization").forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
