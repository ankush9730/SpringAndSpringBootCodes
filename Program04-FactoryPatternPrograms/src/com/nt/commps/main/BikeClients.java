package com.nt.commps.main;

import com.nt.commps.Bike;
import com.nt.commps.FactoryClasses.BikeFactory;

public class BikeClients {

	public static void main(String[] args) {

		Bike bike1=BikeFactory.getBike("Sport Bike");
		bike1.ride();
		
		Bike bike2=BikeFactory.getBike("Bullet Bike");
		bike2.ride();
		
		Bike bike3=BikeFactory.getBike("Splander Bike");
		bike3.ride();
		
	}

}
