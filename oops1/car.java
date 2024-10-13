package oops1;

public class car extends Vehicle {
	String name ="lambo";
	void start() {
		System.out.println(name+"car is stating");
	}
	static void drive() {
		System.out.println("car is driving");
	}
	void stop() {
		System.out.println(name+"car is stop");
	}

}
