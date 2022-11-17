package sept26;

import java.util.Scanner;

public class ArraySearch {
	public static boolean searchElements(int a[], int n) {
		boolean isPresent = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				isPresent = true;
				break;
			}
		}
		return isPresent;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int elements");
		int a[] = new int[5];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("num to be searched");
		int num = sc.nextInt();

		boolean isPresent = ArraySearch.searchElements(a, num);
		if (isPresent == true) {
			System.out.println("num is present");
		}
		if (isPresent == false) {
			System.out.println("num is absent");
		}
	}

}
