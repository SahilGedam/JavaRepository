package oct12;
import java.util.*;
public class WordsReverse {
public static void reverse() {
	String str= " i love shahrukh khan";
	String r=" ";
	int count =0;
	String s []= str.split(" ");
//	System.out.println(Arrays.toString(s));
	for (int i=0;i<s.length; i++) {
		String word= s[i];
		s[i]=s[count];
		count++;
		if(s[i]==s[0] || s[i]==s[s.length-1]) {
			for (int j=0;j<word.length();j++) {
				r= r+word.charAt(j);
			}
			r=r+" ";
		}
		else {
			for (int j=word.length()-1;j>=0;j--) {
				r= r+word.charAt(j);
				
			}
			r=r+" ";
		}
	}
	System.out.println("reverse of string "+ r);
	System.out.println("count of words "+ count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WordsReverse.reverse();
	}

}
