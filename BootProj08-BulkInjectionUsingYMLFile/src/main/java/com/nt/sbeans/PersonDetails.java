//PersonDetails.java
package com.nt.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "per.info")
@Component("pDetails")
@Data
//@Setter
public class PersonDetails {
	//@Value("${my.info.name}")
	private String  name;
	private  String addrs;
	private  Long mobileno;
	private  Integer age;
	private   Double salary;
	private   String[]  nickNames;
	private   List<String> friends;
	private   Set<Long> phones;
	private  Map<String,Object>  idDetails;
	private  Company comp;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String[] getNickNames() {
		return nickNames;
	}
	public void setNickNames(String[] nickNames) {
		this.nickNames = nickNames;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<Long> getPhones() {
		return phones;
	}
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	public Map<String, Object> getIdDetails() {
		return idDetails;
	}
	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}
	public Company getComp() {
		return comp;
	}
	public void setComp(Company comp) {
		this.comp = comp;
	}
	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", addrs=" + addrs + ", mobileno=" + mobileno + ", age=" + age
				+ ", salary=" + salary + ", nickNames=" + Arrays.toString(nickNames) + ", friends=" + friends
				+ ", phones=" + phones + ", idDetails=" + idDetails + ", comp=" + comp + "]";
	}
	
	
	
	
	
	

}
