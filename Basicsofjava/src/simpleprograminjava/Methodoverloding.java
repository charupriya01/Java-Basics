package simpleprograminjava;

public class Methodoverloding {
	public void student(int id) {
		System.out.println(id);
		}
	public void student(String name) {
		System.out.println(name);
		}
	public void student(float salary) {
		System.out.println(salary);
		}
	public static void main(String[]args) {
		Methodoverloding obj = new Methodoverloding();
		obj.student(22);
		obj.student("priya");
		obj.student(30000);
		
	}

}
