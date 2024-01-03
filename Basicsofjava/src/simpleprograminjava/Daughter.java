package simpleprograminjava;

public class Daughter extends Father {
	public void education() {
		System.out.println("IT");
	}
	
	public static void main(String[]args) {
		Daughter obj = new Daughter();
		obj.bussiness();
		obj.vechile();
		obj.education();
	}

}
