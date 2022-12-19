package homeworkdec4;

import java.util.*;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] a = {4, 6, 5, -10, 8, 5, 20};
//int inputNum=10;
//for(int i =0;i<a.length;i++) {
//	for(int j =i;j<a.length;j++) {
//		if(inputNum-a[i]==a[j]) {
//			System.out.println(a[i]+" "+ a[j]);
//		}
//	}
//}
		Integer[] a1 = { 4, 6, 5, -10, 8, 5, 20 };
		Integer inputNum1 = 10;
		ArrayList<Integer> al = new ArrayList<>();
		Collections.addAll(al, a1);
		for (int i = 0; i < al.size(); i++) {
			for (int j = i; j < al.size(); j++) {
				if (inputNum1 - al.get(i) == al.get(j)) {
					System.out.println(al.get(i) + " " + al.get(j));
				}
			}
		}
	}

}
