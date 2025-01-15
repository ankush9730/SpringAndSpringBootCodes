package com.nt.comps3;

public class DisplayProduct implements Product{
	@Override
	public String productName() {
		System.out.print("Displaying Product:");
		return "Tv";
	}

}
