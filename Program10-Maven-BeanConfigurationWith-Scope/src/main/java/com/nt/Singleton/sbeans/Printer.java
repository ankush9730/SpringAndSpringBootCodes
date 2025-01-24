package com.nt.Singleton.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singletone")
public class Printer {

	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer::0-param Constructor");
	}
	
	public static Printer  getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}
	public void printMessage(Printer msg) {
		
		System.out.println(msg);
	}
}
