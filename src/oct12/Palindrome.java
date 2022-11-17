package oct12;

import java.util.*;

public class Palindrome {
//complete
	public static void pal(String str) {
		StringBuffer b = new StringBuffer(str);
		b.reverse();
		String s= b.toString();
		if (str.equals(s)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("non palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("enter string");
String s = sc.next();
pal(s);
	}

}
