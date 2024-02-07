package simpleprograminjava;

public class Functions {
	public int addition(int a, int b) {
		return a+b;
	}
	public int subraction(int a, int b) {
		return a-b;
	}
	public int multiplication(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	
	public static void main(String[]args) {
		Functions obj = new Functions();
		int add = obj.addition(6,7);
		int sub = obj.subraction(9,7);
		int multi = obj.multiplication(3,4);
		int divi = obj.division(6,2);
		
		System.out.println(divi);
	}
}
