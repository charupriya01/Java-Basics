package simpleprograminjava;

public class Conditional {
	public static void main(String[]args) {
		int age=21;
		if (age>22) {
			System.out.println("allow to donate blood");
		}else if(age==20){
			System.out.println(" allow to donate blood");
		}else {
			System.out.println("dont allow to donate blood");
		}
		
		int day=4;
		switch(day) {
		case 1:
			System.out.println("mon");
			break;
		case 2:
			System.out.println("tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thurs");
			break;
		case 5:
			System.out.println("fri");
			break;
		}
	}
}
