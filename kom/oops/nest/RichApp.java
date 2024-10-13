package kom.oops.nest;

public class RichApp {
	public static void main(String[] args) {
		human h1 = new human();
		h1.h.working();
		Bike ref = new Bike();
		h1.acceptbike(ref);
		Student1 h2 = new Student1();
		h2.eating();
		h2.b.fu1();
		Car1 car = new Car1();
	    h2.acceptcar1(car);
	    car.e1.good();
		
		
	}

}
