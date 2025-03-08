package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepository;


@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {

	@Autowired
	private IDoctorRepository doctorRepo;
	
	@Override
	public String removeAllDoctorsInBatch(Iterable<Integer> ids) {
		//Load the objects based of given ids
		List<Doctor> list=doctorRepo.findAllById(ids);
		//get the available doctors count
		int count=list.size();
		//delete the objs in batch
		doctorRepo.deleteAllByIdInBatch(ids);
		return count+" no.of records are deleted";
	}

	@Override
	public List<Doctor> findDoctorsByExampleData(Doctor doctor, boolean ascOrder, String... props) {
		//prepare example obj
		Example<Doctor> example=Example.of(doctor);
		//prepare sort objs
		
		Sort sort = Sort.by(ascOrder ? Sort.Direction.ASC : Sort.Direction.DESC, props);
		//use repo
		List<Doctor>list=doctorRepo.findAll(example);
		return list;
	}

	@Override
	public Doctor showDoctorById(int id) {
		//use repo
		Doctor doctor=doctorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
				
		return doctor;
	}

	@Override
	public Doctor fetchDoctorById(int id) {
		Doctor doctor=doctorRepo.getReferenceById(id);
		System.out.println(doctor.getClass().getSuperclass());
		return doctor;
	}


     
	

	 
}





