package nov15;
import java.io.*;
import java.util.*;

// checked exception propsgstion

public class ExceptionHandling4 {
	String name;
	Scanner sc = new Scanner (System.in);
 void acceptName() {
	 try {
	System.out.println("enter name");
	name = sc.next();
	System.out.println(name.length());
	if(name.length()<3) {
		throw new InputMismatchException("name must be in 3 letters");
	}
	 }
	catch (InputMismatchException e) {
		System.out.println(e.getMessage());
	
	}
	 System.out.println("name is"+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling4 o = new ExceptionHandling4 ();
		o.acceptName();
	}

}
