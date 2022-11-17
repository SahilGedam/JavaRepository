package oct12;

//  complete
import java.util.*;

public class SumOfFirstAndLastDigits {
	public static void sumFandL(String s) {
		int countNum = 0;
		int countChar = 0;
		int sum = 0;
		int sum2 = 0;
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > '9' || ch[i] < '0') {

				countNum++;
			} else {
				countChar++;
			}
		}
		if (countNum > 0) {
			System.out.println("error");
		} else {
			System.out.println("numeric");
			int[] a = new int[ch.length];
			for (int i = 0; i < ch.length; i++) {
				a[i] = Character.getNumericValue(ch[i]);

			}
			for (int i = 0; i < 3; i++) {
				sum = sum + a[i];
			}
			for (int i = a.length - 1; i > a.length - 4; i--) {
				sum2 = sum2 + a[i];
			}
			System.out.println("sum of first 3 digits "+sum);
			System.out.println("sum of last 3 digits "+sum2);
			if (sum == sum2) {
				System.out.println("valid string");
			} else {
				System.out.println("invalid string");
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  string");
		String s = sc.next();
		sumFandL(s);
	}

}
