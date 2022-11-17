package test16oct;

import oct12.WordsReverse;

public class ReverseQ4 {
	public static void reverse() {
		String s="Hi how are you students";
		String r =" ";
		String s1 []= s.split(" ");
		for (int i =0; i<s1.length;i++) {
			String word = s1[i];
			if (s1[i]==s1[0] || s1[s1.length-1]== s1[i]) {
				for (int j=0;j<word.length();j++) {
					r= r+word.charAt(j);
				}
				r=r+" ";
			}
			else {
				for (int j =word.length()-1;j>=0;j--) {
					r= r+ word.charAt(j);
				}
				r=r+" ";
			}
		}
		System.out.println(r);
	}
	public static void main (String []args) {
		reverse();
	}
}
