package sept26;

import java.util.*;

public class ArrayMin {
	public static char minChar(char ch[]) {
		char min = ch[0];
		for (int i = 0; i < ch.length; i++) {
			if (min > ch[i]) {
				min = ch[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[5];
		System.out.println("enter char elements");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = sc.next().charAt(0);
		}
		System.out.println(ArrayMin.minChar(ch));
	}

}
