package test16oct;

import java.util.Arrays;

public class LongestWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "i love my country";
		String[] s2 = s1.split("\\s");
		Arrays.sort(s2, (a, b) -> Integer.compare(a.length(), b.length()));
		System.out.println(Arrays.toString(s2));
		System.out.println(s2[s2.length - 1]);
	}
}
