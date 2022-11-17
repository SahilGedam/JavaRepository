package oct12;

import java.util.Scanner;

public class CharsInString {
public static void countChars(String str) {
	int count =0;
	for (int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		count++;
	}
	System.out.println(count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter string");
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
CharsInString.countChars(s);
	}

}
