package com.nt.comps3;

public class ProductFactory {

	public static Product getProduct(String productType) {
		
		if(productType.equalsIgnoreCase("Audio Product"))
			return new AudioProduct();
		else if(productType.equalsIgnoreCase("Display Product"))
			return new DisplayProduct();
		else if(productType.equalsIgnoreCase("Playing Product"))
			return new PlayingProduct();
		else
			return null;
	}
}
