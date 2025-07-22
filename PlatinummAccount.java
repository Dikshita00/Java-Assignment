package com.polymorphism;

public class PlatinummAccount extends GoldAccount{
	@Override
	public void rateOfInterest() {
		System.out.println("6%");
	}
	public static void main(String[] args) {
		PlatinummAccount p=new PlatinummAccount();
		p.onlineBanking();
		p.rateOfInterest();
		
		GoldAccount g=new GoldAccount();
		g.rateOfInterest();
		g.onlineBanking();
	}

}
