package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("vec")
public class VotingElgibilityChecking {
	@Value("${voting.name}")
	private String  name;
	@Value("${voting.age}")
	private  float  age;
	@Value("${voting.verifiedBy}")
	private  String verifiedBy;
	private   LocalDateTime  verifiedOn;
	
	static {
		System.out.println("VotingElgibilityChecking:static block");
	}
	
	public VotingElgibilityChecking() {
		System.out.println("VotingElgibilityChecking:: 0-param constructor");
	}
	
	@PostConstruct
	public void myInit() {
		System.out.println("VotingElgibilityChecking.myInit()");
		// initialize  left over properties
		verifiedOn=LocalDateTime.now();
		//check wheather important properites  are injected with correct values or not
		if(age<=0 || name==null)
			throw new IllegalArgumentException("Invalid Inputs for name , age");
		
	}
	
	
	//b.method
	public  String   checkVotingElgibility() {
		System.out.println("VotingElgibilityChecking.checkVotingElgibility()");
		if(age>=18)
			return  "Mr/Miss/Mrs."+name +"  u r  elgible for Voting verified by-"+verifiedBy+" VerifiedOn::"+verifiedOn;
		else
			return  "Mr/Miss/Mrs."+name +"  u r not elgible for Voting verified by-"+verifiedBy+" VerifiedOn::"+verifiedOn;
				
	}
	
	
	@PreDestroy
	public  void   myDestroy() {
		System.out.println("VotingElgibilityChecking.myDestroy()");
		//nullify  spring bean  properites
		name=null;
		age=0;
		verifiedBy=null;
		verifiedOn=null;
	}
	

}
