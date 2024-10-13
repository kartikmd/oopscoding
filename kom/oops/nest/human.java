package kom.oops.nest;

public class human {
	String name="karthik naik";
	int age = 22;
	String gender="male";
	//human ref;
	void eating() {
		System.out.println(name+"eating the food");
	}
	void working() {
		System.out.println(name+"do the working at the age of"+age);
	}
    heart h = new heart();
    
    void acceptbike(Bike ref) {
    	System.out.println(ref.brand+"bike is stating And the bike cost is"+ref.cost);
    }
}
