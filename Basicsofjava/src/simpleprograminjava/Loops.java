package simpleprograminjava;

public class Loops {
	public static void main(String[]args) {
		
		int i=0;
		while(i<=15) {
			System.out.println(i);
			i++;
		}
		int e=16;
		do {
			System.out.println(e);
			e++;
		}while(e<=15);
		
		for(int b=0;b<=15;b++) {
			System.out.println(b);
		}
		
		for(int l=0;l<=10;l++) {
			if(l==4) {
				break;
			}
			System.out.println(l);
		}
		
		for(int h=0;h<=10;h++) {
			if(h==4) {
				continue;
			}
			System.out.println(h);
		}
		
		int year = 2002;
		if(year%4 == 0 ||year%400==0) {
			System.out.println("its a leep year");
			
		}else {
			System.out.println("its not a leep year");
		}
		
		// even numbers
		int m=0;
		for(m=0;m<=30;m++) {
		if(m%2==0) {
			System.out.println(m);
		}
		}
		
	}
	

}
