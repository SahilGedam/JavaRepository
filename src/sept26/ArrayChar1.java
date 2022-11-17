package sept26;

import java.util.*;

public class ArrayChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter chars");
		char c[] = new char[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < c.length; i++) {
			c[i] = (char) (c[i] + 2);
			System.out.println(c[i]);
		}
	}
}
