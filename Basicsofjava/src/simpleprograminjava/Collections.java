package simpleprograminjava;
import java.util.ArrayList;

public class Collections {
	public static void main(String[]args) {
		ArrayList<String> color = new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("rose");
		color.add("orange");
		//color.set(2,"pink");
		color.remove(1);
		System.out.println(color);
		System.out.println( color.get(0));
	}

}
