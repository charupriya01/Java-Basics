package simpleprograminjava;
import java.io.File;
public class Deletefile {
	public static void main(String[]args) {
	File myobj = new File("C:\\Users\\Lenovo\\Desktop\\New folder\\sample.txt");
	 if(myobj.delete()) {
		 System.out.println("file deleted");
	 }else {
		 System.out.println("error occured");
	 }
	}
}
