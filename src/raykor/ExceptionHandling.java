package raykor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//class NewException extends Throwable{
//	
//}
public class ExceptionHandling {
	public static void show() throws FileNotFoundException , NullPointerException{
		//System.out.println("hii");
		FileInputStream fn = new FileInputStream ("file.txt"); 
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ExceptionHandling.show();
		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
