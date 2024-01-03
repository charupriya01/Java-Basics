package simpleprograminjava;
import java.util.Scanner;
public class Third {
	public static void main(String[]args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the name");
		String name = obj.nextLine();
		System.out.println("user name is:" +name);
		System.out.println("enter the age");
		int age=obj.nextInt();
		System.out.println("user age is: " + age);
	}

}
