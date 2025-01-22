package com.nt.ston;

public class Printer {

	private static Printer INSTANCE;
	
	//private constructor
	private Printer() {
		System.out.println("Printer::0-param constructor");
	}
	
	//static factory method having singleton logic
	public static Printer getInstance() {
		
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}
	
	//Business Method
	public void printMessage(String msg){
		System.out.println(msg);
	}
}
