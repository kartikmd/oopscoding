package oops1;

public class planeAPP {
	public static void main(String[] args) {
		plane ref;
		ref=new cargoplanes();
		ref.takeoff();
		ref.fly();
		ref.land();
		((cargoplanes) ref).carrycargo();
		System.out.print("");
		
		ref=new passengerplane();
		ref.takeoff();
		ref.fly();
		ref.land();
		((passengerplane) ref).carrypassenger();
		System.out.print("");
		
		ref=new fighterplane();
		ref.takeoff();
		ref.fly();
		ref.land();
	    ((fighterplane) ref).carryArms();
	    System.out.print("");	
	}

}
