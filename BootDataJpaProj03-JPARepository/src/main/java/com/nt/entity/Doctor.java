package com.nt.entity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="JPA_DOCTOR")
@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    
    @Id
    @Column(name="DOCTOR_ID")
    @SequenceGenerator(name="gen1", sequenceName="DID_SEQ", allocationSize=1, initialValue=100)
    @GeneratedValue(generator="gen1", strategy=GenerationType.SEQUENCE)
    private Integer did;

    @NotNull
    @Column(name="DOCTOR_NAME", length=30)
    private String dname;

    @NotNull
    @Column(name="DOCTOR_QLFY", length=30)
    private String qlfy;

    @NotNull
    @Column(name="DOCTOR_INCOME")
    private Long income;

    @NotNull
    @Column(name="DOCTOR_MOBILENO")
    private Long mobileNo;

    @NotNull
    @Column(name="DOCTOR_SPECIALIZATION")
    private String specialization;
    
    public Doctor() {
    	System.out.println("Doctor::0-param Constructor::"+this.getClass());
    	
    }
}
