package com.nt.sbeans;
import java.time.LocalTime;

 
public class WishMessageGenerator {

	private LocalTime lt;
	 
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}

	
	//Business Method
	public String generateWishMessage(String user) {
		
		int hour=lt.getHour();
		
		
		if(hour<12)
			return "Good Morning: "+user;
		
		else if(hour<16)
			return "Good Afternoon: "+user;
		
		else if(hour<20)
			return "Good Evening: "+user;
		
		else
			return   "Good Nigth: "+user;
	}

	
}
