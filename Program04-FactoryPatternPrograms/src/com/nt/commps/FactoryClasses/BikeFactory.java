package com.nt.commps.FactoryClasses;

import com.nt.commps.Bike;
import com.nt.commps.BulletBike;
import com.nt.commps.SplanderBike;
import com.nt.commps.SportBike;

public class BikeFactory {

	public static Bike getBike(String bikeType) {

		if (bikeType.equalsIgnoreCase("Sport Bike"))
			return new SportBike();
		
		else if (bikeType.equalsIgnoreCase("Bullet Bike"))
			return new BulletBike();
		
		else if (bikeType.equalsIgnoreCase("Splander Bike"))
			return new SplanderBike();
		
		else
			return null;
	}
}
