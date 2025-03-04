package com.nt.entiry;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Entity
//@NoArgsConstructor
@AllArgsConstructor
@Table(name="JPA_DOCTOR")
@Data
@RequiredArgsConstructor
public class Doctor{
	@Id
	@Column(name="DOCTOR_ID")
	@SequenceGenerator(name="gen1",sequenceName = "DID_SEQ",allocationSize = 1,initialValue = 100)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer did;
	
	
	@Column(name="DOCTOR_NAME",length=30)
	@NonNull
	private String dname;
	
	@Column(name="DOCTOR_QLFY",length=30)
	@NonNull
	private String qlfy;
	
	@Column(name="DOCTOR_INCOME")
	@NonNull
	private Long income;
	
	@Column(name="DOCTOR_MOBILENO")
	@NonNull
	private Long mobileNo;
	
	@Column(name="DOCTOR_SPECIALIZATION")
	@NonNull
	private String sprcialization;
	
 
	
	
}
