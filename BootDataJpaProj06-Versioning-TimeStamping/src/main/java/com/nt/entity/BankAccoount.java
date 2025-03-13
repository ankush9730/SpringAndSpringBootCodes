package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//Bank Account.java
@Entity
@Table(name="BANK_ACCOUNT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class BankAccoount {
 
	@Id
	@SequenceGenerator( name="gen1",sequenceName = "ACNO_SEQ",initialValue = 100000,allocationSize = 1)
	@GeneratedValue 
	private Long acno;
	
	@Column(length=20)
	@NonNull
	private String holderName;
	
	@NonNull
	private Double balance;
	
	@Column(length=20)
	@NonNull
	private String bankName;
	
	@Column(length=10)
	@NonNull
	private String accountType;
	
	//For Versioning
	@Version
	private Integer updateCount;
	
	@CreationTimestamp
	@Column(insertable=true)
	private LocalDateTime openedOn;
	
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDateTime LastupdatedOn;
	
	
}
