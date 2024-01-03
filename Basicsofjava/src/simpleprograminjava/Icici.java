package simpleprograminjava;

public class Icici implements Banks {
public void salary() {
	System.out.println("salary account");
}
public void savings() {
	System.out.println("savings account");
}
public void current() {
	System.out.println("current account");
}
public static void main(String[]args) {
	Icici obj = new Icici();
	obj.current();
	obj.salary();
	obj.savings();
}
}
