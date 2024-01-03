package simpleprograminjava;

public class Hdfc extends Bank {
	public void Salary() {
		System.out.println("salary account");
	}
	public void Current() {
		System.out.println("current account");
	}
public static void main(String[]args) {
	Hdfc obj = new Hdfc();
	obj.Current();
	obj.Salary();
	obj.Savings();
}

}
