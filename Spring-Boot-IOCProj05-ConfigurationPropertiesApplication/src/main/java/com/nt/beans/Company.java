package com.nt.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

 
@ConfigurationProperties(prefix="org.nit") // Reads properties from application.properties
@Component("comp")
public class Company {
    private String name;
    private String addrs;
    private Long pincode;
    private Long contact;
	public String getName() {
		return name;
	}
	public String getAddrs() {
		return addrs;
	}
	public Long getPincode() {
		return pincode;
	}
	public Long getContact() {
		return contact;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Company [name=" + name + ", addrs=" + addrs + ", pincode=" + pincode + ", contact=" + contact + "]";
	}
	
    
    
}
