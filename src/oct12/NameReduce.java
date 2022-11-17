package oct12;

// complete
import java.util.*;

public class NameReduce {
	public static void reduceName(String str) {
		String[] s = str.split(" ");
	//	System.out.println(Arrays.toString(s));
		for (int i = 0; i < s.length - 1; i++) {
			String word = s[i];
			for (int j = 0; j < 1; j++) {
				char ch = word.charAt(0);
				System.out.print(ch + " ");
				// System.out.print(s[s.length]);
			}

		}
		System.out.print(s[s.length - 1]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("enter string");
		// Scanner sc = new Scanner(System.in);
		// String str = sc.nextLine();
		String str = "Sahil Nandkishor Gedam";
		reduceName(str);
	}

}
