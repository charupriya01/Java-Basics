package simpleprograminjava;

public class Tasks {
   public void pyramid() {
	   for(int i=1; i<=5; i++) {
	   for(int j=1; j<5-1; j++);{
	    System.out.println("");
	   }
	   for(int k=1; k<=2 * i -1; k++) {
		   System.out.println("*");
	   }
	   System.out.println();
   }
	   public static void main(String[]args) {
		   Tasks obj = new Tasks();
		   obj.pyramid();
	   }
   }
}

