package simpleprograminjava;
import java.util.HashMap;

public class Maphashcollection {
	public static void main(String[]args){	
	HashMap<String,String> cont = new HashMap<String,String>();
	cont.put("india","delhi");
	cont.put("goa","ooty");
	cont.put("korea","soeal");
	cont.remove("goa");
	cont.replace("india","londen");
	System.out.println(cont);
	System.out.println(cont.get("soeal"));
	
	}
}
