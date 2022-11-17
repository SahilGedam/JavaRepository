package practicerough;

import java.util.Arrays;

public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "this is java";
String s2 [] = s1.split(" ");
System.out.println(s2[0].charAt(0) + " "+ s2[1].charAt(0)+ " "+ s2[2]);

String s3 ="mohammadjahangeer1999@gmail.com";
System.out.println(s3.indexOf('@'));
System.out.println(s3.substring(s3.indexOf('@')));

String s4 = "java is Programming";
String s5 [] = s4.split(" ") ;
Arrays.sort(s5, (a,b )-> Integer.compare (a.length(), b.length()));
System.out.println(s5[s5.length-1]);
	}
}
