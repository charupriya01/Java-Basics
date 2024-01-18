package simpleprograminjava;
import java.io.IOException;
import java.io.FileWriter;

public class Writefile {
	public static void main(String[]args) {
		try {
			FileWriter obj = new FileWriter("C:\\Users\\Lenovo\\Desktop\\New folder\\sample.txt");
			obj.write("this is a normal program file");
			obj.close();
			
		}catch (IOException e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		
	}

}
