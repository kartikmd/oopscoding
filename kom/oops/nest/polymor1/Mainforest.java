package kom.oops.nest.polymor1;

public class Mainforest {
	public static void main(String[] args) {
		forest f1 = new forest();
		f1.acceptanimal(new tiger());
		System.out.println("");
		f1.acceptanimal(new monkey());
		System.out.println("");
		f1.acceptanimal(new deer());
	}

}
