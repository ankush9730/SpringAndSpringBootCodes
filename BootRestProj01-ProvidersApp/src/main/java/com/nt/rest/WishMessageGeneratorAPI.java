package com.nt.rest;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-api")//global path --optional
public class WishMessageGeneratorAPI {

	@GetMapping("/wish")
	public ResponseEntity<String> showWishMessage(){
		//Generate the wish message
		LocalDateTime ldt=LocalDateTime.now();
		//get current hour of the day
		int hour=ldt.getHour();
		String msg=null;
		if(hour<12) {
			msg="Good Morning!";
		}
		else if(hour<16)
			msg="Good Afternoon!";
		else if(hour<20)
			msg="Good Evening!";
		else
			msg="Good Night!";
		//return ResponseEntity object
		ResponseEntity<String> resp=
				new ResponseEntity<String>(msg,HttpStatus.OK);
		return resp;
	}
}

 
