package com.nit.service;

import java.util.List;

import com.nit.entity.Doctor;

public interface IDoctorManagementService {

public List<Doctor> findBySpecializationEquals(String speciality);

}