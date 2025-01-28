package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value="com/nt/commans/Info.Properties")
public class PersonInfo {

	//injecting the values of properties file to spring bean properties
	@Value("${per.id}")
	private Integer id;
	
	@Value("${per.name}")
	private String name ;
	
	@Value("${per.addrs}")
	private String addrs;
	
	/*
	 * //inject direct value to spring bean properties
	 * 
	 * @Value("${per.7896541350}") private Long mobileNo;
	 */
	
	//injecting the System property values
	@Value("${path}")
	private String path_data;

	@Override
	public String toString() {
		return "PersonInfo [pid=" + id + ", name=" + name + ", addrs="
				+ ", path_data=" + path_data + "]";
	}
	
	
}
