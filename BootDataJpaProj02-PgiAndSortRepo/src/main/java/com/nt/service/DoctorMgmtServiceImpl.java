package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entiry.Doctor;
import com.nt.repository.IDoctorRepository;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {

	@Autowired
	private IDoctorRepository doctorRepo;
	
	
	@Override
	public Iterable<Doctor> showAllDoctorsBySortion(boolean ascOrder, String... props) {
		//Create sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		
		//use repo
		Iterable<Doctor> it=doctorRepo.findAll(sort);
		return it;
	}

}
