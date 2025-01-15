package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	
	private LocalTime lt;
	private LocalDate ld;
	
	@Autowired		//Setter injection
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}
	@Autowired
	public void setLd(LocalDate ld) {
		this.ld = ld;
	}
	
	public String getWishMessage(String user) {
		int hour=lt.getHour();
		int date=ld.getDayOfMonth();
		System.out.println("Today's date is: "+date);
		
		if(hour<12)
			return "Good Morning :"+user;
		else if(hour<16)
			return "Good Afternoon"+user;
		else if(hour<20)
				return "Good Evening"+user;
		else
			return "Good Night"+user;
			
	}
	
	
}
