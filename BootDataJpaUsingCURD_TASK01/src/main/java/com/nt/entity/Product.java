package com.nt.entity;

import io.micrometer.common.lang.Nullable;
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
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
@Table(name="JPA_PRODUCT")
public class Product {

	@Id
	@Column(name="ID")
	@SequenceGenerator(name="gen1",sequenceName = "PID_SEQ",allocationSize = 1,initialValue = 1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
		private Integer productId;
	
	@Column(name="NAME")
	@Nullable
	private String prodcName;
	
	@Column(name="DESCRIPTION")
	@Nullable
	private String Peoductdescription;
	
	@Column(name="PRICE")
	@Nullable
	private Double Productprice;
	
}
