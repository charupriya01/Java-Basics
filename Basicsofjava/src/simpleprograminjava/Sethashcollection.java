package simpleprograminjava;
import java.util.HashSet;


public class Sethashcollection {
	public static void main(String[]args) {
		HashSet<String> color = new HashSet<String>();
		color.add("pink");
		color.add("brown");
		color.add("yellow");
		
		System.out.println(color);
		System.out.println(color.contains("red"));
		
	
	}
}
