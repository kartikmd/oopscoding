package oops1;

import java.util.Scanner;

public class day1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the another number");
		int b= sc.nextInt();
		day2 day=new day2();
		//ADD,DIV,SUB,MUL
		day.addition(a,b);
		
		day.div(a, b);
		day.sub(a,b);
		day.mult(a, b);
	}

}
class day2{
	
	static void addition(int a, int b) {
		int sum=a+b;
		System.out.println(""+sum);
	}
	static void sub(int a,int b) {
		int sub=a-b;
		System.out.println(""+sub);
	}
	static void mult(int a,int b) {
		int mult=a*b;
		System.out.println(""+mult);
	}
	static void div(int a,int b) {
		float div=a/b;
		System.out.println(""+div);
	}
	
	}

