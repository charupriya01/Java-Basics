package simpleprograminjava;

public class Enaum {
	enum Level{
		easy,
		medium,
		hard
	}
	public static void main(String[]args) {
		Level med = Level.medium;
		Level eas = Level.easy;
		   
		System.out.println(med);
		System.out.println(eas);
	}

}
