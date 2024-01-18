package simpleprograminjava;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfiles {
	public static void main(String[]args) {
		try {
			File obj = new File("C:\\Users\\Lenovo\\Desktop\\New folder\\sample.txt");
			Scanner myfile = new Scanner(obj);
			while(myfile.hasNextLine()) {
				String data = myfile.nextLine();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
	}

}
