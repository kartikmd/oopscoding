package com.kodnest.Abstract;

public class planeApp {
	public static void main(String[] args) {
		Airport a1 = new Airport();
		a1.acceptplane(new passangerplane());
		a1.acceptplane(new cargoplane());
		a1.acceptplane(new fighterplane());
		
	}

}
