package kom.oops.nest;

public class student {
	String id = "123adf";
	String name = "karthik";
	String email = "karthikmd81@gmail.com";
	int marks = 100;
	Brain brain = new Brain();
	void acceptbook(books ref) {
		System.out.println(ref.auther+"enhance the book by using"+ref.cost);
	}
		
	}
	
	