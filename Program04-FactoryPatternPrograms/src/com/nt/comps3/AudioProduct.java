package com.nt.comps3;

public class AudioProduct implements Product{

	@Override
	public String productName() {
		System.out.print("Audio Product:");
		return "Mobile";
	}
}
