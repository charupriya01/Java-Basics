package simpleprograminjava;

public class Smethod {
	public static void main(String[]args) {
		String color = "pink";
		char result = color.charAt(0);
		System.out.println(result);
		
		String first = "priya";
		String last = "tn";
		String results = first.concat(last);
		System.out.println(results);
		
		String third = "laddu";
		System.out.println(third.contains("l"));
		System.out.println(third.contains("e"));
		
		String five = "black is always my fav color";
		System.out.println(five.indexOf("is"));
		
		String six = "black is always my fav color";
		System.out.println(six.toLowerCase());
		System.out.println(six.toUpperCase());
		System.out.println(six.length());
		
		String name1 = "";
		String name2 = "priya";
		System.out.println(name1.isEmpty());
		System.out.println(name2.isEmpty());
		
		String eight = "red is my fav color";
		System.out.println(eight.replace("red","rose"));
		System.out.println(eight.replaceAll("red","rose"));
		System.out.println(eight.replaceFirst("red","rose"));
		
	}

}
