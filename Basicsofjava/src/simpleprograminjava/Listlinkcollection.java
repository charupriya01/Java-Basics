package simpleprograminjava;
import java.util.LinkedList;

public class Listlinkcollection {
	public static void main(String[]args) {
	LinkedList<String> color = new LinkedList<String>();
	color.add("pink");
	color.add("brown");
	color.add("yellow");
	color.addFirst("black");
	color.addLast("peach");
	color.removeFirst();
	color.removeLast();
	System.out.println(color);
	
	
	}

}
