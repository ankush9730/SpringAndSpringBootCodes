package com.nt.comps3;

public class ProductClients {

	public static void main(String[] args) {

		Product audioprodudct=ProductFactory.getProduct("Audio Product");
		System.out.println(audioprodudct.productName());
		
		Product displayproduct=ProductFactory.getProduct("Display Product");
		System.out.println(displayproduct.productName());
		
		Product playingproduct=ProductFactory.getProduct("Playing Product");
		System.out.println(playingproduct.productName());
	}

}
