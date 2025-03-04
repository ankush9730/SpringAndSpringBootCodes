package com.nt.service;

import com.nt.entity.Doctor;

public interface IDoctorManagmentService {

	public String registrDoctor(Doctor doctor);
	public long showDoctorsCount();
	public String registerDoctorsAsGroup(Iterable<Doctor>list);
	public String checkDoctorAvailabilityById(int id);
	public Iterable<Doctor> findAllDoctors();
	public Iterable<Doctor> findAllByIds(Iterable<Integer>ids);
	public Doctor showDoctorById(int id);
	public String fetchDoctorById(int id);
	public Optional<Doctor> getDoctorById(int id);
	public String registerOrUpdateDoctor(Doctor doctor);
	public String removeAllDoctors();
	public String removeAllDoctorsById(Iterable<Integer> ids);
	public String removeDoctorByID(int id);
}
