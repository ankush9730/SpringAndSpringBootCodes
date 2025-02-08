package com.nt.main.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle
{
	//HAS-A Property
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	public Vehicle()
	{
		System.out.println("Vehicle 0-param Constructor)");
	}
	 
	//b.method
	public void journey(String sourcePlace,String destPlace)
	{
		System.out.println("Vehicle-Journey");
		engine.start();
		
		System.out.println("Journey started at::"+sourcePlace);
		System.out.println("Journey is going on.....");
		engine.stop();
		System.out.println("Journey stopped at::"+destPlace);
	}

}
