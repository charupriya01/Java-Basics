package simpleprograminjava;

public class Constructor {
	int x,y ;
   public Constructor() {
	   x=4;
	   y=5;
   }
	public static void main(String[]args) {
		Constructor obj = new Constructor();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}
