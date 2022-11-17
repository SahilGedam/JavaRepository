package oct12;

import java.util.*;

public class WordsInString {
	public static void countWords(String str) {
		
		int count =0;
	//	System.out.println(str);
	String s1[]= str.split(" ");
	//System.out.println(Arrays.toString(s1));
	System.out.println(s1.length);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	WordsInString.countWords(str);
	}

}
