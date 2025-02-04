package com.nt.main.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("sf")
public class FindSeason {


	public FindSeason() {
	 System.out.println("FindSeason 0-paramConstructor");	 
	}

	@Autowired
	private LocalDate ld;
	
	public String getMessage(String user) {
		int month=ld.getMonthValue();
		
		if(month>=3&&month<=6)
			return "Summer Season";
		else if(month>=7&&month<=10)
			return "Rainy Season";
		else
			return "Winter Season";
	}
}
