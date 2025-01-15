package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	private LocalTime lt;
	private LocalDate ld;
	

	//Constructor injection
	
	@Autowired
	public WishMessageGenerator(LocalTime lt,LocalDate ld) {
		this.lt=lt;
		this.ld=ld;
	}
	
	
	
	//Business Logic Method
	public String getWishMessage(String user) {
		int hour=lt.getHour();
		int date=ld.getDayOfMonth();
		System.out.println("Today's date is: "+date);
		
		if(hour<12)
			return "Good Morining: "+user;
		else if(hour<16)
			return "Good Afternoon: "+user;
		else if(hour<20)
			return "Good Evvening: "+user;
		else
			return "Good Night: "+user;
	}
}
