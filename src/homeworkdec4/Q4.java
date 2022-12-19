package homeworkdec4;

//4) Write a java program to Remove duplicate elements from ArrayList
import java.util.*;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("akshay");
		al.add("salman");
		al.add("hritik");
		al.add("salman");
		al.add("akshay");
		System.out.println(al);

		// ArrayList<String> al2 = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			// String al3 = al.get(i);
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i) == al.get(j)) {
					al.remove(j);
				}
			}
		}
		System.out.println(al);
	}
}
