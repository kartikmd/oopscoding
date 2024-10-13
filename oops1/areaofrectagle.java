package oops1;

import java.util.Scanner;

public class areaofrectagle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		String choice= sc.nextLine();
		sulthan s1= new sulthan();
		switch(choice) {
		case "rectangle":
			System.out.println("enter the number");
			double lenght=sc.nextDouble();
			System.out.println("enter the another number");
			double width = sc.nextDouble();
			double res1=s1.areaof(lenght,width);
			System.out.println("The area of rectangle is "+res1);
			break;
		case "Circle":
			System.out.println("enter the number");
			double radius=sc.nextDouble();
			double res2=s1.Circle(radius);
			System.out.println("The area of Circle is "+res2);
			break;
		default:
			System.out.println("Invalid number");
		}
		
	

}
}
class sulthan{
public static double areaof(double lenght ,double width) {
	
	return lenght * width;
	
}
public static double Circle(double radius) {
	return Math.PI * radius* radius;
}
}

