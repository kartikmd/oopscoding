package kom.oops.nest;

public class studentBrainapp {
	public static void main(String[] args) {
		student s1 = new student();
		System.out.println("name = "+s1.name+"email"+s1.email);
		System.out.println(s1.brain.colour);
		s1.brain.enhance();
		
		books book = new books();
		s1.acceptbook(book);
		s1 = null;
		//System.out.println("name = "+s1.name+"email"+s1.email);
		s1.acceptbook(book);
		
		
	}

}
