package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorMgmtService;

@Component
public class JPARepositoryRunner implements CommandLineRunner {

    @Autowired
    private IDoctorMgmtService docService;

    @Override
    public void run(String... args) throws Exception {
          
//     	try {
//     		 String msg=docService.removeAllDoctorsInBatch(List.of(145,489,405,567,115));
//     		 System.out.println(msg);
//     	}catch(Exception e) {
//     		e.printStackTrace();
//     	}
    	
//    	try {
//    		Doctor doctor=new Doctor();
//    		doctor.setSpecialization("cardio");
//    		doctor.setQlfy("MD");
//    		//doctor.setDname("Lahu");
//    		//use the service
//    		List<Doctor> list=docService.findDoctorsByExampleData(doctor, false, "dname");
//    		list.f orEach(System.out::println);
//    	}catch(Exception e) {
//    		e.printStackTrace();
//     	}
    	
//    	try {
//    		Doctor doctor=docService.showDoctorById(112);
//    		System.out.println(doctor);
//    	}catch(Exception e) {
//    		e.printStackTrace();
//    	}
    	try {
    		Doctor doctor=docService.fetchDoctorById(113);
    		//System.out.println("Class nam of the objects::"+doctor.getClass());
    		//System.out.println("Doctor id::"+doctor.getDid());
    		//System.out.println("get doctor name::"+doctor.getDname());
    	}catch(Exception e) { 
    		e.printStackTrace();
    	}
    	
    	
    	
    	
    }// -run(-)
}