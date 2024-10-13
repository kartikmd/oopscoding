package kom.oops.nest;

public class Student1 extends human {
	String id ="s12345";
	int marks =79;
	String adregates="pass";
	int phon=1234566879;
	void reading(human ref) {
		System.out.println(ref.name+"is reading the book");
	}
	brain1 b = new brain1();
	void acceptcar1(Car1 ref) {
		System.out.println(ref.brand+"starting");
		
	}

}
