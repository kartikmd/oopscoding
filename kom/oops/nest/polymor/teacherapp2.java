package kom.oops.nest.polymor;

public class teacherapp2 {
	public static void main(String[] args) {
		collage c1 = new collage();
		c1.acceptteacher(new physicsteacher());
		c1.acceptteacher(new chemistryteacher());
		c1.acceptteacher(new biologyteacher());
	}
}
		