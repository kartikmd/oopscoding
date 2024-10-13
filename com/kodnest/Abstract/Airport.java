package com.kodnest.Abstract;

public class Airport {
	void acceptplane(plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}

}
