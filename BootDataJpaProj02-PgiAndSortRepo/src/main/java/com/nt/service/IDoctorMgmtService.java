package com.nt.service;

import com.nt.entiry.Doctor;

public interface IDoctorMgmtService {

	public Iterable<Doctor> showAllDoctorsBySortion(boolean ascOrder,String ...props);
}
