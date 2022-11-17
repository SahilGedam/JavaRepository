package practice1d.array;

import java.util.Arrays;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "welcome";
//print the String
System.out.println(s1);
// convert to array
char [] ch = s1.toCharArray();

// print in array
System.out.println(Arrays.toString(ch));
// new StringBuilder
StringBuilder s2 = new StringBuilder ("");
// convert to StringBulder
s2.append(ch);
// print as String
System.out.println(s2);
	}

}
