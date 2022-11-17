package test1oct;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };
		for (int i = 0; i < a.length; i++) {
			int p = (int) (Math.sqrt(a[i]));
			// System.out.println(p);
			if (p * p == a[i]) {
				System.out.println(a[i]);
			}
		}

	}

}
