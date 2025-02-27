package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;

@Service
public class DoctorMgmtServiceImp implements IDoctorManagmentService {

	@Autowired
	private IDoctorRepository doctorRepo;//injectes the dynamically InMemory proxy class obj
	
	@Override
	public String registrDoctor(Doctor doctor) {
		//save the object(insert the record)
		Doctor savedDoctor=doctorRepo.save(doctor);
		//get the generated id value
		int idVal=savedDoctor.getDid();
		return "Doctor Obj is saved with- "+idVal;
	}

	 

}
