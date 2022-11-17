package oct12;
import java.util.*;
public class Pattern {
public static void pattern (String str) {
	String s1 [] = str.split(" ");
	//System.out.println(s1[2]);
	//System.out.println(Arrays.toString(s1));
	for (int i =0;i<s1.length;i++) {
		for (int j =0; j<=i;j++) {
			System.out.print(s1[j]);
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "i love india country";
pattern(str);
	}

}
