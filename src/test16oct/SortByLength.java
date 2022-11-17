package test16oct;

import java.util.Arrays;

//5.	How to sort String on their length.
public class SortByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "I Love UK Country";
String s1[]= s.split(" ");
Arrays.sort(s1, (b,a) -> Integer.compare(a.length(), b.length()));
//System.out.println(Arrays.toString(s1));
StringBuilder s2 = new StringBuilder("");
for (int i=0;i<s1.length;i++) {
	s2.append(s1[i]+ " ") ;
}
System.out.println(s2);

	}

}
