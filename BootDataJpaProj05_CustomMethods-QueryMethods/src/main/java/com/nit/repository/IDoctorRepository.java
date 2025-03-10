package com.nit.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {
	//@Query("FROM Doctor")
	//@Query("FROM Doctor doc")
	//@Query("FROM Doctor as doc")
	@Query("SELECT doc FROM Doctor as doc")
	public List<Doctor> showAllDoctors();
	
//	@Query("from Doctor whe"re specialization in(?1,?2,?3)order by specialization asc")
//	 public List<Doctor> showAllDoctorsBySpecilizations(String speiality1,String speiality2,String speiality3);
	
	@Query("from Doctor where specialization in(:special1,:special2,:special3)order by specialization asc")
	public List<Doctor> showAllDoctorsBySpecilizations(@Param("special1")String speiality1,
			                                           @Param("special2")String speiality2,
			                                           @Param("special3")String speiality3); 
}
