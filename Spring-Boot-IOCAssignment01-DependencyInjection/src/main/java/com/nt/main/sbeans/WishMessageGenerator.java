package com.nt.main.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired
	private LocalTime lt;
	
	public String getMessage(String user) {
		int time=lt.getHour();
		
		if(time<12)
			return "Good Morning "+user;
		else if(time<16)
			return "Good Afternoon "+user;
		else if(time<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}
}
