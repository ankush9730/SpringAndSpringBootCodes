package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nit.entity.Doctor;
import com.nit.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorManagementService {

	@Autowired
	private IDoctorRepository doctorRepo;

	@Override
	public List<Doctor> findBySpecializationEquals(String speciality) {

		return null;
	}

	 

	 

}
