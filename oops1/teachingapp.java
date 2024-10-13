package oops1;

public class teachingapp {
	public static void main(String[] args)
	
	{
		teacher t1=new teacher();
		chemistryteacher c1=new chemistryteacher();
		t1.markAttendance();
		c1.teach();
		c1.doexper();
		
		physicsteacher p1= new physicsteacher();
		t1.markAttendance();
		p1.teach();
		p1.doexper();
		
		biologyteacher b1=new biologyteacher();
		t1.markAttendance();
		b1.teach();
		b1.doexperi();
	}
}
