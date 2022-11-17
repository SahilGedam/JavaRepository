package oct12;

import java.util.*;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
String s1= "hello";
String s2 = "hello world";
String s3 = "Hello World";
String s4 = "Hello World";
System.out.println(s4.indexOf('o'));
System.out.println(s4.indexOf("el"));
// compare to
if(s3.compareTo(s4)==0) {
	System.out.println("equal");
}
if(s3.compareTo(s4)<0) {
	System.out.println("smaller");
}
if(s2.compareToIgnoreCase(s4)==0) {
	System.out.println("equal");
}
//substring(startidx,endidx)
System.out.println("substring "+ s4.substring(3, 7));
// last index of
System.out.println("last index of l "+ s4.lastIndexOf('l'));
// uppercase
System.out.println("uppercase "+ s2.toUpperCase());
	}
	

}
